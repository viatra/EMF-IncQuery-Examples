package org.jnect.demo.incquery.sheldon;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.esper.EsperAdapter;
import org.jnect.demo.incquery.esper.EsperManager;

import bodymodel.ymca.se.SEMatcher;
import bodymodel.ymca.sm.SMMatcher;
import bodymodel.ymca.ss.SSMatcher;

//import bodymodel.jump.JumpMatcher;

/**
 * Handler class for the Sheldon Control demo.
 * @author istvanrath
 * 
 */
public class StartCombinedSheldonDemoHandler extends AbstractHandler {

	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			
			try {
				Notifier km = KinectManager.INSTANCE.getSkeletonModel();
				
				// adapters for the sheldon
				new EsperAdapter(SEMatcher.factory().getMatcher(km));
				new EsperAdapter(SMMatcher.factory().getMatcher(km));
				new EsperAdapter(SSMatcher.factory().getMatcher(km));
				
				
			} catch (IncQueryException e) {
				e.printStackTrace();
			}
			
        	EsperManager.getInstance().registerSheldonListeners();
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}


}
