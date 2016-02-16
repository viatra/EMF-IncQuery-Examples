package school.base.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import school.base.test.attribute.AttributeValueTest;
import school.base.test.attribute.DynamicAttributeValueTest;
import school.base.test.containment.ContainmentManglingTest;
import school.base.test.datatype.DataTypeTest;
import school.base.test.datatype.DynamicDataTypeTest;
import school.base.test.feature.DynamicFeatureTest;
import school.base.test.feature.FeatureTest;
import school.base.test.instance.DynamicInstanceTest;
import school.base.test.instance.InstanceTest;
import school.base.test.inverseref.DynamicInverseReferenceTest;
import school.base.test.inverseref.InverseReferenceTest;
import school.base.test.inverseref.MixedDynamicInverseReferenceTest;
import school.base.test.inverseref.MixedNonDynamicInverseReferenceTest;
import school.base.test.listener.DataTypeListenerTest;
import school.base.test.listener.FeatureListenerTest;
import school.base.test.listener.InstanceListenerTest;
import school.base.test.listener.LightweightObserverTest;
import school.base.test.qrm.QueryResultMapTest;
import school.base.test.qrm.QueryResultMultimapTest;
import school.base.test.scope.ParameterizedScopeTest;
import school.base.test.scope.ResourceSetScopeTest;
import school.base.test.tc.DynamicTransitiveClosureHelperTest;
import school.base.test.tc.TransitiveClosureHelperTest;

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
	LightweightObserverTest.class,
	
	TransitiveClosureHelperTest.class,
	DynamicTransitiveClosureHelperTest.class,
	
	ParameterizedScopeTest.class,
	ResourceSetScopeTest.class,
	ContainmentManglingTest.class,
	
	QueryResultMapTest.class,
	QueryResultMultimapTest.class
})
public class SchoolBaseTestSuite {

}
