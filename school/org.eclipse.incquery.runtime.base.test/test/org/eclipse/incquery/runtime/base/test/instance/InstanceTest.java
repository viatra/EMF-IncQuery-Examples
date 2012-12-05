package org.eclipse.incquery.runtime.base.test.instance;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseTest;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.Ignore;
import org.junit.Test;

import school.Course;
import school.SchoolPackage;
import school.SpecialisationCourse;
import school.Student;
import school.Teacher;

/**
 * Test cases used to test the instance getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class InstanceTest extends IncQueryBaseTest {

	public InstanceTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * Checks all instanes of the {@link Student}'s {@link EClass}
	 */
	@Test
	public void allInstancesTest() {		
		Collection<EObject> result = navigationHelper.getAllInstances(SchoolPackage.Literals.STUDENT);
		for (EObject obj : ResourceAccess.getAllContents()) {
			if (obj instanceof Student) {
				assertTrue(result.contains(obj));
			}
		}
	}
	
	/**
	 * Test case used to check the direct instance getters.
	 * Distinguishes between {@link Course} and {@link SpecialisationCourse} instances.
	 */
	@Test
	public void directInstancesTest() {		
		Collection<EObject> result = navigationHelper.getDirectInstances(SchoolPackage.Literals.COURSE);
		for (EObject obj : ResourceAccess.getAllContents()) {
			if (obj instanceof SpecialisationCourse) {
				assertTrue(!result.contains(obj));
			}
			else if (obj instanceof Course) {
				assertTrue(result.contains(obj));
			}
		}
	}
	
	@Ignore("Ignored until EMF proxy resolving is fixed in CI branch")
	@Test
	public void instancesOfTeacherTest() {		
		Collection<EObject> teachers = navigationHelper.getDirectInstances(SchoolPackage.Literals.TEACHER);
		Collection<EObject> courses = navigationHelper.getAllInstances(SchoolPackage.Literals.COURSE);
		for (EObject obj : teachers) {
			for (Course course : ((Teacher) obj).getCourses()) {
				//the external teacher will only be present if ResourceSet is used in the navigation helper
				//in that case we have to resolve the proxy object to the Course
				if (course.eIsProxy() && this.notifier instanceof ResourceSet) {
					course = (Course) EcoreUtil.resolve(course, (ResourceSet) this.notifier);
				}
				assertTrue(courses.contains(course));
			}
		}
	}
}
