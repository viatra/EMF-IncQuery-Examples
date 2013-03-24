package org.eclipse.incquery.runtime.base.test;

import org.eclipse.incquery.runtime.base.test.attribute.AttributeValueTest;
import org.eclipse.incquery.runtime.base.test.containment.ContainmentManglingTest;
import org.eclipse.incquery.runtime.base.test.datatype.DataTypeTest;
import org.eclipse.incquery.runtime.base.test.feature.FeatureTest;
import org.eclipse.incquery.runtime.base.test.instance.InstanceTest;
import org.eclipse.incquery.runtime.base.test.inverseref.InverseReferenceTest;
import org.eclipse.incquery.runtime.base.test.listener.DataTypeListenerTest;
import org.eclipse.incquery.runtime.base.test.listener.FeatureListenerTest;
import org.eclipse.incquery.runtime.base.test.listener.InstanceListenerTest;
import org.eclipse.incquery.runtime.base.test.scope.ParameterizedScopeTest;
import org.eclipse.incquery.runtime.base.test.scope.ResourceSetScopeTest;
import org.eclipse.incquery.runtime.base.test.tc.TransitiveClosureHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	InverseReferenceTest.class,
	AttributeValueTest.class,
	InstanceTest.class,
	FeatureTest.class,
	DataTypeTest.class,
	FeatureListenerTest.class,
	DataTypeListenerTest.class,
	InstanceListenerTest.class,
	TransitiveClosureHelperTest.class,
	ParameterizedScopeTest.class,
	ResourceSetScopeTest.class,
	ContainmentManglingTest.class
})
public class IncQueryBaseTestSuite {

}
