package org.eclipse.viatra2.emf.incquery.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra2.emf.incquery.base.api.InstanceListener;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.Test;

import school.Course;
import school.SchoolFactory;
import school.SchoolPackage;

public class InstanceListenerTest extends IncQueryBaseTest {

	@Test
	public void featureListenerTest() {
		final Course newCourse = SchoolFactory.eINSTANCE.createCourse();
		final String newCourseSubject = "NewCourse";
		newCourse.setSubject(newCourseSubject);
		
		Set<EClass> classes = new HashSet<EClass>();
		classes.add(SchoolPackage.eINSTANCE.getCourse());
		
		InstanceListener instanceListener = new InstanceListener() {
			
			@Override
			public void instanceInserted(EClass clazz, EObject instance) {
				assertTrue(clazz.equals(SchoolPackage.eINSTANCE.getCourse()) && 
						instance.equals(newCourse));
			}
			
			@Override
			public void instanceDeleted(EClass clazz, EObject instance) {
				assertTrue(clazz.equals(SchoolPackage.eINSTANCE.getCourse()) && 
						instance.equals(newCourse));
			}
		};
		
		navigationHelper.registerInstanceListener(classes, instanceListener);
		
		final RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				ResourceAccess.getSchool().getCourses().add(newCourse);
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		ResourceAccess.undo(command);
		navigationHelper.unregisterInstanceListener(classes, instanceListener);
	}
	
}
