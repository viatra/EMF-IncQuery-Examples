package school.base.test.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import school.SchoolPackage;

/**
 * Utility class to access persisted and dynamic EMF instance models and 
 * demand create {@link TransactionalEditingDomain}s for these models. 
 * 
 * @author Tamas Szabo (itemis AG)
 *
 */
public class ModelManager {

    private static ResourceSet cachedModel = null;
    private static EObject cachedDynamicModel = null;

    /**
     * Returns a {@link ResourceSet} consisting of the persisted 
     * model/school1.school and model/school2.school instance models (as two {@link Resource}s). 
     * Consecutive calls return the same cached {@link ResourceSet} instance.
     * 
     * @return the persisted instance model
     */
    public static ResourceSet getModel() {
        if (cachedModel == null) {
            cachedModel = new ResourceSetImpl();
            SchoolPackage.eINSTANCE.eClass();
            Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
            Map<String, Object> m = reg.getExtensionToFactoryMap();
            m.put("school", new XMIResourceFactoryImpl());
            cachedModel.getResource(URI.createFileURI(new File("model/school1.school").getAbsolutePath()), true);
            cachedModel.getResource(URI.createFileURI(new File("model/school2.school").getAbsolutePath()), true);
        }
        return cachedModel;
    }

    /**
     * Returns the root (School instance) of the dynamic instance model which is populated 
     * with similar objects as the persisted model.
     * Consecutive calls return the same cached {@link EObject} instance.
     * 
     * @return the dynamic instance model
     */
    public static EObject getDynamicModel() {
        if (cachedDynamicModel == null) {
            cachedDynamicModel = new DynamicResourceModel().school;
        }
        return cachedDynamicModel;
    }

    /**
     * Returns all contents of the given {@link Notifier} instance as a {@link List} of {@link EObject}s.
     * 
     * @param notifier the notifier instance
     * @return the list of contents
     */
    public static List<EObject> getAllContents(Notifier notifier) {
        List<EObject> contents = new ArrayList<EObject>();

        if (notifier instanceof EObject) {
            getAllContents(contents, ((EObject) notifier).eAllContents());
        } else if (notifier instanceof Resource) {
            getAllContents(contents, ((Resource) notifier).getAllContents());
        } else {
            for (Resource resource : ((ResourceSet) notifier).getResources()) {
                getAllContents(contents, resource.getAllContents());
            }
        }
        return contents;
    }

    private static void getAllContents(List<EObject> contents, TreeIterator<EObject> iterator) {
        while (iterator.hasNext()) {
            contents.add(iterator.next());
        }
    }

    private static Map<ResourceSet, TransactionalEditingDomain> editingDomainMap = new HashMap<ResourceSet, TransactionalEditingDomain>();
    private static Map<Notifier, ResourceSet> resourceSetMap = new HashMap<Notifier, ResourceSet>();

    /**
     * Demand creates a {@link TransactionalEditingDomain} for the given {@link Notifier}. 
     * First a {@link ResourceSet} instance will be demand created for the {@link Notifier} and this one will 
     * be used to create the editing domain. 
     * Consecutive calls return the same {@link TransactionalEditingDomain} instance for the given {@link Notifier}. 
     *
     * @param notifier the notifier instance
     * @return the transactional editing domain
     */
    public static TransactionalEditingDomain demandCreateTransactionalEditingDomain(Notifier notifier) {
        ResourceSet resSet = demandCreateResourceSet(notifier);
        
        if (editingDomainMap.containsKey(resSet)) {
            return editingDomainMap.get(resSet);
        } else {
            TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resSet);
            editingDomainMap.put(resSet, editingDomain);
            return editingDomain;
        }
    }

    private static ResourceSet demandCreateResourceSet(Notifier notifier) {
        if (resourceSetMap.containsKey(notifier)) {
            return resourceSetMap.get(notifier);
        } else {
            ResourceSet resSet = null;
            if (notifier instanceof EObject) {
                if (((EObject) notifier).eResource() == null) {
                    resSet = new ResourceSetImpl();
                    Resource resource = resSet.createResource(URI.createURI("test"));
                    resource.getContents().add((EObject) notifier);
                } else {
                    if (((EObject) notifier).eResource().getResourceSet() == null) {
                        resSet = new ResourceSetImpl();
                        resSet.getResources().add(((EObject) notifier).eResource());
                    } else {
                        resSet = ((EObject) notifier).eResource().getResourceSet();
                    }
                }
            } else if (notifier instanceof Resource) {
                if (((Resource) notifier).getResourceSet() != null) {
                    resSet = ((Resource) notifier).getResourceSet();
                } else {
                    resSet = new ResourceSetImpl();
                    resSet.getResources().add(((Resource) notifier));
                }
            } else if (notifier instanceof ResourceSet) {
                resSet = (ResourceSet) notifier;
            }

            resourceSetMap.put(notifier, resSet);
            return resSet;
        }
    }

}
