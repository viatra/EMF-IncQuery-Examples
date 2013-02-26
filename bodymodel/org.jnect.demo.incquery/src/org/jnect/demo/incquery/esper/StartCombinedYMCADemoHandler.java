package org.jnect.demo.incquery.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;

import bodymodel.ymca.a.AMatcher;
import bodymodel.ymca.c.CMatcher;
import bodymodel.ymca.i.IMatcher;
import bodymodel.ymca.m.MMatcher;
import bodymodel.ymca.q.QMatcher;
import bodymodel.ymca.y.YMatcher;


/**
 * Handler class for the Jnect/IncQuery awt.Robot demo.
 * @author istvanrath
 * 
 */
public class StartCombinedYMCADemoHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			try {
				Notifier km = KinectManager.INSTANCE.getSkeletonModel();
				// adapters for the YMCA demo
				new EsperAdapter(YMatcher.factory().getMatcher(km));
				new EsperAdapter(MMatcher.factory().getMatcher(km));
				new EsperAdapter(CMatcher.factory().getMatcher(km));
				new EsperAdapter(AMatcher.factory().getMatcher(km));
				new EsperAdapter(IMatcher.factory().getMatcher(km));
				new EsperAdapter(QMatcher.factory().getMatcher(km));
			} catch (IncQueryException e) {
				e.printStackTrace();
			}
        	EsperManager.getInstance().registerYMCAListeners();
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}
	
}
