package org.eclipse.viatra2.emf.incquery.base.test.inverseref;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.Before;
import org.junit.Test;

import school.Course;
import school.SchoolFactory;
import school.SchoolPackage;
import school.Student;
import school.Year;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class InverseReferenceTest extends IncQueryBaseTest {

	private Year year2012;
	private Student student;
		
	@Before
	public void init() {
		super.init();
		
		Iterable<EObject> years = Iterables.filter(ResourceAccess.getAllContents(), new Predicate<EObject>() {
			public boolean apply(EObject input) {
				if (input instanceof Year && ((Year) input).getStartingDate() == 2012) {
					return true;
				}
				return false;
			};
		});
		year2012 = (Year) years.iterator().next();
		
		Iterable<EObject> students = Iterables.filter(ResourceAccess.getAllContents(), new Predicate<EObject>() {
			public boolean apply(EObject input) {
				if (input instanceof Student && ((Student) input).getName().matches("Abel Hegedus")) {
					return true;
				}
				return false;
			};
		});
		student = (Student) students.iterator().next();
	}
	
	@Test
	public void inverseReferenceTestByValue() {		
		Collection<Setting> result = navigationHelper.getInverseReferences(year2012);
		assertTrue(result.size() == 3);
	}
	
	@Test
	public void inverseReferenceTestByValueAndReference() {		
		Collection<EObject> result = navigationHelper.getInverseReferences(year2012, SchoolPackage.eINSTANCE.getSchool_Years());
		assertTrue(result.size() == 1);
	}
	
	@Test
	public void inverseReferenceTestByValueAndReferences() {
		List<EReference> references = new ArrayList<EReference>();
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getStudent_FriendsWith());
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchoolClass_Students());
		
		Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
		assertTrue(result.size() == 3);
	}
	
	@Test
	public void inverseReferenceTestByValueAndReferencesWithModification() {
		final RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				
				for (Course c : ResourceAccess.getSchool().getCourses()) {
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
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		
		List<EReference> references = new ArrayList<EReference>();
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getStudent_FriendsWith());
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchoolClass_Students());
		
		Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
		ResourceAccess.undo(command);
		assertTrue(result.size() == 1);
	}
}
