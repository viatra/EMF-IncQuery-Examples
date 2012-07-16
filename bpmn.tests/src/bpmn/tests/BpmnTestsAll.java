package bpmn.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses({
	BpmnTestsBasic.class,
	BpmnTestsModelManipulation.class
})

public class BpmnTestsAll {

}
