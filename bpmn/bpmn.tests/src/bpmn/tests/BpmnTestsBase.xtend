package bpmn.tests

import com.google.inject.Inject
import org.eclipse.viatra2.emf.incquery.snapshot.EIQSnapshot.IncQuerySnapshot
import org.eclipse.viatra2.emf.incquery.testing.core.ModelLoadHelper
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel

class BpmnTestsBase {
	
	@Inject extension ModelLoadHelper

	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	def queryInputXMI() { // Creates new resource set
		return "bpmn.incquery/queries/globalEiqModel.xmi".loadPatternModelFromUri as PatternModel
	}
	
	def queryInputEIQ() { // Creates new resource set
		return "bpmn.incquery/src/bpmn1/bpmn1.eiq".loadPatternModelFromUri as PatternModel
	}
		
	def snapshot() { // Creates new resource set
		return "bpmn.tests/model/tests.eiqsnapshot".loadExpectedResultsFromUri as IncQuerySnapshot
	}
	
	
}