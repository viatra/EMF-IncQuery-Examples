package school.base.test.inverseref;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.viatra.query.runtime.base.exception.ViatraBaseException;
import org.junit.Before;
import org.junit.Test;

import school.base.test.SchoolBaseDynamicParameterizedTest;
import school.base.test.util.DynamicResourceMetamodel;

/**
 * Test cases used to test the inverse reference getters of EMF-IncQuery Base for dynamic EMF model.
 * 
 * @author Tamas Szabo
 *
 */
public class DynamicInverseReferenceTest extends SchoolBaseDynamicParameterizedTest {

	public DynamicInverseReferenceTest(Notifier notifier) {
		super(notifier);
	}

	private EObject year2012;
	private EObject student;
		
	@Override
	@Before
	public void init() throws ViatraBaseException {
		super.init();
		year2012 =  navigationHelper.findByAttributeValue(2012).iterator().next().getEObject();
		student = navigationHelper.findByAttributeValue("Abel Hegedus").iterator().next().getEObject();
	}
	
	/**
	 * Inverse reference resolving based on a school year
	 */
	@Test
	public void valueTest() {		
		Collection<Setting> result = navigationHelper.getInverseReferences(year2012);
		assertTrue(result.size() == 3);
		
		for (Setting setting : result) {
			assertEquals(year2012, setting.get(false));
		}
	}
	
	/**
	 * Inverse reference resolving based on a school year and a given {@link EReference} instance
	 */
	@Test
	public void valueAndReferenceTest() {		
		Collection<EObject> result = navigationHelper.getInverseReferences(year2012, DynamicResourceMetamodel.eINSTANCE.SchoolYearsEReference);
		assertTrue(result.size() == 1);
	}
	
	/**
	 * Inverse reference resolving based on a student and a {@link Collection} of {@link EReference}s
	 */
	@Test
	public void valueAndReferencesTest() {
		List<EReference> references = new ArrayList<EReference>();
		references.add(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference);
		references.add(DynamicResourceMetamodel.eINSTANCE.SchoolClassStudentsEReference);
		
		Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
		assertTrue(result.size() == 3);
		
		for (Setting setting : result) {
			assertEquals(student, setting.get(false));
		}
	}
}
