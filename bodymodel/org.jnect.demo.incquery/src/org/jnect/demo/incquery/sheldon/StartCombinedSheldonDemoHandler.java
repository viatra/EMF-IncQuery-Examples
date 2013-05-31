package org.jnect.demo.incquery.sheldon;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.esper.EsperAdapter;
import org.jnect.demo.incquery.esper.EsperManager;

import bodymodel.ymca.SEMatcher;
import bodymodel.ymca.SMMatcher;
import bodymodel.ymca.SSMatcher;

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
				IncQueryEngine e = IncQueryEngine.on(km);
				// adapters for the sheldon
				new EsperAdapter(SEMatcher.on(e));
				new EsperAdapter(SMMatcher.on(e));
				new EsperAdapter(SSMatcher.on(e));
				
				
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
