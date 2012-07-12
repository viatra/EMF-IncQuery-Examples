package hu.bme.mit.ecorequery.tests

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
 * Basic test set for testing IncQuery with the ECore Queries example.
 * These tests just perform a simple match set check against all the queries in the ECore Queries example.
 * See http://viatra.inf.mit.bme.hu/incquery/new/examples/ecorequery for details on the example.
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class EcorequeriesTestsBasic extends EcorequeryTestsBase {
	
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
	
	// simple test cases, for each query of the school example
	 
	@Test def testEObject() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EObject") }
	@Test def testEClass() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EClass") }
	@Test def testSuperTypeOf() { testQuery("hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf") }
	@Test def testEClassAttribute() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EClassAttribute") }
	@Test def testEClassWithEStringAttribute() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute") }
	@Test def testEReferenceWithStarMultiplicity() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity") }
	@Test def testEReferenceWithOneMultiplicity() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity") }
	@Test def testSampleQuery() { testQuery("hu.bme.mit.incquery.ecorequeries.example.SampleQuery") }
	@Test def testSampleQuery2() { testQuery("hu.bme.mit.incquery.ecorequeries.example.SampleQuery2") }
	@Test def testIsEString() { testQuery("hu.bme.mit.incquery.ecorequeries.example.IsEString") }
	@Test def testECoreNamedElement() { testQuery("hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement") }
	@Test def testIsInECore() { testQuery("hu.bme.mit.incquery.ecorequeries.example.IsInECore") }

	
	
	@Test
	def simpleCorrectTest_EClass(){
		val patternModel = parseHelper.parse('
			package hu.bme.mit.incquery.ecorequeries.example

			import "http://www.eclipse.org/emf/2002/Ecore"

			pattern EClass(EClass) = {
				EClass(EClass);
			}
		') as PatternModel
		patternModel.assertMatchResults("hu.bme.mit.ecorequery.tests/model/tests_EClass.eiqsnapshot")
	}
	
	@Test
	def simpleCorrectTest_EReferenceWithStarMultiplicity(){
		val patternModel = parseHelper.parse('
			package hu.bme.mit.incquery.ecorequeries.example

			import "http://www.eclipse.org/emf/2002/Ecore"

			pattern EReferenceWithStarMultiplicity(ERef) = {
				EReference(ERef);
				ETypedElement.lowerBound(ERef,0); 
				ETypedElement.upperBound(ERef,-1);
			}
		') as PatternModel
		patternModel.assertMatchResults("hu.bme.mit.ecorequery.tests/model/tests_ereferencedWithStarMultiplicity.eiqsnapshot")
	}

}