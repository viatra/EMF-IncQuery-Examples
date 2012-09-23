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

import java.io.IOException;

public interface ConnectionManager {

	void openConnection() throws IOException;
	void closeConnection() throws IOException;
	boolean isConnected();

	void startSkeletonTracking();
	void stopSkeletonTracking();
	boolean isSkeletonTrackingStarted();
	
	void startSpeechRecognition(String[] keywords);
	void stopSpeechRecognition();
	boolean isSpeechRecognitionStarted();
	
	void stopKinect();
	
	void setDataHandler(KinectDataHandler dataHandler);
}
