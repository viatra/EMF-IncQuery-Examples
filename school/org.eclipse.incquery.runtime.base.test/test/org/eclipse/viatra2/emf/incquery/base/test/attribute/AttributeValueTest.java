package org.eclipse.viatra2.emf.incquery.base.test.attribute;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.viatra2.emf.incquery.base.test.IncQueryBaseTest;
import org.junit.Test;

import school.SchoolFactory;

public class AttributeValueTest extends IncQueryBaseTest {
	
	@Test
	public void attributeTestPatternNameByValue() {
		Collection<Setting> result = navigationHelper.findByAttributeValue("Budapest University of Technology and Economics");
		assertTrue(result.size() == 1);
	}

	@Test
	public void attributeTestPatternNameByValueAndAttribute() {		
		Collection<EObject> result = navigationHelper.findByAttributeValue("Budapest University of Technology and Economics", SchoolFactory.eINSTANCE.getSchoolPackage().getSchool_Name());
		assertTrue(result.size() == 1);
	}

	@Test
	public void attributeTestPatternNameByValueAndAttributes() {		
		List<EAttribute> attributes = new ArrayList<EAttribute>();
		attributes.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchool_Name());
		attributes.add(SchoolFactory.eINSTANCE.getSchoolPackage().getCourse_Subject());
		Collection<Setting> result = navigationHelper.findByAttributeValue("Graph transformations", attributes);
		assertTrue(result.size() == 1);
	}
}
