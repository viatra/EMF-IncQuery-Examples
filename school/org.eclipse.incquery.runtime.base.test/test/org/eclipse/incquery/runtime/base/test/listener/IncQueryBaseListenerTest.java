package org.eclipse.incquery.runtime.base.test.listener;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.Assert;
import org.junit.Test;

import school.Course;
import school.SchoolFactory;

/**
 * Wrapper class for the listener based EMF-IncQuery Base test cases.
 * <br><br>
 * The class defines a test method where a new {@link Course} instance will be inserted into the model. 
 * Subclasses must define the way the various listeners are registered and unregistered. 
 * <br><br>
 * Subclasses is not required to define an own @Test method.
 * The implementation uses {@link RecordingCommand} for model manipulation and 
 * undoes the top of the {@link CommandStack} after listener unregistration.
 * This way the model will return to its original state. 
 * 
 * @author Tamas Szabo
 *
 */
public abstract class IncQueryBaseListenerTest extends IncQueryBaseParameterizedTest {
	
	protected Course newCourse;
	protected String newCourseSubject = "NewCourse";
	protected Integer preExistingCourseWeight = 17;
	
	public IncQueryBaseListenerTest(Notifier notifier) {
		this(notifier, false);
	}
	
	public IncQueryBaseListenerTest(Notifier notifier, boolean wildcardMode) {
		super(notifier, wildcardMode, false);
		
		newCourse = SchoolFactory.eINSTANCE.createCourse();
		newCourse.setSubject(newCourseSubject);
		newCourse.setWeight(preExistingCourseWeight);
	}
	
	/**
	 * Subclasses should handle listener registration in this method. 
	 * This method will be called before the model manipulations.
	 */
	public abstract void registerListener();
	
	/**
	 * Subclasses should handle listener unregistration in this method. 
	 * This method will be called before the model is changed back to its original state.
	 * The listeners will not be notified about the {@link Course} removal. 
	 */
	public abstract void unregisterListener();

	/**
	 * Stub of the listener based tests. 
	 */
	@Test
	public void listenerBasedTest() {		
		registerListener();
		
		final Command command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				try {
					ResourceAccess.getFirstSchool().getCourses().add(newCourse);
				} catch (RuntimeException ex) {
					Assert.fail("Exception: " + ex.getMessage());
					throw ex;
				}
			}
		};
		try {
			ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		}
		finally {
			ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
			unregisterListener();
		}
	}
}
