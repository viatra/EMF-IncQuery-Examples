/*******************************************************************************
 * Copyright (c) 2012 jnect.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 *******************************************************************************/

package org.jnect.core;

import org.jnect.bodymodel.Body;
import org.jnect.core.impl.KinectManagerImpl;
import org.jnect.core.impl.demo.DemoKinectManagerImpl;

/**
 * Main interface for registering listeners and opening the connection to the kinect
 * 
 * @author Eugen Neufeld
 * 
 */
public interface KinectManager {

	/**
	 * Instance of this interface
	 */
	KinectManager INSTANCE = 
		KinectManagerImpl.getInstance();
		//DemoKinectManagerImpl.getInstance();
	/**
	 * starts the kinect connection
	 */
	void startKinect();

	/**
	 * stops the kinect connection
	 */
	void stopKinect();

	/**
	 * checks whether the kinect connection is running
	 * 
	 * @return true if kinect connection is running, false otherwise
	 */
	boolean isStarted();

	/**
	 * get skeleton model
	 * 
	 * @return {@link Body} - the skeleton model
	 */
	Body getSkeletonModel();
	
	/**
	 * Set the skeleton model.
	 * @param b
	 */
	void setSkeletonModel(Body b);

	/**
	 * starts the skeleton tracking
	 */
	void startSkeletonTracking();

	/**
	 * stops the skeleton tracking
	 */
	void stopSkeletonTracking();

	/**
	 * checks wheteher the skeleton tracking is running
	 * 
	 * @return true if skeleton tracking is running, false otherwise
	 */
	boolean isSkeletonTrackingStarted();

	/**
	 * adds a {@link SpeechListener}
	 * 
	 * @param listener - the {@link SpeechListener} to add
	 */
	void addSpeechListener(SpeechListener listener);

	/**
	 * removes a {@link SpeechListener}
	 * 
	 * @param listener - the {@link SpeechListener} to remove
	 */
	void removeSpeechListener(SpeechListener listener);

	/**
	 * starts the speech recognition
	 */
	void startSpeechRecognition();

	/**
	 * stops the speech recognition
	 */
	void stopSpeechRecognition();

	/**
	 * checks whether the speech recognition is running
	 * 
	 * @return true if speech recognition is running, false otherwise
	 */
	boolean isSpeechRecognitionStarted();
}
