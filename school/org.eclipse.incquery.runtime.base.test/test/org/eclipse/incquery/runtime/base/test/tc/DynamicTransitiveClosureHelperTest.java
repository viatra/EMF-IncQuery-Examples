package org.eclipse.incquery.runtime.base.test.tc;

import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.incquery.runtime.base.api.IncQueryBaseFactory;
import org.eclipse.incquery.runtime.base.api.TransitiveClosureHelper;
import org.eclipse.incquery.runtime.base.exception.IncQueryBaseException;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseDynamicParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.DynamicResourceMetamodel;
import org.eclipse.incquery.runtime.base.test.util.DynamicResourceModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicTransitiveClosureHelperTest extends IncQueryBaseDynamicParameterizedTest {

    private TransitiveClosureHelper transitiveClosureHelper;
    private EObject aStudent;
    private EObject bStudent;
    private EObject cStudent;

    public DynamicTransitiveClosureHelperTest(Notifier notifier) {
        super(notifier, false);
    }

    @Override
    @Before
    public void init() throws IncQueryBaseException {
        super.init();
        if (!navigationHelper.isInWildcardMode()) {
            navigationHelper.registerObservedTypes(Collections
                    .singleton(DynamicResourceMetamodel.eINSTANCE.StudentEClass), Collections
                    .singleton(EcorePackage.eINSTANCE.getEString()), Collections
                    .singleton((EStructuralFeature) DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute));
        }
        Set<EReference> refs = new HashSet<EReference>();
        refs.add(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
        transitiveClosureHelper = IncQueryBaseFactory.getInstance().createTransitiveClosureHelper(
                this.navigationHelper, refs);
        aStudent = navigationHelper.findByAttributeValue("Abel Hegedus").iterator().next().getEObject();
        bStudent = navigationHelper.findByAttributeValue("Gabor Bergmann").iterator().next().getEObject();
        cStudent = navigationHelper.findByAttributeValue("Zoltan Ujhelyi").iterator().next().getEObject();
    }

    @Override
    @After
    public void dispose() {
        transitiveClosureHelper.dispose();
        super.dispose();
    }

    /**
     * A transitive closure test with model manipulations. It operates on the friendsWith relation between the students.
     */
    @Test
    public void queryModTest() {
        try {
            assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 2);
            assertTrue(transitiveClosureHelper.getAllReachableTargets(aStudent).size() == 0);

            Command firstCommand = new RecordingCommand(DynamicResourceModel.getInstance().getTransactionalEditingDomain()) {
                @SuppressWarnings("unchecked")
                @Override
                protected void doExecute() {
                    EList<EObject> friendsWith = (EList<EObject>) aStudent
                            .eGet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
                    friendsWith.add(aStudent);
                }
            };
            
            DynamicResourceModel.getInstance().getTransactionalEditingDomain().getCommandStack()
                    .execute(firstCommand);

            assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3
                    && transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));

            Command secondCommand = new RecordingCommand(DynamicResourceModel.getInstance().getTransactionalEditingDomain()) {
                @SuppressWarnings("unchecked")
                @Override
                protected void doExecute() {
                    EList<EObject> friendsWith = (EList<EObject>) aStudent
                            .eGet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
                    friendsWith.add(bStudent);
                }
            };
            DynamicResourceModel.getInstance().getTransactionalEditingDomain().getCommandStack()
                    .execute(secondCommand);

            assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3
                    && transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));

            assertTrue(!transitiveClosureHelper.isReachable(bStudent, cStudent));
        } finally {
            // Undo the previously executed commands to restore the original state of the model
            DynamicResourceModel.getInstance().getTransactionalEditingDomain().getCommandStack().undo();
            DynamicResourceModel.getInstance().getTransactionalEditingDomain().getCommandStack().undo();
        }
    }
}
