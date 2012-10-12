package org.jnect.demo.incquery.esper.robot;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.esper.EsperAdapter;
import org.jnect.demo.incquery.esper.EsperManager;

import bodymodel.ymca.be.BEMatcher;
import bodymodel.ymca.bs.BSMatcher;
import bodymodel.ymca.fe.FEMatcher;
import bodymodel.ymca.fs.FSMatcher;

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
				
				// adapters for the powerpoint robot demo
				new EsperAdapter(FSMatcher.factory().getMatcher(km));
				new EsperAdapter(FEMatcher.factory().getMatcher(km));
				new EsperAdapter(BSMatcher.factory().getMatcher(km));
				new EsperAdapter(BEMatcher.factory().getMatcher(km));
				
				
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
