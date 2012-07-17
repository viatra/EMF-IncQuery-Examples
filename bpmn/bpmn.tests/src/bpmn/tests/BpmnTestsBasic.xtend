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

}