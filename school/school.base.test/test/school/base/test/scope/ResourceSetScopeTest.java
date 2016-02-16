package school.base.test.scope;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import school.Course;
import school.SchoolPackage;
import school.Teacher;
import school.base.test.SchoolBaseTest;
import school.base.test.util.ModelManager;

/**
 * Scope test based on the {@link ResourceSet} of the school models.
 * 
 * @author Tamas Szabo
 *
 */
public class ResourceSetScopeTest extends SchoolBaseTest {

	public ResourceSetScopeTest() {
		super(ModelManager.getModel());
	}
	
	@Test
	public void instancesOfTeacherTest() {		
		Collection<EObject> teachers = navigationHelper.getDirectInstances(SchoolPackage.Literals.TEACHER);
		
		//there are 6 teachers in the two school models together
		assertTrue(teachers.size() == 6);
	}

	/**
	 * Tests whether the courses of all teachers are cotained in the collection of all courses. 
	 */
	@Test
	public void resolvingTest() {		
		Collection<EObject> teachers = navigationHelper.getDirectInstances(SchoolPackage.Literals.TEACHER);
		Collection<EObject> courses = navigationHelper.getAllInstances(SchoolPackage.Literals.COURSE);
		for (EObject obj : teachers) {
			for (Course course : ((Teacher) obj).getCourses()) {
				//the external teacher will only be present if ResourceSet is used in the navigation helper
				//in that case we have to resolve the proxy object to the Course
				if (course.eIsProxy()) {
					course = (Course) EcoreUtil.resolve(course, (ResourceSet) this.notifier);
				}
				assertTrue(courses.contains(course));
			}
		}
	}
	
}
