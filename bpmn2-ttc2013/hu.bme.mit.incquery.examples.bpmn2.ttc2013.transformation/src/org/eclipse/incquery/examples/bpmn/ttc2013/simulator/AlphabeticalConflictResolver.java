package org.eclipse.incquery.examples.bpmn.ttc2013.simulator;

import org.eclipse.incquery.runtime.evm.api.ConflictResolver;

public class AlphabeticalConflictResolver implements ConflictResolver<AlphabeticalConflictSet> {

	@Override
	public AlphabeticalConflictSet createConflictSet() {
		return new AlphabeticalConflictSet(this);
	}


}
