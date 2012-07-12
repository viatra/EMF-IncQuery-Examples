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
import org.eclipse.viatra2.emf.incquery.runtime.api.GenericPatternMatch
import org.junit.Assert
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.ENamedElement

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class EcorequeriesTestsModelManipulation extends EcorequeryTestsBase {
		
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
		
	@Test
	def testsChangeEClassName(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change an EClass "BusinessApplication" name to "NewName"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "hu.bme.mit.incquery.ecorequeries.example.EClass")
		val match = matcher.allMatches
		
		for(GenericPatternMatch g : match){
			val e = g.get("EClass") as EClass
			Assert::assertNotNull(e)
			if(e != null){
				if(e.name == "BusinessApplication"){
					e.setName("NewName")
				}
			}
		}
		
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("hu.bme.mit.ecorequery.tests/model/tests_changeEClassName.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}
	
	
	@Test
	def testsCreateEAttribute(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new EAttribute "NewEAttribute" to the model
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "hu.bme.mit.incquery.ecorequeries.example.EClass")
		val match = matcher.allMatches
		
		Assert::assertNotNull(match)
		if (match != null) {			
			for(GenericPatternMatch g : match){
				val e = g.get("EClass") as EClass
				Assert::assertNotNull(e)
				if(e != null){
					if(e.name == "BusinessProcess"){
						val newEAttribute = EcoreFactory::eINSTANCE.createEAttribute
						newEAttribute.setName("NewEAttribute")
						e.EStructuralFeatures.add(newEAttribute)
						//e.EAttributes.add(newEAttribute)						
					}
				}
			}
					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("hu.bme.mit.ecorequery.tests/model/tests_newEAttribute.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
			
	}
}