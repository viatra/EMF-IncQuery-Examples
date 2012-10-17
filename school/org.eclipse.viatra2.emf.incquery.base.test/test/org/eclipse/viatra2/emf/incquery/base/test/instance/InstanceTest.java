package org.eclipse.viatra2.emf.incquery.base.test.instance;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.Test;

import school.Course;
import school.SchoolPackage;
import school.SpecialisationCourse;
import school.Student;

public class InstanceTest extends IncQueryBaseTest {

	public InstanceTest(Notifier notifier) {
		super(notifier);
	}

	@Test
	public void allInstancesTest() {		
		Collection<EObject> result = navigationHelper.getAllInstances(SchoolPackage.Literals.STUDENT);
		for (EObject obj : ResourceAccess.getAllContents()) {
			if (obj instanceof Student) {
				assertTrue(result.contains(obj));
			}
		}
	}
	
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
	
}
