package org.eclipse.incquery.runtime.base.test.datatype;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.ModelManager;
import org.junit.Test;

import school.Course;
import school.School;
import school.SchoolPackage;
import school.Teacher;
import school.Year;

/**
 * Test cases used to test the {@link EDataType} related getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class DataTypeTest extends IncQueryBaseParameterizedTest {

    private School firstSchool;
    private School secondSchool;
    
	public DataTypeTest(Notifier notifier) {
		super(notifier);
        firstSchool = (School) ModelManager.getModel().getResources().get(0).getContents().get(0);
        secondSchool = (School) ModelManager.getModel().getResources().get(1).getContents().get(0);
	}

	/**
	 * Data type test for EInt
	 */
	@Test
	public void integerTest() {
		//these integers are present in the model , the EAttribute will be EInt
		Integer[] expectedNumbers = new Integer[] {0, 17, 20, 23, 37, 2011, 2012, 30};	
		List<Object> result = new ArrayList<Object>(navigationHelper.getDataTypeInstances(SchoolPackage.Literals.YEAR__STARTING_DATE.getEAttributeType()));
		
		for (Integer i : expectedNumbers) {
			assertTrue(result.contains(i));
		}
	}
	
	/**
	 * Data type test for EChar
	 */
	@Test
	public void charTest() {
		Character[] expectedChars = new Character[] {'A','B','C','D'};
		Collection<Object> result = navigationHelper.getDataTypeInstances(SchoolPackage.Literals.SCHOOL_CLASS__CODE.getEAttributeType());
		for (Character c : expectedChars) {
			assertTrue(result.contains(c));
		}
	}
	
	/**
	 * Data type test for EChar with modification
	 */
	@Test
	public void charModTest() {
		try {
			//the command removes any reference to schools thus no EChar will be present in the model
			final Command command = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
				@Override
				protected void doExecute() {
					
					List<Course> courses = new ArrayList<Course>(firstSchool.getCourses());
					courses.addAll(secondSchool.getCourses());
					for (Course c : courses) {
						c.setSchool(null);
					}
					
					List<Teacher> teachers = new ArrayList<Teacher>(firstSchool.getTeachers());
					teachers.addAll(secondSchool.getTeachers());
					for (Teacher t : teachers) {
						t.setSchool(null);
					}
					
					List<Year> years = new ArrayList<Year>(firstSchool.getYears());
					years.addAll(secondSchool.getYears());
					for (Year y : years) {
						y.setSchool(null);
					}
				}
			};
			ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(command);
			Collection<Object> result = navigationHelper.getDataTypeInstances(SchoolPackage.Literals.SCHOOL_CLASS__CODE.getEAttributeType());
			assertTrue(result.isEmpty());
		}
		finally {
			ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
		}
	}
}
