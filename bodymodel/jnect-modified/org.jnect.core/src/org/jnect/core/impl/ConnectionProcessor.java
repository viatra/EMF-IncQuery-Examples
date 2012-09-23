/*******************************************************************************
 * Copyright (c) 2012 jnect.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eugen Neufeld - initial API and implementation
 *******************************************************************************/
package org.jnect.core.impl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jni4net.Bridge;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;


public abstract class ConnectionProcessor implements Runnable {

	private final Logger logger = Logger.getLogger(this.getClass().getName());
	protected ConnectionDataHandler connectionDataHandler;
	
	public void setConnectionDataHandler(ConnectionDataHandler dataHandler) {
		this.connectionDataHandler = dataHandler;
	}
	public void init() {
		try {
			Bundle bundle = Platform.getBundle("org.jnect.core");
			URL locationUrl = FileLocator.find(bundle, new Path("/"), null);
			URL fileUrl = FileLocator.toFileURL(locationUrl);
			String parentPath = fileUrl.getFile();

			Bridge.init(new File(parentPath, "lib"));
			File path = new File(parentPath, "lib/MicrosoftKinectWrapper.j4n.dll").getCanonicalFile();
			Bridge.LoadAndRegisterAssemblyFrom(path);

		} catch (IOException ioe) {
			logger.log(Level.SEVERE, ioe.getLocalizedMessage(), ioe);
		}

		
	}
	public abstract void stop();
}
