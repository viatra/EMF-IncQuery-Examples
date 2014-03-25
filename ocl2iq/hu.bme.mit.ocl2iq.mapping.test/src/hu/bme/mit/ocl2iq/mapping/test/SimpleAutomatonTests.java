/*******************************************************************************
 * Copyright (c) 2004-2014 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package hu.bme.mit.ocl2iq.mapping.test;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ParserException;
import org.junit.Test;

import Automata.AutomataPackage;

/**
 * @author Bergmann Gabor
 *
 */
public class SimpleAutomatonTests extends AbstractTest {
	
	private static final AutomataPackage AUTOMATA = AutomataPackage.eINSTANCE;

	@Test
	public void translateTest001() throws ParserException {
		final String oclCode = "self.automaton <> sourceState.automaton";
		final EClass context = AUTOMATA.getTransition();
		testCode(oclCode, context);
	}
	
	@Test
	public void translateTest002() throws ParserException {
		final String oclCode = "" +
				"			  let a : Automaton = self.automaton in\r\n" + 
				"				a.transitions->select(t1|t1.sourceState=self)->\r\n" + 
				"					collect(t1| \r\n" + 
				"						a.transitions->select(t2|\r\n" + 
				"							t1<>t2 and t2.sourceState = self and t1.triggerSymbol = t2.triggerSymbol\r\n" + 
				"						)\r\n" + 
				"					)->asSet()\r\n" + 
				"";
		final EClass context = AUTOMATA.getState();
		testCode(oclCode, context);
	}
	
	@Test
	public void translateTest003() throws ParserException {
		final String oclCode = "" +
				"	let a : Automaton = self.automaton in \r\n" + 
				"		a.transitions->select(t1|t1.sourceState=self and \r\n" + 
				"			a.transitions->exists(t2| t1<>t2 and \r\n" + 
				"				t2.sourceState = self and t1.triggerSymbol = t2.triggerSymbol))";
		final EClass context = AUTOMATA.getState();
		testCode(oclCode, context);
	}

}
