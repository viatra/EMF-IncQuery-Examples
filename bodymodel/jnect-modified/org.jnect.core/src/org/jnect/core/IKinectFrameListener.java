package org.jnect.core;

/**
 * Callback listener for more efficient processing of Kinect data.
 * @author istvanrath
 *
 */
public interface IKinectFrameListener {

	/**
	 * Called when the Kinect has received a frame and updated its EMF model.
	 */
	public void kinectReveivedFrame();
	
	
}
