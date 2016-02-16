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

import school.SchoolFactory;
import school.base.test.SchoolBaseParameterizedTest;

/**
 * Test cases used to test the {@link EAttribute} related getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class AttributeValueTest extends SchoolBaseParameterizedTest {
	
	private static final String SCHOOL_NAME = "Budapest University of Technology and Economics";

	public AttributeValueTest(Notifier notifier) {
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
		Collection<EObject> result = navigationHelper.findByAttributeValue(SCHOOL_NAME, SchoolFactory.eINSTANCE.getSchoolPackage().getSchool_Name());
		assertTrue(result.size() == 1);
	}

	/**
	 * String based {@link EAttribute} holder finding with fixed collection of {@link EAttribute} instances
	 */
	@Test
	public void valueAndAttributesTest() {		
		List<EAttribute> attributes = new ArrayList<EAttribute>();
		attributes.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchool_Name());
		attributes.add(SchoolFactory.eINSTANCE.getSchoolPackage().getCourse_Subject());
		Collection<Setting> result = navigationHelper.findByAttributeValue("Graph transformations", attributes);
		assertTrue(result.size() == 1);
	}
}
