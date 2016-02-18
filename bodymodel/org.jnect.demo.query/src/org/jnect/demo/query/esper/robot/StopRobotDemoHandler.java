package org.jnect.demo.query.esper.robot;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.jnect.core.KinectManager;
import org.jnect.demo.query.esper.EsperManager;

//import bodymodel.jump.JumpMatcher;

/**
 * Handler class for the Jnect/IncQuery awt.Robot demo.
 * @author istvanrath
 * 
 */
public class StopRobotDemoHandler extends AbstractHandler {

	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			EsperManager.getInstance().unregisterRobotListeners();	                   
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}


}
