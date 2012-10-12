package org.eclipse.viatra2.emf.incquery.base.test.tc;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra2.emf.incquery.base.api.IncQueryBaseFactory;
import org.eclipse.viatra2.emf.incquery.base.api.NavigationHelper;
import org.eclipse.viatra2.emf.incquery.base.api.TransitiveClosureHelper;
import org.eclipse.viatra2.emf.incquery.base.exception.IncQueryBaseException;
import org.eclipse.viatra2.emf.incquery.base.itc.igraph.ITcObserver;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import school.SchoolPackage;
import school.Student;

public class TransitiveClosureHelperTest {

	private TransitiveClosureHelper transitiveClosureHelper;
	private NavigationHelper navigationHelper;
	private Student aStudent;
	private Student bStudent;
	private Student cStudent;
	
	@Before
	public void init() {
		try {
			Set<EReference> refs = new HashSet<EReference>();
			refs.add(SchoolPackage.eINSTANCE.getStudent_FriendsWith());
			transitiveClosureHelper = IncQueryBaseFactory.getInstance().createTransitiveClosureHelper(ResourceAccess.getSchool(), refs);
			navigationHelper = IncQueryBaseFactory.getInstance().createNavigationHelper(ResourceAccess.getSchool(), true, null);
			aStudent = (Student) navigationHelper.findByAttributeValue("Abel Hegedus").iterator().next().getEObject();
			bStudent = (Student) navigationHelper.findByAttributeValue("Gabor Bergmann").iterator().next().getEObject();
			cStudent = (Student) navigationHelper.findByAttributeValue("Zoltan Ujhelyi").iterator().next().getEObject();
		} 
		catch (IncQueryBaseException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void dispose() {
		transitiveClosureHelper.dispose();
		navigationHelper.dispose();
	}
	
	@Test
	public void queryTestWithModification() {
		assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 2);
		assertTrue(transitiveClosureHelper.getAllReachableTargets(aStudent).size() == 0);
		
		RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				aStudent.getFriendsWith().add(aStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		
		assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3 && 
				transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));
		
		command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				aStudent.getFriendsWith().add(bStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		
		assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3 && 
				transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));
		
		assertTrue(!transitiveClosureHelper.isReachable(bStudent, cStudent));
	}
	
	@Test
	public void listenerTestWithModification() {
		ITcObserver<EObject> observer = new ITcObserver<EObject>() {

			@Override
			public void tupleInserted(EObject source, EObject target) {
				assertTrue((source.equals(aStudent) && target.equals(aStudent)) || 
						(source.equals(aStudent) && target.equals(bStudent)));
			}

			@Override
			public void tupleDeleted(EObject source, EObject target) {
				assertTrue(source.equals(aStudent) && target.equals(aStudent));
			}
		};
		
		transitiveClosureHelper.attachObserver(observer);
		
		RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				aStudent.getFriendsWith().add(aStudent);
				aStudent.getFriendsWith().add(bStudent);
				aStudent.getFriendsWith().remove(aStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
			
		transitiveClosureHelper.detachObserver(observer);
	}
}
