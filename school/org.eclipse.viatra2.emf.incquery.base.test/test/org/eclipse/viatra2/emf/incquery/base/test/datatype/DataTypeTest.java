package org.eclipse.viatra2.emf.incquery.base.test.datatype;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.Test;

import school.Course;
import school.SchoolPackage;
import school.Teacher;
import school.Year;

public class DataTypeTest extends IncQueryBaseTest {

	public DataTypeTest(Notifier notifier) {
		super(notifier);
	}

	@Test
	public void dataTypeTestInteger() {
		Integer[] expectedNumbers = new Integer[] {0, 17, 20, 23, 37, 2011, 2012, 30};
		Collection<Object> result = navigationHelper.getDataTypeInstances(SchoolPackage.Literals.YEAR__STARTING_DATE.getEAttributeType());
		for (Integer i : expectedNumbers) {
			assertTrue(result.contains(i));
		}
	}
	
	@Test
	public void dataTypeTestChar() {
		Character[] expectedChars = new Character[] {'A','B','C','D'};
		Collection<Object> result = navigationHelper.getDataTypeInstances(SchoolPackage.Literals.SCHOOL_CLASS__CODE.getEAttributeType());
		for (Character c : expectedChars) {
			assertTrue(result.contains(c));
		}
	}
	
	@Test
	public void dataTypeTestCharWithModification() {
		final RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				
				List<Course> courses = new ArrayList<Course>(ResourceAccess.getEObject().getCourses());
				for (Course c : courses) {
					c.setSchool(null);
				}
				
				List<Teacher> teachers = new ArrayList<Teacher>(ResourceAccess.getEObject().getTeachers());
				for (Teacher t : teachers) {
					t.setSchool(null);
				}
				
				List<Year> years = new ArrayList<Year>(ResourceAccess.getEObject().getYears());
				for (Year y : years) {
					y.setSchool(null);
				}
			}
		};
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		Collection<Object> result = navigationHelper.getDataTypeInstances(SchoolPackage.Literals.SCHOOL_CLASS__CODE.getEAttributeType());
		ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
		assertTrue(result.isEmpty());
	}
}
