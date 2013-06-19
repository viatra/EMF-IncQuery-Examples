package org.eclipse.incquery.examples.bpmn.ttc2013.simulator;

import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.ConflictResolver;
import org.eclipse.incquery.runtime.evm.api.ConflictSet;
import org.eclipse.swt.widgets.Display;

public class InteractiveConflictSet extends BasicConflictSet {

	@Override
	public ConflictResolver<? extends ConflictSet> getConflictResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activation<?> getNextActivation() {
		if (activations.isEmpty()) return null;
		if (activations.size() == 1) return activations.iterator().next();
		
		final List<Activation<?>> options = new ArrayList<Activation<?>>(activations);
		for (int i = 0; i < activations.size(); ++i)
			System.out.println("[" + i + "] " + options.get(i).getAtom());
		System.out.println("Choose!");
		int choice = new Scanner(System.in).nextInt();
		return options.get(choice);	
//		Display.getCurrent().asyncExec(new Runnable() {
//			
//			@Override
//			public void run() {
//				Dialog.
//			}
//		});
	}

	@Override
	public Set<Activation<?>> getNextActivations() {
		return activations;
	}

}
