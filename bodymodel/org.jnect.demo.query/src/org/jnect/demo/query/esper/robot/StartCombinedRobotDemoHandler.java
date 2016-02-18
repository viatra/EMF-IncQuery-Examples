package org.jnect.demo.query.esper.robot;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;
import org.jnect.demo.query.esper.EsperAdapter;
import org.jnect.demo.query.esper.EsperManager;

import bodymodel.ymca.BEMatcher;
import bodymodel.ymca.BSMatcher;
import bodymodel.ymca.FEMatcher;
import bodymodel.ymca.FSMatcher;

//import bodymodel.jump.JumpMatcher;

/**
 * Handler class for the Jnect/IncQuery awt.Robot demo.
 * @author istvanrath
 * 
 */
public class StartCombinedRobotDemoHandler extends AbstractHandler {

	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			
			try {
				Notifier km = KinectManager.INSTANCE.getSkeletonModel();
				ViatraQueryEngine e = IncQueryEngine.on(km);
				// adapters for the powerpoint robot demo
				new EsperAdapter(FSMatcher.on(e));
				new EsperAdapter(FEMatcher.on(e));
				new EsperAdapter(BSMatcher.on(e));
				new EsperAdapter(BEMatcher.on(e));
				
				
			} catch (IncQueryException e) {
				e.printStackTrace();
			}
			
        	EsperManager.getInstance().registerRobotListeners();
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}


}
