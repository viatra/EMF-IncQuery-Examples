package school.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.base.api.DataTypeListener;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import school.SchoolPackage;

/**
 * {@link DataTypeListener} based test of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class DataTypeListenerTest extends QueryBaseListenerTest {
	
	private DataTypeListener dataTypeListener;
	private Set<EDataType> dataTypes;
	
	private Multiset<EDataType> receivedInsert = HashMultiset.create();
	private Multiset<EDataType> receivedDelete = HashMultiset.create();
	
	public DataTypeListenerTest(Notifier notifier) {
		super(notifier, false);
		
		dataTypeListener = new DataTypeListener() {

			@Override
			public void dataTypeInstanceInserted(EDataType type, Object instance, boolean first) {
				receivedInsert.add(type);
				assertTrue(
						newCourseSubject.equals(instance) &&
						type.equals(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType()) &&
						first ||
						preExistingCourseWeight.equals(instance) &&
						type.equals(SchoolPackage.eINSTANCE.getCourse_Weight().getEAttributeType()) &&
						!first
				);
			}

			@Override
			public void dataTypeInstanceDeleted(EDataType type, Object instance, boolean last) {
				receivedDelete.add(type);
				assertTrue(
						newCourseSubject.equals(instance) &&
						type.equals(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType()) &&
						last ||
						preExistingCourseWeight.equals(instance) &&
						type.equals(SchoolPackage.eINSTANCE.getCourse_Weight().getEAttributeType()) &&
						!last
				);
			}
		};
		
		dataTypes = new HashSet<EDataType>();
		dataTypes.add(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType());
		dataTypes.add(SchoolPackage.eINSTANCE.getCourse_Weight().getEAttributeType());
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
		
		assertTrue(2 == receivedInsert.size());
		assertTrue(1 == receivedInsert.count(SchoolPackage.eINSTANCE.getCourse_Subject().getEAttributeType()));
		assertTrue(1 == receivedInsert.count(SchoolPackage.eINSTANCE.getCourse_Weight().getEAttributeType()));
		assertTrue(receivedInsert.equals(receivedDelete));
	}
}
