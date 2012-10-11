package org.eclipse.viatra2.emf.incquery.base.test.feature;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.Test;

import school.SchoolPackage;
import school.Student;

public class FeatureTest extends IncQueryBaseTest {

	@Test
	public void holdersOfFeatureTest() {		
		Collection<EObject> result = navigationHelper.getHoldersOfFeature(SchoolPackage.eINSTANCE.getStudent_Name());
		for (EObject obj : ResourceAccess.getAllContents()) {
			if (obj instanceof Student) {
				assertTrue(result.contains(obj));
			}
		}
	}
	
	@Test
	public void holdersOfFeatureTestWithModification() {
		final RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				//years and courses have references to students
				ResourceAccess.getSchool().getCourses().clear();
				ResourceAccess.getSchool().getYears().clear();
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		
		Collection<EObject> result = navigationHelper.getHoldersOfFeature(SchoolPackage.eINSTANCE.getStudent_Name());
		ResourceAccess.undo(command);	
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void findByFeatureValueTest() {
		Collection<EObject> result = navigationHelper.findByFeatureValue("Budapest University of Technology and Economics", SchoolPackage.Literals.SCHOOL__NAME);
		assertTrue(result.size() == 1);
		
		result = navigationHelper.findByFeatureValue(2011, SchoolPackage.Literals.YEAR__STARTING_DATE);
		assertTrue(result.size() == 1);
	}
}
