package org.jnect.core;

/**
 * Callback listener for more efficient processing of Kinect data.
 * @author istvanrath
 *
 */
public interface IKinectUpdateListener {

	/**
	 * Called when the Kinect has received a frame and updated its EMF model.
	 */
	public void kinectReveivedFrame();
	
	/**
	 * Called when the Kinect has entirely changed its EMF model.
	 */
	public void kinectChangedModel();
	
}
