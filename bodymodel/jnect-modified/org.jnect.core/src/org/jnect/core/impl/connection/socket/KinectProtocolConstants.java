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
package org.jnect.core.impl.connection.socket;

public class KinectProtocolConstants {

	public static final String DEFAULT_HOST = "127.0.0.1";
	public static final int DEFAULT_PORT = 12345;
	
	public static final String SPEECH = "RECOGNIZED: ";
	public static final String SKELETON = "SKELETON: ";
	
	private KinectProtocolConstants() {
		// Should not be instantiated
	}
}
