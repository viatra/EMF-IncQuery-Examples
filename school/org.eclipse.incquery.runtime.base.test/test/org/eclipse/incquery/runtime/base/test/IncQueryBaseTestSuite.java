package org.eclipse.incquery.runtime.base.test;

import org.eclipse.incquery.runtime.base.test.attribute.AttributeValueTest;
import org.eclipse.incquery.runtime.base.test.attribute.DynamicAttributeValueTest;
import org.eclipse.incquery.runtime.base.test.containment.ContainmentManglingTest;
import org.eclipse.incquery.runtime.base.test.datatype.DataTypeTest;
import org.eclipse.incquery.runtime.base.test.datatype.DynamicDataTypeTest;
import org.eclipse.incquery.runtime.base.test.feature.DynamicFeatureTest;
import org.eclipse.incquery.runtime.base.test.feature.FeatureTest;
import org.eclipse.incquery.runtime.base.test.instance.DynamicInstanceTest;
import org.eclipse.incquery.runtime.base.test.instance.InstanceTest;
import org.eclipse.incquery.runtime.base.test.inverseref.DynamicInverseReferenceTest;
import org.eclipse.incquery.runtime.base.test.inverseref.InverseReferenceTest;
import org.eclipse.incquery.runtime.base.test.inverseref.MixedDynamicInverseReferenceTest;
import org.eclipse.incquery.runtime.base.test.inverseref.MixedNonDynamicInverseReferenceTest;
import org.eclipse.incquery.runtime.base.test.listener.DataTypeListenerTest;
import org.eclipse.incquery.runtime.base.test.listener.FeatureListenerTest;
import org.eclipse.incquery.runtime.base.test.listener.InstanceListenerTest;
import org.eclipse.incquery.runtime.base.test.scope.ParameterizedScopeTest;
import org.eclipse.incquery.runtime.base.test.scope.ResourceSetScopeTest;
import org.eclipse.incquery.runtime.base.test.tc.DynamicTransitiveClosureHelperTest;
import org.eclipse.incquery.runtime.base.test.tc.TransitiveClosureHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	InverseReferenceTest.class,
	DynamicInverseReferenceTest.class,
	MixedDynamicInverseReferenceTest.class,
	MixedNonDynamicInverseReferenceTest.class,
	
	AttributeValueTest.class,
	DynamicAttributeValueTest.class,
	
	InstanceTest.class,
	DynamicInstanceTest.class,
	
	FeatureTest.class,
	DynamicFeatureTest.class,
	
	DataTypeTest.class,
	DynamicDataTypeTest.class,
	
	FeatureListenerTest.class,
	DataTypeListenerTest.class,
	InstanceListenerTest.class,
	
	TransitiveClosureHelperTest.class,
	DynamicTransitiveClosureHelperTest.class,
	
	ParameterizedScopeTest.class,
	ResourceSetScopeTest.class,
	ContainmentManglingTest.class
})
public class IncQueryBaseTestSuite {

}
