package school.base.test.inverseref;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra.query.runtime.base.exception.ViatraBaseException;
import org.junit.Before;
import org.junit.Test;

import school.Course;
import school.School;
import school.SchoolFactory;
import school.SchoolPackage;
import school.Student;
import school.Year;
import school.base.test.SchoolBaseParameterizedTest;
import school.base.test.util.ModelManager;

/**
 * Test cases used to test the inverse reference getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class InverseReferenceTest extends SchoolBaseParameterizedTest {

	public InverseReferenceTest(Notifier notifier) {
		super(notifier);
	}

	private Year year2012;
	private Student student;
		
	@Override
	@Before
	public void init() throws ViatraBaseException {
		super.init();
		year2012 = (Year) navigationHelper.findByAttributeValue(2012).iterator().next().getEObject();
		student = (Student) navigationHelper.findByAttributeValue("Abel Hegedus").iterator().next().getEObject();
	}
	
	/**
	 * Inverse reference resolving based on a school year
	 */
	@Test
	public void valueTest() {		
		Collection<Setting> result = navigationHelper.getInverseReferences(year2012);
		assertTrue(result.size() == 3);
		
		for (Setting setting : result) {
			assertEquals(year2012, setting.get(false));
		}
	}
	
	/**
	 * Inverse reference resolving based on a school year and a given {@link EReference} instance
	 */
	@Test
	public void valueAndReferenceTest() {		
		Collection<EObject> result = navigationHelper.getInverseReferences(year2012, SchoolPackage.eINSTANCE.getSchool_Years());
		assertTrue(result.size() == 1);
	}
	
	/**
	 * Inverse reference resolving based on a student and a {@link Collection} of {@link EReference}s
	 */
	@Test
	public void valueAndReferencesTest() {
		List<EReference> references = new ArrayList<EReference>();
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getStudent_FriendsWith());
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchoolClass_Students());
		
		Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
		assertTrue(result.size() == 3);
		
		for (Setting setting : result) {
			assertEquals(student, setting.get(false));
		}
	}
	
	/**
	 * Inverse reference resolving based on a student and a {@link Collection} of {@link EReference}s.
	 * The test modifies the model by removing two students from the school classes. 
	 */
	@Test
	public void valueAndReferencesModTest() {
		try {
			final Command command = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
				@Override
				protected void doExecute() {
					School firstSchool = (School) ModelManager.getModel().getResources().get(0).getContents().get(0);
					for (Course c : firstSchool.getCourses()) {
						if (c.getSchoolClass() != null) {
							List<Student> students = new ArrayList<Student>(c.getSchoolClass().getStudents());
							for (Student s : students) {
								if (s.getName().matches("Zoltan Ujhelyi") || s.getName().matches("Gabor Bergmann")) {
									c.getSchoolClass().getStudents().remove(s);
								}
							}
						}
					}
				}
			};
			ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(command);
			
			List<EReference> references = new ArrayList<EReference>();
			references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getStudent_FriendsWith());
			references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchoolClass_Students());
			
			Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
			
			assertTrue(result.size() == 1);
			assertEquals(student, result.iterator().next().get(false));
		}
		finally {
			ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
		}
	}
}
