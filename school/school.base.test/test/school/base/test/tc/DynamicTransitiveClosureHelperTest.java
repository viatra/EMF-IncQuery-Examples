package school.base.test.tc;

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
import org.eclipse.viatra.query.runtime.base.api.ViatraBaseFactory;
import org.eclipse.viatra.query.runtime.base.api.TransitiveClosureHelper;
import org.eclipse.viatra.query.runtime.base.exception.ViatraBaseException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import school.base.test.SchoolBaseDynamicParameterizedTest;
import school.base.test.util.DynamicResourceMetamodel;
import school.base.test.util.ModelManager;

public class DynamicTransitiveClosureHelperTest extends SchoolBaseDynamicParameterizedTest {

    private TransitiveClosureHelper transitiveClosureHelper;
    private EObject aStudent;
    private EObject bStudent;
    private EObject cStudent;

    public DynamicTransitiveClosureHelperTest(Notifier notifier) {
        super(notifier, false);
    }

    @Override
    @Before
    public void init() throws ViatraBaseException {
        super.init();
        if (!navigationHelper.isInWildcardMode()) {
            navigationHelper.registerObservedTypes(Collections
                    .singleton(DynamicResourceMetamodel.eINSTANCE.StudentEClass), Collections
                    .singleton(EcorePackage.eINSTANCE.getEString()), Collections
                    .singleton((EStructuralFeature) DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute));
        }
        Set<EReference> refs = new HashSet<EReference>();
        refs.add(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
        transitiveClosureHelper = ViatraBaseFactory.getInstance().createTransitiveClosureHelper(
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

            Command firstCommand = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
                @SuppressWarnings("unchecked")
                @Override
                protected void doExecute() {
                    EList<EObject> friendsWith = (EList<EObject>) aStudent
                            .eGet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
                    friendsWith.add(aStudent);
                }
            };

            ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(firstCommand);

            assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3
                    && transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));

            Command secondCommand = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
                @SuppressWarnings("unchecked")
                @Override
                protected void doExecute() {
                    EList<EObject> friendsWith = (EList<EObject>) aStudent
                            .eGet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
                    friendsWith.add(bStudent);
                }
            };
            ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(secondCommand);

            assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3
                    && transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));

            assertTrue(!transitiveClosureHelper.isReachable(bStudent, cStudent));
        } finally {
            // Undo the previously executed commands to restore the original state of the model
            ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
            ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
        }
    }
}
