package org.eclipse.incquery.runtime.base.test.tc;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.incquery.runtime.base.api.IncQueryBaseFactory;
import org.eclipse.incquery.runtime.base.api.TransitiveClosureHelper;
import org.eclipse.incquery.runtime.base.exception.IncQueryBaseException;
import org.eclipse.incquery.runtime.base.itc.alg.misc.Tuple;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.eclipse.incquery.runtime.base.test.util.TestObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import school.SchoolClass;
import school.SchoolFactory;
import school.SchoolPackage;
import school.Student;

public class TransitiveClosureHelperTest extends IncQueryBaseParameterizedTest {

	private TransitiveClosureHelper transitiveClosureHelper;
	private Student aStudent;
	private Student bStudent;
	private Student cStudent;
	
	public TransitiveClosureHelperTest(Notifier notifier) {
		super(notifier);
	}
	
	@Before
	public void init() {
		try {
			super.init();
			Set<EReference> refs = new HashSet<EReference>();
			refs.add(SchoolPackage.eINSTANCE.getStudent_FriendsWith());
			transitiveClosureHelper = IncQueryBaseFactory.getInstance().createTransitiveClosureHelper(notifier, refs);
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
	
	/**
	 * A transitive closure test with model manipulations and a test listener. 
	 * The listener asserts the received notifications too. 
	 */
	@Test
	public void listenerTest() {
		
		//The observer will assert the tuples received from the transitive closure helper
		TestObserver<EObject> observer = new TestObserver<EObject>();
		observer.addInsertedTuple(new Tuple<EObject>(aStudent, aStudent));
		observer.addInsertedTuple(new Tuple<EObject>(bStudent, bStudent));
		observer.addInsertedTuple(new Tuple<EObject>(cStudent, bStudent));
		observer.addInsertedTuple(new Tuple<EObject>(aStudent, bStudent));
		
		observer.addDeletedTuple(new Tuple<EObject>(bStudent, bStudent));
		observer.addDeletedTuple(new Tuple<EObject>(cStudent, bStudent));
		observer.addDeletedTuple(new Tuple<EObject>(aStudent, bStudent));
		
		transitiveClosureHelper.attachObserver(observer);
		
		Command edgeModCommand = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				aStudent.getFriendsWith().add(aStudent);
				aStudent.getFriendsWith().add(bStudent);
				aStudent.getFriendsWith().remove(bStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(edgeModCommand);
		
		final SchoolClass schoolClass = aStudent.getSchoolClass();
		final Student newStudent = SchoolFactory.eINSTANCE.createStudent();
		
		observer.clearTuples();
		observer.addInsertedTuple(new Tuple<EObject>(newStudent, aStudent));
		observer.addInsertedTuple(new Tuple<EObject>(newStudent, bStudent));
		
		Command nodeModCommand = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				schoolClass.getStudents().add(newStudent);
				newStudent.getFriendsWith().add(bStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(nodeModCommand);
		
		transitiveClosureHelper.detachObserver(observer);
		
		//Undo the previously executed commands to restore the original state of the model
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
	}
	
	/**
	 * A transitive closure test with model manipulations. 
	 * It operates on the friendsWith relation between the students. 
	 */
	@Test
	public void queryModTest() {
		assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 2);
		assertTrue(transitiveClosureHelper.getAllReachableTargets(aStudent).size() == 0);
		
		Command firstCommand = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				aStudent.getFriendsWith().add(aStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(firstCommand);
		
		assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3 && 
				transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));
		
		Command secondCommand = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				aStudent.getFriendsWith().add(bStudent);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(secondCommand);
		
		assertTrue(transitiveClosureHelper.getAllReachableSources(aStudent).size() == 3 && 
				transitiveClosureHelper.getAllReachableSources(aStudent).contains(aStudent));
		
		assertTrue(!transitiveClosureHelper.isReachable(bStudent, cStudent));
		
		//Undo the previously executed commands to restore the original state of the model
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
	}
}
