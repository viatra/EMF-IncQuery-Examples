package org.eclipse.incquery.runtime.base.test.instance;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseDynamicParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.DynamicResourceMetamodel;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.Test;

import school.Course;
import school.SpecialisationCourse;
import school.Student;

/**
 * Test cases used to test the instance getters of EMF-IncQuery Base with dynamic EMF model.
 * 
 * @author Tamas Szabo
 *
 */
public class DynamicInstanceTest extends IncQueryBaseDynamicParameterizedTest {

	public DynamicInstanceTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * Checks all instanes of the {@link Student}'s {@link EClass}
	 */
	@Test
	public void allInstancesTest() {		
		Collection<EObject> result = navigationHelper.getAllInstances(DynamicResourceMetamodel.eINSTANCE.StudentEClass);
		for (EObject obj : ResourceAccess.getAllContents(notifier)) {
			if (obj.eClass().equals(DynamicResourceMetamodel.eINSTANCE.StudentEClass)) {
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
		Collection<EObject> result = navigationHelper.getDirectInstances(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
		for (EObject obj : ResourceAccess.getAllContents(notifier)) {
			if (obj.eClass().equals(DynamicResourceMetamodel.eINSTANCE.SpecialisationCourseEClass)) {
				assertTrue(!result.contains(obj));
			}
			else if (obj.eClass().equals(DynamicResourceMetamodel.eINSTANCE.CourseEClass)) {
				assertTrue(result.contains(obj));
			}
		}
	}
}
