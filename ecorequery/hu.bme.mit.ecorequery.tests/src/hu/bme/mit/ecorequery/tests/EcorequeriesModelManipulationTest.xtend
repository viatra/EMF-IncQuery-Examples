package hu.bme.mit.ecorequery.tests

import com.google.inject.Inject
import org.eclipse.incquery.testing.core.ModelLoadHelper
import org.eclipse.incquery.testing.core.SnapshotHelper
import org.eclipse.incquery.testing.core.TestExecutor
import org.eclipse.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.junit.Assert
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EStructuralFeature

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class EcorequeriesModelManipulationTest extends EcorequeryBaseTest {
		
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
		
	@Test
	def testsChangeEClassName(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change an EClass "BusinessApplication" name to "NewName"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "hu.bme.mit.incquery.ecorequeries.example.EClass")
		val match = matcher.allMatches
		
		for(IPatternMatch g : match){
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
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new EAttribute "NewEAttribute" to the model
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "hu.bme.mit.incquery.ecorequeries.example.EClass")
		val match = matcher.allMatches
		
		Assert::assertNotNull(match)
		if (match != null) {			
			for(IPatternMatch g : match){
				val e = g.get("EClass") as EClass
				Assert::assertNotNull(e)
				if(e != null){
					if(e.name == "BusinessProcess"){
						val newEAttribute = EcoreFactory::eINSTANCE.createEAttribute
						newEAttribute.setName("NewEAttribute")
						e.EStructuralFeatures.add(newEAttribute)					
					}
				}
			}
					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("hu.bme.mit.ecorequery.tests/model/tests_newAttribute.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
			
	}
	
	@Test
	def testsDeleteEReference(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete an EReference "supports" from EClass "BusinessProcess"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "hu.bme.mit.incquery.ecorequeries.example.EClass")
		val match = matcher.allMatches
		
		Assert::assertNotNull(match)
		if (match != null) {			
			for(IPatternMatch g : match){
				val e = g.get("EClass") as EClass
				Assert::assertNotNull(e)
				if(e != null){
					if(e.name == "BusinessProcess"){						
						
						val list = e.EStructuralFeatures
						val i = list.iterator
						while (i.hasNext()) {
						   val s = i.next();
						   if(s.name == "supports"){
						   	i.remove();						   
						   }
						}
												
					}
				}
			}
					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("hu.bme.mit.ecorequery.tests/model/tests_deleteEReference.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
			
	}
	
	
	@Test
	def testsChangeMultiplicity(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change an EReference "dependsOn" upperBound from 1 to 10
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "hu.bme.mit.incquery.ecorequeries.example.EClass")
		val match = matcher.allMatches
		
		Assert::assertNotNull(match)
		if (match != null) {			
			for(IPatternMatch g : match){
				val e = g.get("EClass") as EClass
				Assert::assertNotNull(e)
				if(e != null){
					if(e.name == "BusinessApplication"){
						val list = e.EStructuralFeatures
						for(EStructuralFeature esf : list){
							if(esf.name == "dependsOn"){
								esf.setUpperBound(10)
							}
						}
											
					}
				}
			}
					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("hu.bme.mit.ecorequery.tests/model/tests_changeMultiplicity.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}			
	}
}