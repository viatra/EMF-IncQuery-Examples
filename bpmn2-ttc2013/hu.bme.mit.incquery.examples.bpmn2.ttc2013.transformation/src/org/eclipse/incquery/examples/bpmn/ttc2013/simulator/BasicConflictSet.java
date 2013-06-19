package org.eclipse.incquery.examples.bpmn.ttc2013.simulator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.ConflictResolver;
import org.eclipse.incquery.runtime.evm.api.ConflictSet;

public abstract class BasicConflictSet implements ConflictSet {
	
	protected Set<Activation<?>> activations = new HashSet<Activation<?>>();

	@Override
	public Set<Activation<?>> getConflictingActivations() {
		return activations;
	}

	@Override
	public boolean addActivation(Activation<?> activation) {
		return activations.add(activation);
	}

	@Override
	public boolean removeActivation(Activation<?> activation) {
		return activations.remove(activation);
	}

}
