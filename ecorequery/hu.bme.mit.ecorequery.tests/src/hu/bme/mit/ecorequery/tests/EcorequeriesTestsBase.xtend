package hu.bme.mit.ecorequery.tests

import com.google.inject.Inject
import org.eclipse.viatra2.emf.incquery.snapshot.EIQSnapshot.IncQuerySnapshot
import org.eclipse.viatra2.emf.incquery.testing.core.ModelLoadHelper
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel

class EcorequeryTestsBase {
	
	@Inject extension ModelLoadHelper
	
	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	def queryInputXMI() { // Creates new resource set
		return "hu.bme.mit.ecorequery/queries/globalEiqModel.xmi".loadPatternModelFromUri as PatternModel
	}
	
	def queryInputEIQ() { // Creates new resource set
		return "hu.bme.mit.ecorequery/src/hu/bme/mit/incquery/ecorequeries/example/queries.eiq".loadPatternModelFromUri as PatternModel
	}
		
	def snapshot() { // Creates new resource set
		return "hu.bme.mit.ecorequery.tests/model/tests.eiqsnapshot".loadExpectedResultsFromUri as IncQuerySnapshot
	}
	
	
}