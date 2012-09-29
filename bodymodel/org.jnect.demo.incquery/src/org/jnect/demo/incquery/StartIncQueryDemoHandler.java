package org.jnect.demo.incquery;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.jnect.core.KinectManager;

//import bodymodel.jump.JumpMatcher;
import bodymodel.righthandabovehead.RightHandAboveHeadMatch;
import bodymodel.righthandabovehead.RightHandAboveHeadMatcher;

/**
 * 
 * @author istvanrath
 *
 */
public class StartIncQueryDemoHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			// move head to 0,0
			// KinectManager.INSTANCE.getSkeletonModel().getHead().setX(0);
			// KinectManager.INSTANCE.getSkeletonModel().getHead().setY(0);
			
			try {
				RightHandAboveHeadMatcher matcher = RightHandAboveHeadMatcher.factory()
						.getMatcher(KinectManager.INSTANCE.getSkeletonModel());
				final DeltaMonitor<RightHandAboveHeadMatch> dm = matcher.newDeltaMonitor(true);
				
				matcher.addCallbackAfterUpdates(new Runnable() {

					@Override
					public void run() {
						for (RightHandAboveHeadMatch m : dm.matchFoundEvents) {
							System.out.println("New match found:" + m.toString());
							// colorize head and right hand
							m.getH().setColor_r(255);
							m.getRH().setColor_r(255);
						}
						for (RightHandAboveHeadMatch m : dm.matchLostEvents) {
							System.out.println("Lost match found:" + m.toString());
							// decolorize
							m.getH().setColor_r(0);
							m.getRH().setColor_r(0);
						}
						dm.clear();
					}
					
				});
				
			} catch (IncQueryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}

	
}
