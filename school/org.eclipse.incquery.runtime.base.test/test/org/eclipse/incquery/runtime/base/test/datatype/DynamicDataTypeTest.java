package org.eclipse.incquery.runtime.base.test.datatype;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseDynamicParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.DynamicResourceMetamodel;
import org.junit.Test;

/**
 * Test cases used to test the {@link EDataType} related getters of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class DynamicDataTypeTest extends IncQueryBaseDynamicParameterizedTest {

	public DynamicDataTypeTest(Notifier notifier) {
		super(notifier);
	}

	/**
	 * Data type test for EInt
	 */
	@Test
	public void integerTest() {
		//these integers are present in the model , the EAttribute will be EInt
		Integer[] expectedNumbers = new Integer[] {0, 17, 20, 23, 37, 2011, 2012, 30};	
		List<Object> result = new ArrayList<Object>(navigationHelper.getDataTypeInstances(DynamicResourceMetamodel.eINSTANCE.YearStartingDateEAttribute.getEAttributeType()));
		
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
		Collection<Object> result = navigationHelper.getDataTypeInstances(DynamicResourceMetamodel.eINSTANCE.SchoolClassCodeEAttribute.getEAttributeType());
		for (Character c : expectedChars) {
			assertTrue(result.contains(c));
		}
	}
}
