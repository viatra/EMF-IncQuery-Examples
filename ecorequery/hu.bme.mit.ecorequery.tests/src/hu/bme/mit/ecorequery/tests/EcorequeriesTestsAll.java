package hu.bme.mit.ecorequery.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value = Suite.class)
@SuiteClasses({
	EcorequeriesTestsBasic.class,
	EcorequeriesTestsModelManipulation.class
})

public class EcorequeriesTestsAll {

}
