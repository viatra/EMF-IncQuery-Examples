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
package org.jnect.core.impl.connection.jni;

import java.io.IOException;
import java.util.logging.Logger;

import org.jnect.core.impl.ConnectionDataHandler;
import org.jnect.core.impl.ConnectionManager;
import org.jnect.core.impl.KinectDataHandler;


public class ProxyConnectionManager extends ConnectionDataHandler implements ConnectionManager {

	private final Logger logger = Logger.getLogger(this.getClass().getName());
	
	private ProxySkeletonConnectionProcessor skeletonProcessor;
	private ProxySpeechConnectionProcessor speechProcessor;
	
	private Thread skeletonProcessorThread;
	private Thread speechProcessorThread;
	
	@Override
	public void openConnection() throws IOException {
		logger.info("Opening connection to Kinect");
		
		this.skeletonProcessor = new ProxySkeletonConnectionProcessor();
		this.skeletonProcessor.setConnectionDataHandler(this);
		this.skeletonProcessor.init();
		
		this.speechProcessor = new ProxySpeechConnectionProcessor();
		this.speechProcessor.setConnectionDataHandler(this);
		this.speechProcessor.init();
	}
	
	@Override
	public void closeConnection() throws IOException {
		logger.info("Closing connection to Kinect");
		
		this.stopKinect();
		
		// Shutdown threads
		stopSkeletonTracking();
		stopSpeechRecognition();
		
		logger.info("Connection to Kinect closed");
	}
	
	@Override
	public void startSkeletonTracking() {
		if (this.skeletonProcessorThread == null || !this.skeletonProcessorThread.isAlive()) {
			this.skeletonProcessorThread = new Thread(this.skeletonProcessor, this.skeletonProcessor.getClass().getSimpleName());
			this.skeletonProcessorThread.start();
		} else {
			logger.info("Skeleton tracking already running.");
		}
	}
	
	@Override
	public void stopSkeletonTracking() {
		if (this.skeletonProcessorThread != null && this.skeletonProcessorThread.isAlive()) {
			this.skeletonProcessor.stop();
		}
	}

	@Override
	public void startSpeechRecognition(String[] keywords) {
		if (this.speechProcessorThread == null || !this.speechProcessorThread.isAlive()) {
			this.speechProcessor.initSpeechRecognition(keywords);
			this.speechProcessorThread = new Thread(this.speechProcessor, this.speechProcessor.getClass().getSimpleName());
			this.speechProcessorThread.start();
			
		} else {
			logger.info("Speech recognition already running.");
		}
	}

	@Override
	public void stopSpeechRecognition() {
		if (this.speechProcessorThread != null && this.speechProcessorThread.isAlive()) {
			this.speechProcessor.stop();
		}
	}

	@Override
	public void setDataHandler(KinectDataHandler dataHandler) {
		this.dataHandler = dataHandler;
	}

	@Override
	public boolean isConnected() {
		return this.skeletonProcessor != null && this.speechProcessor != null;
	}

	@Override
	public boolean isSkeletonTrackingStarted() {
		return this.skeletonProcessorThread != null && this.skeletonProcessorThread.isAlive();
	}

	@Override
	public boolean isSpeechRecognitionStarted() {
		return this.speechProcessorThread != null && this.speechProcessorThread.isAlive();
	}

	@Override
	public void stopKinect() {
		if(this.skeletonProcessor != null)
			this.skeletonProcessor.stopKinect();		
	}
}
