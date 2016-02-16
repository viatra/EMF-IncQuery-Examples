package school.base.test.feature;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.junit.Test;

import school.School;
import school.SchoolPackage;
import school.Student;
import school.base.test.SchoolBaseParameterizedTest;
import school.base.test.util.ModelManager;

/**
 * Test cases used to test the {@link EStructuralFeature} related getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class FeatureTest extends SchoolBaseParameterizedTest {

	public FeatureTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * Finding all students in the model
	 */
	@Test
	public void holderTest() {		
		Collection<EObject> result = navigationHelper.getHoldersOfFeature(SchoolPackage.eINSTANCE.getStudent_Name());
		for (EObject obj : ModelManager.getAllContents(notifier)) {
			if (obj instanceof Student) {
				assertTrue(result.contains(obj));
			}
		}
	}
	
	/**
	 * Removing all students from the model and resolving feature holders after that
	 */
	@Test
	public void holderModTest() {
		try {
			final Command command = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
				@Override
				protected void doExecute() {
					//years and courses have references to students
					//remove all of them from the ResourceSet
				    School firstSchool = (School) ModelManager.getModel().getResources().get(0).getContents().get(0);
				    School secondSchool = (School) ModelManager.getModel().getResources().get(1).getContents().get(0);
					firstSchool.getCourses().clear();
					firstSchool.getYears().clear();
					secondSchool.getCourses().clear();
					secondSchool.getYears().clear();
				}
			};
			ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(command);
			Collection<EObject> result = navigationHelper.getHoldersOfFeature(SchoolPackage.eINSTANCE.getStudent_Name());
			assertTrue(result.isEmpty());
		}
		finally {
			ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
		}
	}
	
	private static final String SCHOOL_NAME = "Budapest University of Technology and Economics";
	
	/**
	 * Feature holder resolving based on String literal
	 */
	@Test
	public void stringValueTest() {
		Collection<EObject> result = navigationHelper.findByFeatureValue(SCHOOL_NAME, SchoolPackage.Literals.SCHOOL__NAME);
		assertTrue(result.size() == 1);
	}
	
	/**
	 * Feature holder resolving based on Integer value
	 */
	@Test
	public void integerValueTest() {
		Collection<EObject> result = navigationHelper.findByFeatureValue(2011, SchoolPackage.Literals.YEAR__STARTING_DATE);
		assertTrue(result.size() == 1);
	}
}
