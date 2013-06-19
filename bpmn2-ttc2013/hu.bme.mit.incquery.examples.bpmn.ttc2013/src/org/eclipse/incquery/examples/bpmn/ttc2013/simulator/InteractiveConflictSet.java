package org.eclipse.incquery.examples.bpmn.ttc2013.simulator;

import java.util.Set;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.ConflictResolver;
import org.eclipse.incquery.runtime.evm.api.ConflictSet;

public class InteractiveConflictSet extends BasicConflictSet {

	@Override
	public ConflictResolver<? extends ConflictSet> getConflictResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activation<?> getNextActivation() {
		//final options = 
//		Display.asyn
		return null;
	}

	@Override
	public Set<Activation<?>> getNextActivations() {
		return activations;
	}

}
