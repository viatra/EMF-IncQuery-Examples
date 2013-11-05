package org.eclipse.incquery.runtime.base.test.instance;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.ModelManager;
import org.junit.Test;

import school.Course;
import school.SchoolPackage;
import school.SpecialisationCourse;
import school.Student;

/**
 * Test cases used to test the instance getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class InstanceTest extends IncQueryBaseParameterizedTest {

	public InstanceTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * Checks all instanes of the {@link Student}'s {@link EClass}
	 */
	@Test
	public void allInstancesTest() {		
		Collection<EObject> result = navigationHelper.getAllInstances(SchoolPackage.Literals.STUDENT);
		for (EObject obj : ModelManager.getAllContents(notifier)) {
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
		for (EObject obj : ModelManager.getAllContents(notifier)) {
			if (obj instanceof SpecialisationCourse) {
				assertTrue(!result.contains(obj));
			}
			else if (obj instanceof Course) {
				assertTrue(result.contains(obj));
			}
		}
	}
}
