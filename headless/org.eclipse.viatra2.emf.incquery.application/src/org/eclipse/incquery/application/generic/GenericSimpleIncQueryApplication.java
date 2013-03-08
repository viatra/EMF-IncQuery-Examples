/*******************************************************************************
 * Copyright (c) 2004-2011 Abel Hegedus and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Abel Hegedus - initial API and implementation
 *******************************************************************************/
package org.eclipse.incquery.application.generic;

import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.incquery.application.common.IncQueryHeadless;

/**
 * @author Abel Hegedus
 * 
 */
public class GenericSimpleIncQueryApplication implements IApplication {

	private static String modelParam = "-m";
	private static String patternParam = "-p";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	@Override
	public Object start(IApplicationContext context) throws Exception {

		Map<String, Object> arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");
		String model = null;
		String patternFQN = null;
		if (args == null || args.length == 0) {
			displayHelp();
			return IApplication.EXIT_OK;
		}
		int i = 0;
		while (i < args.length) {
			if (args[i].equals(modelParam)) {
				model = args[i + 1];
				i += 2;
				continue;
			}
			if (args[i].equals(patternParam)) {
				patternFQN = args[i + 1];
				i += 2;
				continue;
			} else {
				i++;
				continue;
			}
		}

		if (model == null) {
		  System.out.println("Model parameter not set");
			displayHelp();
			return IApplication.EXIT_OK;
		}
		if (patternFQN == null) {
		  System.out.println("PatternFQN parameter not set");
			displayHelp();
			return IApplication.EXIT_OK;
		}

		new IncQueryHeadless().executeGeneric(model, patternFQN);

		return IApplication.EXIT_OK;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	private void displayHelp() {
		System.out.println(
						"Usage:\n<call> -m <modelFilePAth> -p <patternFQN>\n  -m    :  Required, the model to match on.\n  -m    :  Required, the pattern to match");
	}
}
