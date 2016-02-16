package school.base.test.attribute;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.junit.Test;

import school.base.test.SchoolBaseDynamicParameterizedTest;
import school.base.test.util.DynamicResourceMetamodel;

/**
 * Test cases used to test the {@link EAttribute} related getters of EMF-IncQuery Base for dynamic EMF model.
 * 
 * @author Tamas Szabo
 *
 */
public class DynamicAttributeValueTest extends SchoolBaseDynamicParameterizedTest {
	
	private static final String SCHOOL_NAME = "Budapest University of Technology and Economics";

	public DynamicAttributeValueTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * String based {@link EAttribute} holder finding
	 */
	@Test
	public void valueTest() {
		Collection<Setting> result = navigationHelper.findByAttributeValue(SCHOOL_NAME);
		assertTrue(result.size() == 1);
	}

	/**
	 * String based {@link EAttribute} holder finding with fixed {@link EAttribute} instance
	 */
	@Test
	public void valueAndAttributeTest() {		
		Collection<EObject> result = navigationHelper.findByAttributeValue(SCHOOL_NAME, DynamicResourceMetamodel.eINSTANCE.SchoolNameEAttribute);
		assertTrue(result.size() == 1);
	}

	/**
	 * String based {@link EAttribute} holder finding with fixed collection of {@link EAttribute} instances
	 */
	@Test
	public void valueAndAttributesTest() {		
		List<EAttribute> attributes = new ArrayList<EAttribute>();
		attributes.add(DynamicResourceMetamodel.eINSTANCE.SchoolNameEAttribute);
		attributes.add(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute);
		Collection<Setting> result = navigationHelper.findByAttributeValue("Graph transformations", attributes);
		assertTrue(result.size() == 1);
	}
}
