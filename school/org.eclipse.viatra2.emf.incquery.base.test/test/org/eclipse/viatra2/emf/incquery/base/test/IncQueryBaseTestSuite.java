package org.eclipse.viatra2.emf.incquery.base.test;

import org.eclipse.viatra2.emf.incquery.base.test.attribute.AttributeValueTest;
import org.eclipse.viatra2.emf.incquery.base.test.datatype.DataTypeTest;
import org.eclipse.viatra2.emf.incquery.base.test.feature.FeatureTest;
import org.eclipse.viatra2.emf.incquery.base.test.instance.InstanceTest;
import org.eclipse.viatra2.emf.incquery.base.test.inverseref.InverseReferenceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	InverseReferenceTest.class,
	AttributeValueTest.class,
	InstanceTest.class,
	FeatureTest.class,
	DataTypeTest.class
})
public class IncQueryBaseTestSuite {

}
