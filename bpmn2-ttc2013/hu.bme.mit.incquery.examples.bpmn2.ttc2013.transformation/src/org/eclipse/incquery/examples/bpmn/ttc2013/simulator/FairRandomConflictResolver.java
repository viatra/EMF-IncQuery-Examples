package org.eclipse.incquery.examples.bpmn.ttc2013.simulator;


import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.ConflictResolver;
import org.eclipse.incquery.runtime.evm.api.ConflictSet;

public class FairRandomConflictResolver implements ConflictResolver<FairRandomConflictSet> {
	
	@Override
	public FairRandomConflictSet createConflictSet() {
		return new FairRandomConflictSet(this);
	}

}
