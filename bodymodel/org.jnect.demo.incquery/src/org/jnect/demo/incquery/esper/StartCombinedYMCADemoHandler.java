package org.jnect.demo.incquery.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;

import bodymodel.ymca.AMatcher;
import bodymodel.ymca.CMatcher;
import bodymodel.ymca.IMatcher;
import bodymodel.ymca.MMatcher;
import bodymodel.ymca.QMatcher;
import bodymodel.ymca.YMatcher;


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
				IncQueryEngine e = IncQueryEngine.on(km);
				new EsperAdapter(YMatcher.on(e));
				new EsperAdapter(MMatcher.on(e));
				new EsperAdapter(CMatcher.on(e));
				new EsperAdapter(AMatcher.on(e));
				new EsperAdapter(IMatcher.on(e));
				new EsperAdapter(QMatcher.on(e));
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
