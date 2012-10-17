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
package org.jnect.core.impl.demo;

import org.jnect.bodymodel.Body;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.core.IBodyProvider;
import org.jnect.core.IKinectUpdateListener;
import org.jnect.core.KinectManager;
import org.jnect.core.SpeechListener;

public class DemoKinectManagerImpl implements KinectManager {

//	private final Logger logger = Logger.getLogger(this.getClass().getName());

	private static final KinectManager INSTANCE = new DemoKinectManagerImpl();

	public static KinectManager getInstance() {
		return INSTANCE;
	}


	private Body body;

	private IBodyProvider bodyProvider;

	public DemoKinectManagerImpl() {
		bodyProvider = new BodyProviderDemoImpl();
		body = bodyProvider.getBody();
	}	
	
	@Override
	public void startKinect() { }

	@Override
	public void stopKinect() { }
		

	@Override
	public Body getSkeletonModel() {
		return body;
	}

	boolean runSimulator = true;

	private Thread simulationThread;
	
	@Override
	public void startSkeletonTracking() {
		// reinitialize body
		body = bodyProvider.getBody();
		// (re)start simulation thread
		runSimulator = true;
		Runnable simulator = new Runnable() {

			@Override
			public void run() {
				while (runSimulator) {
					try {
						Thread.sleep(1000l);
						manipulateModel();
					} catch (InterruptedException e) {
						System.out.println("Kinect simulator interrupted.");
					}
				}
			}
			
		};
		
		simulationThread = new Thread(simulator);
		simulationThread.start();
		
	}

	static float step = (float) 0.1;
	
	static int counter = 0;
	
	static void manipulateModel() {
		/*
		// select a random body part and move it randomly
		for (HumanLink hl : KinectManager.INSTANCE.getSkeletonModel().getLinks())
		{
			PositionedElement pe = hl.getTarget();
			double r = Math.random();
			if (r < 0.25) {
				pe.setX((float) (pe.getX()+step));
			} else if (r < 0.5) {
				pe.setY((float) (pe.getY()-step));
			}else if (r < 0.75) {
				pe.setY((float) (pe.getX()-step));
			}else {
				pe.setY((float) (pe.getY()+step));
			}
		}
		*/
		// do a random motion with the right hand
		/*double r = Math.random();
		PositionedElement pe = KinectManager.INSTANCE.getSkeletonModel().getRightHand();
		if (r < 0.25) {
		//	pe.setX((float) (pe.getX()-step));
		} else if (r < 0.5) {
			pe.setY((float) (pe.getY()-step));
		} else if (r < 0.75) {
		//	pe.setX((float) (pe.getX()-step));
		} else {
			pe.setY((float) (pe.getY()+step));
		}*/
		// do a circling motion with the right hand
		PositionedElement rightHand = KinectManager.INSTANCE.getSkeletonModel().getRightHand();
		PositionedElement rightWrist = KinectManager.INSTANCE.getSkeletonModel().getRightWrist();
		// starting position for right hand:
		//  handRight.setX(1.1f);
		//  handRight.setY(-0.5f);
		//  wristRight.setX(0.8f);
		//  wristRight.setY(-0.5f);
		// center of motion is right elbow: 
		//  elbowRight.setX(0.5f);
		//  elbowRight.setY(-0.5f);
		double angle = (double)Math.PI*2/12 * (double)(counter%12);
		//System.out.println(angle);
		rightHand.setX( 0.5f + (float)Math.cos(angle)*0.6f );
		rightHand.setY( -0.5f - (float)Math.sin(angle)*0.6f );
		rightWrist.setX( 0.5f + (float)Math.cos(angle)*0.3f );
		rightWrist.setY( -0.5f - (float)Math.sin(angle)*0.3f );
		
		counter++;
		
	}
	
	@Override
	public void stopSkeletonTracking() {
		// stop simulation thread
		if (isSkeletonTrackingStarted()) {
			simulationThread.interrupt();
			runSimulator = false;
			// also reset body model for demo purposes
			// todo: how?
		}
	}
	
	@Override
	public void addSpeechListener(SpeechListener listener) { }

	@Override
	public void removeSpeechListener(SpeechListener listener) { }

	@Override
	public void startSpeechRecognition() { }

	@Override
	public void stopSpeechRecognition() { }


	@Override
	public boolean isStarted() {
		return true;
	}

	@Override
	public boolean isSkeletonTrackingStarted() {
		return (simulationThread!=null && simulationThread.isAlive()); 
		// only when simulation thread is running
	}

	@Override
	public boolean isSpeechRecognitionStarted() {
		return false; // we do not need speech recognition for the demo
	}

	@Override
	public void setSkeletonModel(Body b) {
		this.body = b;
	}

	@Override
	public void addKinectUpdateListener(IKinectUpdateListener l) {
		// TODO Auto-generated method stub
		
	}

}
