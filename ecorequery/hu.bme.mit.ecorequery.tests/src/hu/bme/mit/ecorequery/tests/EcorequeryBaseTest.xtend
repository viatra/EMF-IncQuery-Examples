package hu.bme.mit.ecorequery.tests

import com.google.inject.Inject
import org.eclipse.incquery.testing.core.ModelLoadHelper
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.incquery.testing.core.base.CommonStaticQueryTester

class EcorequeryBaseTest extends CommonStaticQueryTester {
	
	@Inject extension ModelLoadHelper
	
	def queryInputEIQ() { // Creates new resource set
		return "hu.bme.mit.ecorequery/src/hu/bme/mit/incquery/ecorequeries/example/queries.eiq".loadPatternModelFromUri as PatternModel
	}

	override snapshotURI() {"hu.bme.mit.ecorequery.tests/model/tests.eiqsnapshot"}	
	override queryInputXMIURI() {"hu.bme.mit.ecorequery/queries/globalEiqModel.xmi"}
	
}