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
import org.jnect.core.impl.SkeletonParser;

import microsoftkinectwrapper.KinectHandler;

public class ProxySkeletonConnectionProcessor extends ConnectionProcessor {

	private final Logger logger = Logger.getLogger(this.getClass().getName());

	private boolean run = false;

	private KinectHandler kinectHandlerProxy;

	@Override
	public void init(){
		super.init();
		this.kinectHandlerProxy = new KinectHandler();
		this.kinectHandlerProxy.setUpAndRun(); // Ignoring the return value
												// "Setup Done!"
	}

	@Override
	public void run() {
		logger.info("Starting skeleton tracking");

		this.run = true;
		while (this.run) {
			doRun();
		}
		
		logger.info("Shutting down.");
	}
	@Override
	public void stop() {
		logger.info("Shutdown requested.");
		this.run = false;
	}
	
	public void stopKinect(){
		String msg = this.kinectHandlerProxy.stop();
		
		logger.info(msg);
	}

	private void doRun() {
		String input = this.kinectHandlerProxy.getSkeleton(); // This seems to
																// be
																// non-blocking
		if (input != null) {
			// The parts are separated with a '*'.
			String[] inputParts = input.split("\\*");
			if (input.contains(SkeletonParser.SKELETON_KEYWORD)) { // Found
																	// skeleton
				for (int i = 0; i < inputParts.length; i++) {
					if (inputParts[i].contains(SkeletonParser.SKELETON_KEYWORD)) {
						this.connectionDataHandler.handleSkeletonInput(inputParts[i]);
						break; // TODO Do we want all skeleton frames collected
								// in 50ms or only one frame?
					}
				}
			} else { // Lost skeleton
				this.connectionDataHandler.handleSkeletonInput(inputParts[0]);
			}
		}

		// Sleep for 50ms - give Kinect some time to collect skeleton data
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
}
