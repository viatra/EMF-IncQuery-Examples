package hu.bme.mit.ecorequery.tests

import com.google.inject.Inject
import org.eclipse.viatra2.emf.incquery.testing.core.ModelLoadHelper
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel
import org.eclipse.viatra2.emf.incquery.testing.core.base.CommonStaticQueryTester

class EcorequeryTestsBase extends CommonStaticQueryTester {
	
	@Inject extension ModelLoadHelper
	
	def queryInputEIQ() { // Creates new resource set
		return "hu.bme.mit.ecorequery/src/hu/bme/mit/incquery/ecorequeries/example/queries.eiq".loadPatternModelFromUri as PatternModel
	}

	override snapshotURI() {"hu.bme.mit.ecorequery.tests/model/tests.eiqsnapshot"}	
	override queryInputXMIURI() {"hu.bme.mit.ecorequery/queries/globalEiqModel.xmi"}
	
}