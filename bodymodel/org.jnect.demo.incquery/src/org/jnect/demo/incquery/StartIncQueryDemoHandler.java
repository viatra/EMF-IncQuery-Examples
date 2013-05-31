package org.jnect.demo.incquery;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.incquery.databinding.runtime.api.IncQueryHeadlessRealm;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;

import bodymodel.RightHandAboveHeadMatch;
import bodymodel.RightHandAboveHeadMatcher;
//import bodymodel.jump.JumpMatcher;

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
			    IncQueryEngine e = IncQueryEngine.on(KinectManager.INSTANCE.getSkeletonModel());
				RightHandAboveHeadMatcher matcher = RightHandAboveHeadMatcher.on(e);
				/*
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
				*/
				if (Realm.getDefault()==null) {
				    // make sure we work well in a headless / non-UI thread environment
				    IncQueryHeadlessRealm realm = new IncQueryHeadlessRealm();
				}
				IObservableSet os = IncQueryObservables.observeMatchesAsSet(matcher);
				os.addSetChangeListener(new ISetChangeListener() {
                    
                    @Override
                    public void handleSetChange(SetChangeEvent event) {
                        for (Object _o : event.diff.getAdditions()) {
                            RightHandAboveHeadMatch m = (RightHandAboveHeadMatch) _o;
                            System.out.println("New match found:" + m.toString());
                            // colorize head and right hand
                            m.getH().setColor_r(255);
                            m.getRH().setColor_r(255);
                        }
                        for (Object _o : event.diff.getRemovals()) {
                            RightHandAboveHeadMatch m = (RightHandAboveHeadMatch) _o;
                            System.out.println("Lost match found:" + m.toString());
                            // decolorize
                            m.getH().setColor_r(0);
                            m.getRH().setColor_r(0);
                        }
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
