package org.eclipse.incquery.examples.bpmn.ttc2013.simulator

import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryEventSourceSpecification
import java.util.Random
import org.eclipse.bpmn2.Task

class AlphabeticalConflictSet extends BasicConflictSet {
	AlphabeticalConflictResolver resolver;
	Random rnd = new Random();
	
	new(AlphabeticalConflictResolver resolver) {
		this.resolver = resolver
	}

	override getConflictResolver() {
		resolver
	}
	
	override getNextActivation() {
		if (activations.empty) null;
		val filtered = activations.filter[a | 
			/* rule enter */ null == (a.instance.specification.sourceSpecification as IncQueryEventSourceSpecification).querySpecification 
		]
		if (filtered.empty) {
			val index = rnd.nextInt(activations.size());
			activations.toList.get(index)
		} else {
			filtered.sortBy [ a |
				val match = a.atom as IPatternMatch
				val task = match.get(0 /* TODO */) as Task
				task.name
			].get(0)
		}
	}
	
	override getNextActivations() {
		activations
	}
	
}