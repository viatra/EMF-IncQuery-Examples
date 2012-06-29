package school.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses({
	SchoolTestsBasic.class,
	SchoolTestsModelManipulation.class
})
public class SchoolTestsAll { }
