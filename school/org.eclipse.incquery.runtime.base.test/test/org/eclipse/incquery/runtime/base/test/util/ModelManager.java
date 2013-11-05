package org.eclipse.incquery.runtime.base.test.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

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

public class ModelManager {

    private static ResourceSet cachedModel = null;
    private static EObject cachedDynamicModel = null;

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

    public static EObject getDynamicModel() {
        if (cachedDynamicModel == null) {
            cachedDynamicModel = new DynamicResourceModel().school;
        }
        return cachedDynamicModel;
    }

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

    private static Map<ResourceSet, TransactionalEditingDomain> editingDomainMap = new WeakHashMap<ResourceSet, TransactionalEditingDomain>();
    private static Map<Notifier, ResourceSet> resourceSetMap = new WeakHashMap<Notifier, ResourceSet>();

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
