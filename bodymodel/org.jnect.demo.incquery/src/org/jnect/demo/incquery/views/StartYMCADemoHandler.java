package org.jnect.demo.incquery.views;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.core.KinectManager;

import bodymodel.ymca.a.AMatcher;
import bodymodel.ymca.be.BEMatcher;
import bodymodel.ymca.bs.BSMatcher;
import bodymodel.ymca.c.CMatcher;
import bodymodel.ymca.fe.FEMatcher;
import bodymodel.ymca.fs.FSMatcher;
import bodymodel.ymca.i.IMatcher;
import bodymodel.ymca.m.MMatcher;
import bodymodel.ymca.q.QMatcher;
import bodymodel.ymca.se.SEMatcher;
import bodymodel.ymca.sm.SMMatcher;
import bodymodel.ymca.y.YMatcher;

//import bodymodel.jump.JumpMatcher;

/**
 * 
 * @author istvanrath
 * 
 */
public class StartYMCADemoHandler extends AbstractHandler {

	class IncQueryMatcherHelper {

		IncQueryMatcher<? extends IPatternMatch> matcher;
		DeltaMonitor<? extends IPatternMatch> dm;

		public IncQueryMatcherHelper(IncQueryMatcher<? extends IPatternMatch> m) {
			matcher = m;
			dm = matcher.newDeltaMonitor(true);
			matcher.addCallbackAfterUpdates(new Runnable() {
				@Override
				public void run() {
					for (IPatternMatch pm : dm.matchFoundEvents) {
						// System.out.println("New match found:" + pm.toString());
						YMCADemoView.appendStringIncQuery(pm.patternName()+";");
						for (Object _pe : pm.toArray()) {
							((PositionedElement) _pe).setColor_r(255);
						}
					}
					for (IPatternMatch pm : dm.matchLostEvents) {
						// System.out.println("Lost match found:" + pm.toString());
						for (Object _pe : pm.toArray()) {
							((PositionedElement) _pe).setColor_r(0);
						}
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

				// ymca demo
				new IncQueryMatcherHelper(YMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(MMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(CMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(AMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(IMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(QMatcher.factory().getMatcher(km));
				// robot demo
				new IncQueryMatcherHelper(FSMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(FEMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(BSMatcher.factory().getMatcher(km));
				new IncQueryMatcherHelper(BEMatcher.factory().getMatcher(km));
				// sheldon demo
				new IncQueryMatcherHelper(SEMatcher.factory().getMatcher(km));
                new IncQueryMatcherHelper(SMMatcher.factory().getMatcher(km));
                new IncQueryMatcherHelper(SEMatcher.factory().getMatcher(km));
                
				
				
			} catch (IncQueryException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}

}
