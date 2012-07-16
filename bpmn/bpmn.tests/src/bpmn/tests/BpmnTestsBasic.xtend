package bpmn.tests

import com.google.inject.Inject
import org.eclipse.viatra2.emf.incquery.testing.core.ModelLoadHelper
import org.eclipse.viatra2.emf.incquery.testing.core.SnapshotHelper
import org.eclipse.viatra2.emf.incquery.testing.core.TestExecutor
import org.eclipse.viatra2.emf.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel

/**
 * Basic test set for testing IncQuery with the BPMN example.
 * These tests just perform a simple match set check against all the queries in the BPMN example.
 * See http://viatra.inf.mit.bme.hu/incquery/examples/bpmn for details on the example.
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class BpmnTestsBasic extends BpmnTestsBase {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
	
	@Inject
	ParseHelper parseHelper

	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueriesXMI(){
		assertMatchResults(queryInputXMI, snapshot)
	}
	
	// parse pattern from EIQ, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueriesEIQ(){
		assertMatchResults(queryInputEIQ, snapshot)
	}
		
	def testQuery(String queryFQN){
		val sns = snapshot
		val matcher = queryInputXMI.initializeMatcherFromModel(sns.EMFRootForSnapshot, queryFQN)
		val results = matcher.compareResultSets(sns.getMatchSetRecordForPattern(queryFQN))
		assertArrayEquals(newHashSet,results)
	}
	
	
  	//bpmn1.eiq	
	@Test def test_loopingActivity() { testQuery("bpmn1.loopingActivity") }
	@Test def test_badLoopingActivity() { testQuery("bpmn1.badLoopingActivity") }
	@Test def test_lonelyActivity() { testQuery("bpmn1.lonelyActivity") }
	@Test def test_hasInOrOut() { testQuery("bpmn1.hasInOrOut") }
	@Test def test_inEdge() { testQuery("bpmn1.inEdge") }
	@Test def test_outEdge() { testQuery("bpmn1.outEdge") }
	@Test def test_sequenceFlowEdge() { testQuery("bpmn1.sequenceFlowEdge") }
	@Test def test_messageFlowEdge() { testQuery("bpmn1.messageFlowEdge") }


/* 
 	//bpmn1_buggy.eiq
	@Test def test_someTypeOfEvent() { testQuery("bpmn1.someTypeOfEvent") }
	@Test def test_EventStart() { testQuery("bpmn1.EventStart") }
	@Test def test_EventStartEmpty() { testQuery("bpmn1.EventStartEmpty") }
	@Test def test_EventStartMessage() { testQuery("bpmn1.EventStartMessage") }
	@Test def test_EventStartRule() { testQuery("bpmn1.EventStartRule") }
	@Test def test_EventStartTimer() { testQuery("bpmn1.EventStartTimer") }
	@Test def test_EventStartLink() { testQuery("bpmn1.EventStartLink") }
	@Test def test_EventStartMultiple() { testQuery("bpmn1.EventStartMultiple") }
	@Test def test_EventStartSignal() { testQuery("bpmn1.EventStartSignal") }
	@Test def test_EventEndEmpty() { testQuery("bpmn1.EventEndEmpty") }
	@Test def test_EventEndMessage() { testQuery("bpmn1.EventEndMessage") }
	@Test def test_EventEndError() { testQuery("bpmn1.EventEndError") }
	@Test def test_EventEndCompensation() { testQuery("bpmn1.EventEndCompensation") }
	@Test def test_EventEndTerminate() { testQuery("bpmn1.EventEndTerminate") }
	@Test def test_EventEndLink() { testQuery("bpmn1.EventEndLink") }
	@Test def test_EventEndMultiple() { testQuery("bpmn1.EventEndMultiple") }
	@Test def test_EventEndCancel() { testQuery("bpmn1.EventEndCancel") }
	@Test def test_EventEndSignal() { testQuery("bpmn1.EventEndSignal") }
	@Test def test_EventEnd() { testQuery("bpmn1.EventEnd") }
	@Test def test_EventIntermediateEmpty() { testQuery("bpmn1.EventIntermediateEmpty") }
	@Test def test_EventIntermediateMessage() { testQuery("bpmn1.EventIntermediateMessage") }
	@Test def test_EventIntermediateTimer() { testQuery("bpmn1.EventIntermediateTimer") }
	@Test def test_EventIntermediateError() { testQuery("bpmn1.EventIntermediateError") }
	@Test def test_EventIntermediateCompensation() { testQuery("bpmn1.EventIntermediateCompensation") }
	@Test def test_EventIntermediateRule() { testQuery("bpmn1.EventIntermediateRule") }
	@Test def test_EventIntermediateLink() { testQuery("bpmn1.EventIntermediateLink") }
	@Test def test_EventIntermediateMultiple() { testQuery("bpmn1.EventIntermediateMultiple") }
	@Test def test_EventIntermediateCancel() { testQuery("bpmn1.EventIntermediateCancel") }
	@Test def test_EventIntermediateSignal() { testQuery("bpmn1.EventIntermediateSignal") }
	@Test def test_EventIntermediate() { testQuery("bpmn1.EventIntermediate") }	
	
	@Test
	def simpleCorrectTest_EventStartMessage(){
		val patternModel = parseHelper.parse('
			package bpmn1

			import "http://stp.eclipse.org/bpmn"

			pattern EventStartMessage(G)= {
				Activity.activityType(G, ActivityType::EventStartMessage);
			}
		') as PatternModel
		patternModel.assertMatchResults("bpmn.tests/model/tests_2.eiqsnapshot")
	}
	
	@Test
	def simpleCorrectTest_Activities(){
		val patternModel = parseHelper.parse('
			package bpmn1

			import "http://stp.eclipse.org/bpmn"

			pattern Activities(A:Activity) = {
				Activity(A);
			}
		') as PatternModel
		patternModel.assertMatchResults("bpmn.tests/model/tests_2_activities.eiqsnapshot")
	}	
*/
}