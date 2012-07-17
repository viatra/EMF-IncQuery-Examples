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
import org.eclipse.stp.bpmn.BpmnFactory
import org.eclipse.stp.bpmn.Pool
import org.eclipse.stp.bpmn.SequenceEdge

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class BpmnTestsModelManipulation extends BpmnTestsBase {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper

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
			val a = g.get("A") as Activity
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
	
	@Test
	def tests_createArtifact(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add an Artifact "NewArtifact" to the Pool "Pool0"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.pool")
		val match = matcher.allMatches

		for(GenericPatternMatch g : match){
			val pool = g.get("P") as Pool
			Assert::assertNotNull(pool)
			if(pool != null){			
				if(pool.name == "Pool0"){
					val artifact = BpmnFactory::eINSTANCE.createArtifact					
					artifact.setName("NewArtifact")
					pool.artifacts.add(artifact)					
				}				
			}
		}
				
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("bpmn.tests/model/tests_createArtifact.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}
	
	@Test
	def tests_changeSequenceEdgeName(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change a SequenceEdge "StartToTask" name to "NewEdge"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.pool")
		val match = matcher.allMatches

		for(GenericPatternMatch g : match){
			val pool = g.get("P") as Pool
			Assert::assertNotNull(pool)
			if(pool != null){			
				if(pool.name == "Pool"){
					for(SequenceEdge l : pool.sequenceEdges){
						if(l.name == "StartToTask"){
							l.setName("NewEdge")
						}
					}
				}				
			}
		}
				
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("bpmn.tests/model/tests_changeSequenceEdgeName.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}
	
	@Test
	def tests_deleteSequenceEdge(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete a SequenceEdge "StartToTask"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.pool")
		val match = matcher.allMatches

		for(GenericPatternMatch g : match){
			val pool = g.get("P") as Pool
			Assert::assertNotNull(pool)
			if(pool != null){			
				if(pool.name == "Pool"){
					
					val se = pool.sequenceEdges		
					val iterator = se.iterator
					while(iterator.hasNext()){
						val item = iterator.next
						if(item.name == "StartToTask")
			        		iterator.remove();
					}						
					
				}				
			}
		}
				
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("bpmn.tests/model/tests_deleteSequenceEdge.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}
	
			@Test
	def tests_createSequenceEdge(){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a SequenceEdge "NewEdge" in the Pool "Pool0" and set the Source and Target Activity
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.pool")
		val match = matcher.allMatches
		val matcher2 = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "bpmn1.lonelyActivity")
		val match2 = matcher2.allMatches

		for(GenericPatternMatch g : match){
			val pool = g.get("P") as Pool
			Assert::assertNotNull(pool)
			if(pool != null){			
				if(pool.name == "Pool0"){					
					val newsequence = BpmnFactory::eINSTANCE.createSequenceEdge
					newsequence.setName("NewEdge")
					
					//Search two Activity for Source and Target
					for(GenericPatternMatch g2 : match2){
						val a = g2.get("A") as Activity
						Assert::assertNotNull(a)
						if(a != null){			
							if(a.name == "Lonely"){
								newsequence.setSource(a)	
							}
							if(a.name == "SomeTask"){
								newsequence.setTarget(a)
							}				
						}	
					}
									
					pool.sequenceEdges.add(newsequence)					
				}				
			}
		}
		
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("bpmn.tests/model/tests_createSequenceEdge.eiqsnapshot")
		pm.assertMatchResults(newSns)
	}
		
}