package org.eclipse.incquery.examples.bpmn.ttc2013.simulator

import org.eclipse.incquery.runtime.evm.api.ConflictResolver

class AlphabeticalConflictResolver implements ConflictResolver<AlphabeticalConflictSet> {
	override AlphabeticalConflictSet createConflictSet() {
		return new AlphabeticalConflictSet(this);
	}
}