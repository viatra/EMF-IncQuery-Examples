package org.jnect.demo.query.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;

import bodymodel.ymca.AMatcher;
import bodymodel.ymca.BEMatcher;
import bodymodel.ymca.BSMatcher;
import bodymodel.ymca.CMatcher;
import bodymodel.ymca.FEMatcher;
import bodymodel.ymca.FSMatcher;
import bodymodel.ymca.IMatcher;
import bodymodel.ymca.MMatcher;
import bodymodel.ymca.QMatcher;
import bodymodel.ymca.YMatcher;

/**
 * 
 * @author istvanrath
 * 
 */
public class StartEsperDemoHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {

			try {
				Notifier km = KinectManager.INSTANCE.getSkeletonModel();
				ViatraQueryEngine e = IncQueryEngine.on(km);
				// adapters for the YMCA demo
				new EsperAdapter(YMatcher.on(e));
				new EsperAdapter(MMatcher.on(e));
				new EsperAdapter(CMatcher.on(e));
				new EsperAdapter(AMatcher.on(e));
				new EsperAdapter(IMatcher.on(e));
				new EsperAdapter(QMatcher.on(e));
				
				// adapters for the powerpoint robot demo
				new EsperAdapter(FSMatcher.on(e));
				new EsperAdapter(FEMatcher.on(e));
				new EsperAdapter(BSMatcher.on(e));
				new EsperAdapter(BEMatcher.on(e));
				
				
			} catch (IncQueryException e) {
				e.printStackTrace();
			}
			// catch (PartInitException e) {
			// e.printStackTrace();
			// }
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}

}
