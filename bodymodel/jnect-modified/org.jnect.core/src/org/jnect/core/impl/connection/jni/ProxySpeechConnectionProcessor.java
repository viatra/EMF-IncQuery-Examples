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

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnect.core.impl.ConnectionProcessor;
import org.jnect.core.impl.connection.socket.KinectProtocolConstants;

import microsoftkinectwrapper.SpeechRecognition;

public class ProxySpeechConnectionProcessor extends ConnectionProcessor {
	
	private final Logger logger = Logger.getLogger(this.getClass().getName());
	
	private boolean run = false;

	private SpeechRecognition kinectSpeechRecognitionProxy;
	
	@Override
	public void init(){
		super.init();
		this.kinectSpeechRecognitionProxy = new SpeechRecognition();
	}
	
	@Override
	public void run() {
		logger.info("Starting speech recognition");
		this.run = true;
		while (this.run) {
			String input = this.kinectSpeechRecognitionProxy.getSpeech(); // This seems to be non-blocking
			if (input != null) {
				// The parts are separated with a '*'.
				String[] inputParts = input.split("\\*");
				for (int i = 0; i < inputParts.length; i++) {
					// TODO The recognized words are prefixed with some constant that needs to be stripped off. This has to be changed in the C/C#-Code.
					String word = inputParts[i].substring(KinectProtocolConstants.SPEECH.length());
					this.connectionDataHandler.handleSpeechInput(word);
				}
			}
			
			// Sleep for 50ms - Give Kinect some time to recognize words
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
			}
		}

		this.stopSpeechRecognition();
		logger.info("Shutting down.");
	}
	@Override
	public void stop() {
		logger.info("Shutdown requested.");
		this.run = false;
	}
	
	public void initSpeechRecognition(String[] keywords) {
		this.kinectSpeechRecognitionProxy.setup(keywords);
	}
	
	private void startSpeechRecognition() {
		this.kinectSpeechRecognitionProxy.startRecog();
	}
	
	private void stopSpeechRecognition() {
		this.kinectSpeechRecognitionProxy.stop();
	}
}
