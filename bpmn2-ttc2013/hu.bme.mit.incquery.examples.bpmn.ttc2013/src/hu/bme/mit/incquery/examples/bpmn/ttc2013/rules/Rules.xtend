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

class Rules {
	IncQueryEngine engine
	long debug
	Resource bpmnResource
	Resource bpmn20execResource
	
	static val bpmnexecf = Bpmn20execFactory::eINSTANCE;
	
	new(IncQueryEngine engine, Resource bpmnResource, Resource bpmn20execResource, String basePath, long debug) {
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
			
		]
		
		newHashSet(
		newSimpleMatcherRuleSpecification(StartEventOfProcessMatcher::querySpecification,
			DefaultActivationLifeCycle::DEFAULT_NO_UPDATE_AND_DISAPPEAR,
			newHashSet(newStatelessJob(IncQueryActivationStateEnum::APPEARED, processor))) as RuleSpecification<?> 
		)
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