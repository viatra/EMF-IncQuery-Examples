package org.jnect.demo.incquery.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.views.YMCADemoView;

import bodymodel.ymca.a.AMatcher;
import bodymodel.ymca.c.CMatcher;
import bodymodel.ymca.i.IMatcher;
import bodymodel.ymca.m.MMatcher;
import bodymodel.ymca.q.QMatcher;
import bodymodel.ymca.y.YMatcher;

//import bodymodel.jump.JumpMatcher;

/**
 * Handler class for the Jnect/IncQuery awt.Robot demo.
 * @author istvanrath
 * 
 */
public class StartRobotDemoHandler extends AbstractHandler {

	class RobotMatcherHelper {

		IncQueryMatcher<? extends IPatternMatch> matcher;
		DeltaMonitor<? extends IPatternMatch> dm;
		/**
		 * Robot used to manipulate the primary screen.
		 */
		Robot robot; 
		
		
		public RobotMatcherHelper(IncQueryMatcher<? extends IPatternMatch> m) {
			matcher = m;
			dm = matcher.newDeltaMonitor(true);
			try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
			matcher.addCallbackAfterUpdates(new Runnable() {
				@Override
				public void run() {
					for (IPatternMatch pm : dm.matchFoundEvents) {
						// System.out.println("New match found:" + pm.toString());
						YMCADemoView.appendStringIncQuery(pm.patternName());
						for (Object _pe : pm.toArray()) {
							((PositionedElement) _pe).setColor_r(255);
						}
						robot.keyPress(KeyEvent.VK_RIGHT);
					}
					for (IPatternMatch pm : dm.matchLostEvents) {
						// System.out.println("Lost match found:" + pm.toString());
						for (Object _pe : pm.toArray()) {
							((PositionedElement) _pe).setColor_r(0);
						}
						robot.keyRelease(KeyEvent.VK_RIGHT);
					}
					dm.clear();
				}
			});
		}

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {

			try {
				Notifier km = KinectManager.INSTANCE.getSkeletonModel();

				new RobotMatcherHelper(YMatcher.factory().getMatcher(km));
				//new RobotMatcherHelper(MMatcher.factory().getMatcher(km));
				//new RobotMatcherHelper(CMatcher.factory().getMatcher(km));
				new RobotMatcherHelper(AMatcher.factory().getMatcher(km));
				//new RobotMatcherHelper(IMatcher.factory().getMatcher(km));
				//new RobotMatcherHelper(QMatcher.factory().getMatcher(km));
			} catch (IncQueryException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}

}
