package hu.bme.mit.ecorequery.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value = Suite.class)
@SuiteClasses({
	EcorequeriesBasicTest.class,
	ModelManipulationEcorequeriesTest.class
})

public class EcorequeriesTestsAll {

}
