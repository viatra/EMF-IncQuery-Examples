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

import java.io.IOException;

import org.jnect.core.impl.ConnectionDataHandler;
import org.jnect.core.impl.ConnectionManager;
import org.jnect.core.impl.KinectDataHandler;


public class SocketConnectionManager extends ConnectionDataHandler implements ConnectionManager {

	// The socket connection is not yet fully implemented!
	
	
	private SocketConnectionProcessor socketProcessor;
	private Thread socketProcessorThread;
	
	private String host;
	private int port;
	
	public SocketConnectionManager() {
		this.host = KinectProtocolConstants.DEFAULT_HOST;
		this.port = KinectProtocolConstants.DEFAULT_PORT;
	}
	
	public SocketConnectionManager(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	@Override
	public void openConnection() throws IOException {
		this.socketProcessor = new SocketConnectionProcessor(this.host, this.port);
		this.socketProcessor.setConnectionDataHandler(this);
		
		this.socketProcessorThread = new Thread(this.socketProcessor, this.socketProcessor.getClass().getSimpleName());
		this.socketProcessorThread.start();
	}

	@Override
	public void closeConnection() throws IOException {
		this.socketProcessor.stop();
	}

	@Override
	public void startSkeletonTracking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSkeletonTracking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startSpeechRecognition(String[] keywords) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSpeechRecognition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDataHandler(KinectDataHandler dataHandler) {
		// TODO Auto-generated method stub
		this.dataHandler = dataHandler;
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSkeletonTrackingStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSpeechRecognitionStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stopKinect() {
		// TODO Auto-generated method stub
		
	}

}
