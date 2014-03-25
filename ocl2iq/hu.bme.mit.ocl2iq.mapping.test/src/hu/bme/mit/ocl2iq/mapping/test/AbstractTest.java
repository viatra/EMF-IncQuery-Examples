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

import hu.bme.mit.ocl2iq.mapping.api.OCL2IQ;
import hu.bme.mit.ocl2iq.mapping.api.OCLParseControl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCLExpression;

/**
 * @author Bergmann Gabor
 *
 */
public class AbstractTest {

	/**
	 * 
	 */
	public AbstractTest() {
		super();
	}

	protected void testCode(final String oclCode, final EClass context) throws ParserException {
		System.out.println("\n// *** generating output for context " + context.getName() + ": ");
		System.out.println("// "+ oclCode);
		final OCLExpression exp = new OCLParseControl().parse(context, oclCode);
		final String patternCode = new OCL2IQ(context, exp, "translated").gen().toString(); 
		System.out.println(patternCode);
	}

}