package org.eclipse.viatra2.emf.incquery.base.test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import school.School;
import school.SchoolPackage;

public class ResourceAccess {

	private static Resource resource = null;
	private static TransactionalEditingDomain transactionalEditingDomain;
	
	public static School getSchool() {
		if (resource == null) {			
		    SchoolPackage.eINSTANCE.eClass();
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("school", new XMIResourceFactoryImpl());
		    ResourceSet resSet = new ResourceSetImpl();
		    transactionalEditingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resSet);
		    Resource parsedResource = resSet.getResource(URI.createURI("model/BUTE.school"), true);
		    resource = parsedResource;
		}
		return (School) resource.getContents().get(0);
	}
	
	public static  List<EObject> getAllContents() {
		List<EObject> contents = new ArrayList<EObject>();
		TreeIterator<EObject> iterator = getSchool().eAllContents();
		
		while (iterator.hasNext()) {
			contents.add(iterator.next());
		}
		
		return contents;
	}
		
	public static TransactionalEditingDomain getTransactionalEditingDomain() {
		return transactionalEditingDomain;
	}
	
	public static void undo(final Command command) {
		assert command != null;
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(new RecordingCommand(transactionalEditingDomain) {
				@Override
				protected void doExecute() {
					command.undo();
				}
			});
		}
	}
}
