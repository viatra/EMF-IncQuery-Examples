package org.eclipse.viatra2.emf.incquery.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.viatra2.emf.incquery.base.api.DataTypeListener;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.Test;

import school.Course;
import school.SchoolFactory;
import school.SchoolPackage;

public class DataTypeListenerTest extends IncQueryBaseTest {
	
	public DataTypeListenerTest() {
		super(false);
	}
	
	@Test
	public void dataTypeListenerTest() {
		final Course newCourse = SchoolFactory.eINSTANCE.createCourse();
		final String newCourseSubject = "NewCourse";
		newCourse.setSubject(newCourseSubject);
		
		Set<EDataType> dataTypes = new HashSet<EDataType>();
		dataTypes.add(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType());
		
		DataTypeListener dataTypeListener = new DataTypeListener() {

			@Override
			public void dataTypeInstanceInserted(EDataType type, Object instance) {
				assertTrue(newCourseSubject.matches((String) instance) &&
						type.equals(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType()));
			}

			@Override
			public void dataTypeInstanceDeleted(EDataType type, Object instance) {
				assertTrue(newCourseSubject.matches((String) instance) &&
						type.equals(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType()));
			}
		};
		navigationHelper.registerEDataTypes(dataTypes);
		navigationHelper.registerDataTypeListener(dataTypes, dataTypeListener);
		
		final RecordingCommand command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				ResourceAccess.getSchool().getCourses().add(newCourse);
			}
		};
		try {
			ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
			ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
		}
		finally {
			navigationHelper.unregisterEDataTypes(dataTypes);
			navigationHelper.unregisterDataTypeListener(dataTypes, dataTypeListener);
		}
	}
	
}
