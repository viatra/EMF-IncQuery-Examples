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
import org.junit.Assert
import org.eclipse.viatra2.emf.incquery.runtime.api.GenericPatternMatch
import org.eclipse.stp.bpmn.Activity

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class BpmnTestsModelManipulation extends BpmnTestsBase {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper

/* 		//bpmn1_buggy.eiq
	@Test
	def tests_changeActivityName(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change an Activity "Lonely" name to "NewName"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.someTypeOfEvent")
		val match = matcher.allMatches

		for(GenericPatternMatch g : match){
			val a = g.get("E") as Activity
			Assert::assertNotNull(a)
			if(a != null){			
				if(a.name == "Lonely"){
					a.setName("NewName")
				}				
			}
		}
		
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("bpmn.tests/model/tests_2_changeActivityName.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}
*/	

	@Test
	def tests_changeActivityName(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change an Activity "Lonely" name to "NewName"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.lonelyActivity")
		val match = matcher.allMatches

		for(GenericPatternMatch g : match){
			val a = g.get("E") as Activity
			Assert::assertNotNull(a)
			if(a != null){			
				if(a.name == "Lonely"){
					a.setName("NewName")
				}				
			}
		}
		
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("bpmn.tests/model/tests_changeActivityName.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}

	
}