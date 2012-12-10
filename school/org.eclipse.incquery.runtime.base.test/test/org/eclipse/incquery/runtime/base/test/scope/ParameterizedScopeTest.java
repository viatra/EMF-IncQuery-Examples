package org.eclipse.incquery.runtime.base.test.scope;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.Ignore;
import org.junit.Test;

import school.Course;
import school.SchoolClass;
import school.SchoolPackage;
import school.Student;

public class ParameterizedScopeTest extends IncQueryBaseParameterizedTest {

	public ParameterizedScopeTest(Notifier notifier) {
		super(notifier);
	}

	@Test
	public void instancesOfTeacherTest() {		
		Collection<EObject> teachers = navigationHelper.getDirectInstances(SchoolPackage.Literals.TEACHER);
		
		//there are 6 teachers in the two school models together
		if (notifier instanceof EObject || notifier instanceof Resource) {
			assertTrue(teachers.size() == 4);
		}
		else {
			assertTrue(teachers.size() == 6);
		}
	}

	/**
	 * Tests whether the courses of all teachers are cotained in the collection of all courses. 
	 */
	@Ignore(value = "ResourceSet scope remark")
	@Test
	public void coursesOfTeachersTest() {
		Collection<EObject> teachers = navigationHelper.getDirectInstances(SchoolPackage.Literals.TEACHER);
		int courseCount = 0;
		
		for (EObject teacher : teachers) {
			for (Setting setting : navigationHelper.getInverseReferences(teacher)) {
				if (setting.getEObject() instanceof Course) {
					courseCount++;
				}
			}
		}
		
		if (notifier instanceof EObject || notifier instanceof Resource) {
			assertTrue(courseCount == 5);
		}
		else {
			assertTrue(courseCount == 6);
		}
	}
	
	@Test
	public void studentOfSchoolTest() {
		int studentCount = 0;

		// pattern studentOfSchool(S, Sch) {
		// Student.schoolClass.courses.school(S, Sch);
		// }
		for (Setting schoolInverseRef : navigationHelper
				.getInverseReferences(ResourceAccess.getFirstSchool())) {

			if (schoolInverseRef.getEObject() instanceof Course) {

				for (Setting courseInverseRef : navigationHelper
						.getInverseReferences(schoolInverseRef.getEObject())) {

					if (courseInverseRef.getEObject() instanceof SchoolClass) {

						for (Setting schoolClassInverseRef : navigationHelper
								.getInverseReferences(courseInverseRef
										.getEObject())) {

							if (schoolClassInverseRef.getEObject() instanceof Student) {
								studentCount++;
							}
						}
					}
				}
			}
		}
		
		//there are 5 students in the first school model
		if (notifier instanceof EObject || notifier instanceof Resource) {
			assertTrue(studentCount == 5);
		}
		else {
			assertTrue(studentCount == 6);
		}
	}
}
