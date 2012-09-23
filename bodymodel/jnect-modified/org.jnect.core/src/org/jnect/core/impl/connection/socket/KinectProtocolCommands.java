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

public enum KinectProtocolCommands {

	SWIPELEFT("SWIPELEFT"),
	SWIPERIGHT("SWIPERIGHT"),
	SWIPEUP("SWIPEUP"),
	SWIPEDOWN("SWIPEDOWN"),
	CLICK("CLICK"),
	ONCIRCLE("ONCIRCLE"),
	OFFCIRCLE("OFFCIRCLE"),
	SESSIONSTART("SESSIONSTART"), 
	SESSIONEND("SESSIONEND"),
	INITSPEECH("INIT SPEECH RECOGNITION: "), // Followed by a list of keywords
	RESUMESPEECH("RESUME SPEECH RECOGNITION"),
	STOPSPEECH("STOP SPEECH RECOGNITION");
	
	
	private final String command;
	
	private KinectProtocolCommands(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
}
