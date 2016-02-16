package school.base.test.listener;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.junit.Assert;
import org.junit.Test;

import school.Course;
import school.School;
import school.SchoolFactory;
import school.base.test.SchoolBaseParameterizedTest;
import school.base.test.util.ModelManager;

/**
 * Wrapper class for the listener based EMF-IncQuery-Base test cases.
 * <br><br>
 * The class defines a test method where a new {@link Course} instance will be inserted into the model. 
 * Subclasses must define the way the various listeners are registered and unregistered. 
 * <br><br>
 * Subclasses are not required to define an own @Test method.
 * The implementation uses {@link RecordingCommand} for model manipulation and 
 * undoes the top of the {@link CommandStack} after listener unregistration, 
 * this way the model will return to its original state. 
 * 
 * @author Tamas Szabo
 *
 */
public abstract class QueryBaseListenerTest extends SchoolBaseParameterizedTest {
	
	protected Course newCourse;
	protected String newCourseSubject = "NewCourse";
	protected Integer preExistingCourseWeight = 17;
	
	public QueryBaseListenerTest(Notifier notifier) {
		this(notifier, false);
	}
	
	public QueryBaseListenerTest(Notifier notifier, boolean wildcardMode) {
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
		
		final Command command = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
			@Override
			protected void doExecute() {
				try {
				    EObject firstSchool = ModelManager.getModel().getResources().get(0).getContents().get(0);
					((School) firstSchool).getCourses().add(newCourse);
				} catch (RuntimeException ex) {
					Assert.fail("Exception: " + ex.getMessage());
					throw ex;
				}
			}
		};
		try {
		    ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(command);
		}
		finally {
		    ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
			unregisterListener();
		}
	}
}
