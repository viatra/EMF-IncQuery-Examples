package org.eclipse.incquery.runtime.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.incquery.runtime.base.api.DataTypeListener;

import school.SchoolPackage;

/**
 * {@link DataTypeListener} based test of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class DataTypeListenerTest extends IncQueryBaseListenerTest {
	
	private DataTypeListener dataTypeListener;
	private Set<EDataType> dataTypes;
	
	public DataTypeListenerTest(Notifier notifier) {
		super(notifier, false);
		
		dataTypeListener = new DataTypeListener() {

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
		
		dataTypes = new HashSet<EDataType>();
		dataTypes.add(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType());
	}

	@Override
	public void registerListener() {
		navigationHelper.registerEDataTypes(dataTypes);
		navigationHelper.addDataTypeListener(dataTypes, dataTypeListener);
	}

	@Override
	public void unregisterListener() {
		navigationHelper.removeDataTypeListener(dataTypes, dataTypeListener);
		navigationHelper.unregisterEDataTypes(dataTypes);
	}
}
