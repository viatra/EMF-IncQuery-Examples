package org.eclipse.incquery.runtime.base.test.util;

import java.io.File;
import java.util.ArrayList;
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

import school.School;
import school.SchoolPackage;

public class ResourceAccess {

	private static TransactionalEditingDomain transactionalEditingDomain;
	private static ResourceSet resourceSet = null;
	
	public static School getFirstSchool() {
		return (School) getResourceOfFirstSchool().getContents().get(0);
	}
	
	public static School getSecondSchool() {
		return (School) getResourceOfSecondSchool().getContents().get(0);
	}
	
	public static Resource getResourceOfFirstSchool() {
		return getResourceSet().getResources().get(0);
	}
	
	public static Resource getResourceOfSecondSchool() {
		return getResourceSet().getResources().get(1);
	}
	
	public static ResourceSet getResourceSet() {
		if (resourceSet == null) {			
		    SchoolPackage.eINSTANCE.eClass();
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("school", new XMIResourceFactoryImpl());
		    resourceSet = new ResourceSetImpl();
		    transactionalEditingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		    resourceSet.getResource(URI.createFileURI(new File("model/school1.school").getAbsolutePath()), true);
		    resourceSet.getResource(URI.createFileURI(new File("model/school2.school").getAbsolutePath()), true);
		}
		return resourceSet;
	}
	
	public static  List<EObject> getAllContents(Notifier notifier) {
		List<EObject> contents = new ArrayList<EObject>();
		
		if (notifier instanceof EObject) {
			getAllContents(contents, ((EObject) notifier).eAllContents());
		}
		else if (notifier instanceof Resource) {
			getAllContents(contents, ((Resource) notifier).getAllContents());
		}
		else {
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
		
	public static TransactionalEditingDomain getTransactionalEditingDomain() {
		return transactionalEditingDomain;
	}
}
