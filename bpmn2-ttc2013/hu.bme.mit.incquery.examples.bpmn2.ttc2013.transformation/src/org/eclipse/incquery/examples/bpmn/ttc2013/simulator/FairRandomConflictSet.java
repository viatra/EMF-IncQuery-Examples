package org.eclipse.incquery.examples.bpmn.ttc2013.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.ConflictResolver;
import org.eclipse.incquery.runtime.evm.api.ConflictSet;

public final class FairRandomConflictSet extends BasicConflictSet {
	final FairRandomConflictResolver resolver;
	Random rnd = new Random();
	
	public FairRandomConflictSet(FairRandomConflictResolver resolver) {
		super();
		this.resolver = resolver;
	}

	@Override
	public ConflictResolver<? extends ConflictSet> getConflictResolver() {
		return resolver;
	}

	@Override
	public Activation<?> getNextActivation() {
		if (activations.isEmpty()) return null;
		int index = rnd.nextInt(activations.size());
		return new ArrayList<Activation<?>>(activations).get(index);
	}

	@Override
	public Set<Activation<?>> getNextActivations() {
		return activations;
	}
	
}