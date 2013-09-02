package hu.bme.mit.incquery.examples.bpmn.ttc2013.rules

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import java.util.Collection
import org.eclipse.incquery.runtime.api.IncQueryEngine

import static org.eclipse.incquery.runtime.evm.specific.Rules.*
import static org.eclipse.incquery.runtime.evm.specific.Jobs.*
import org.eclipse.incquery.runtime.evm.specific.lifecycle.DefaultActivationLifeCycle
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum
import org.eclipse.incquery.runtime.api.IMatchProcessor
import org.eclipse.emf.ecore.resource.Resource
import bpmn20exec.Bpmn20execFactory
import bpmn20exec.ProcessState
import org.eclipse.incquery.runtime.evm.api.RuleSpecification
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.StartEventOfProcessMatch
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.StartEventOfProcessMatcher
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.StartingMatch
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.StartingMatcher
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.EndingMatch
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.EndingMatcher
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.EnteringTasksMatch
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.EnteringTasksMatcher
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.LeavingTasksMatch
import org.eclipse.incquery.examples.bpmn.ttc2013.queries.LeavingTasksMatcher

class Rules {
	IncQueryEngine engine
	long debug
	Resource bpmnResource
	Resource bpmn20execResource
	
	static val bpmnexecf = Bpmn20execFactory::eINSTANCE;
	
	new(IncQueryEngine engine, Resource bpmnResource, Resource bpmn20execResource) {
		this.debug = debug
		this.engine = engine
		this.bpmnResource = bpmnResource
		this.bpmn20execResource = bpmn20execResource
	}
	
	/*
	 * TASK 1: Process Instantiation
	 */
	def createProcessInstantiationRuleSpecification() {
		val IMatchProcessor<StartEventOfProcessMatch> processor = [
			var processInstance = bpmnexecf.createProcessInstance
			processInstance.state = ProcessState::RUNNING
			processInstance.moveTo(bpmn20execResource.contents)
			
			var token = bpmnexecf.createToken
			token.element = event
			processInstance.tokens += token
			
			engine.logger.info("Process instantiated. Token location: \"" + event.name + "\".")
		]
		
		newMatcherRuleSpecification(StartEventOfProcessMatcher::querySpecification,
			DefaultActivationLifeCycle::DEFAULT_NO_UPDATE_AND_DISAPPEAR,
			newHashSet(newRecordingJob(newStatelessJob(IncQueryActivationStateEnum::APPEARED, processor)))) as RuleSpecification<?> 
	}
	
	/*
	 * TASK 2: Starting and ending
	 */
	def createStartingRuleSpecification() {
		val IMatchProcessor<StartingMatch> processor = [
			token.element = sequenceFlow
			engine.logger.info("Process starting. Token location: \"" + sequenceFlow.name + "\".") 
		]
		
		newMatcherRuleSpecification(StartingMatcher::querySpecification,
			DefaultActivationLifeCycle::DEFAULT_NO_UPDATE_AND_DISAPPEAR,
			newHashSet(newRecordingJob(newStatelessJob(IncQueryActivationStateEnum::APPEARED, processor)))) as RuleSpecification<?>
	}
	
	def createEndingRuleSpecification() {
		val IMatchProcessor<EndingMatch> processor = [
			token.element = endEvent
			engine.logger.info("Process ending. Token " + token + " at location: \"" + endEvent.name + "\".")
		]
		
		newMatcherRuleSpecification(EndingMatcher::querySpecification,
			DefaultActivationLifeCycle::DEFAULT_NO_UPDATE_AND_DISAPPEAR,
			newHashSet(newRecordingJob(newStatelessJob(IncQueryActivationStateEnum::APPEARED, processor)))) as RuleSpecification<?> 
	}
	
	def createEnteringTasksRuleSpecification() {
		val IMatchProcessor<EnteringTasksMatch> processor = [
			token.element = task
			engine.logger.info("Entering task \"" + task.name + "\".")
		]
		
		newMatcherRuleSpecification(EnteringTasksMatcher::querySpecification,
			DefaultActivationLifeCycle::DEFAULT_NO_UPDATE_AND_DISAPPEAR,
			newHashSet(newRecordingJob(newStatelessJob(IncQueryActivationStateEnum::APPEARED, processor)))) as RuleSpecification<?> 
	}
	
	def createLeavingTasksRuleSpecification() {
		val IMatchProcessor<LeavingTasksMatch> processor = [		
			processInstance.tokens.remove(token)
			engine.logger.info("Leaving task (1): Removing token " + token + " from location \"" + taskToLeave.name + "\".")
			for(sequenceFlow : taskToLeave.outgoing){
				var newToken = bpmnexecf.createToken
				processInstance.tokens.add(newToken)
				newToken.setElement(sequenceFlow)
				engine.logger.info("Leaving task (2): Creating token " + newToken + " at location \"" + sequenceFlow.name + "\".")
			}
			engine.logger.info("Leaving task: Task \"" + taskToLeave.name + "\" left.")
		]
		
		newMatcherRuleSpecification(LeavingTasksMatcher::querySpecification,
			DefaultActivationLifeCycle::DEFAULT_NO_UPDATE_AND_DISAPPEAR,
			newHashSet(newRecordingJob(newStatelessJob(IncQueryActivationStateEnum::APPEARED, processor)))) as RuleSpecification<?> 
	}
	
	/*
	 * Built-in move command (supported by the engine)
	 */
	def moveTo(EObject what, EList where) {
		engine.baseIndex.cheapMoveTo(what, where)
	}
	def moveTo(Collection<EObject> what, EList where) {
		what.forEach[moveTo(where)]
	}
	
}