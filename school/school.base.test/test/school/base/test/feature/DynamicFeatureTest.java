package school.base.test.feature;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Test;

import school.base.test.SchoolBaseDynamicParameterizedTest;
import school.base.test.util.DynamicResourceMetamodel;
import school.base.test.util.ModelManager;

/**
 * Test cases used to test the {@link EStructuralFeature} related getters of EMF-IncQuery Base with dynamic EMF model.
 * 
 * @author Tamas Szabo
 *
 */
public class DynamicFeatureTest extends SchoolBaseDynamicParameterizedTest {

	public DynamicFeatureTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * Finding all students in the model
	 */
	@Test
	public void holderTest() {		
		Collection<EObject> result = navigationHelper.getHoldersOfFeature(DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute);
		for (EObject obj : ModelManager.getAllContents(notifier)) {
			if (obj.eClass().equals(DynamicResourceMetamodel.eINSTANCE.StudentEClass)) {
				assertTrue(result.contains(obj));
			}
		}
	}
	
	private static final String SCHOOL_NAME = "Budapest University of Technology and Economics";
	
	/**
	 * Feature holder resolving based on String literal
	 */
	@Test
	public void stringValueTest() {
		Collection<EObject> result = navigationHelper.findByFeatureValue(SCHOOL_NAME, DynamicResourceMetamodel.eINSTANCE.SchoolNameEAttribute);
		assertTrue(result.size() == 1);
	}
	
	/**
	 * Feature holder resolving based on Integer value
	 */
	@Test
	public void integerValueTest() {
		Collection<EObject> result = navigationHelper.findByFeatureValue(2011, DynamicResourceMetamodel.eINSTANCE.YearStartingDateEAttribute);
		assertTrue(result.size() == 1);
	}
}
