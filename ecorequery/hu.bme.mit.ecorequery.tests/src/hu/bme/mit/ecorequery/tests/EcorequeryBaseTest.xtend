package hu.bme.mit.ecorequery.tests

import com.google.inject.Inject
import org.eclipse.incquery.testing.core.ModelLoadHelper
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.incquery.testing.core.base.CommonStaticQueryTesterimport com.google.inject.Injector

class EcorequeryBaseTest extends CommonStaticQueryTester {

	@Inject extension ModelLoadHelper
	@Inject var Injector injector

	def queryInputEIQ() { // Creates new resource set
		return queryInputEIQURI().loadPatternModelFromUri(injector) as PatternModel
	}

	override snapshotURI() {"hu.bme.mit.ecorequery.tests/model/tests.eiqsnapshot"}
	override queryInputEIQURI() {"hu.bme.mit.ecorequery/hu/bme/mit/incquery/ecorequeries/example/ecoreQueries.eiq"}

}