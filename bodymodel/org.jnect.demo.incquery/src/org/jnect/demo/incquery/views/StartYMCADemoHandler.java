package org.jnect.demo.incquery.views;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.databinding.runtime.api.IncQueryHeadlessRealm;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.jnect.bodymodel.PositionedElement;
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
import bodymodel.ymca.SEMatcher;
import bodymodel.ymca.SMMatcher;
import bodymodel.ymca.YMatcher;

//import bodymodel.jump.JumpMatcher;

/**
 * 
 * @author istvanrath
 * 
 */
public class StartYMCADemoHandler extends AbstractHandler {

	class IncQueryMatcherHelper {

		IncQueryMatcher<? extends IPatternMatch> matcher;

		public IncQueryMatcherHelper(IncQueryMatcher<? extends IPatternMatch> m) {
			matcher = m;
			if (Realm.getDefault()==null) {
	            // make sure we work well in a headless / non-UI thread environment
	            IncQueryHeadlessRealm realm = new IncQueryHeadlessRealm();
	        }
	        IObservableSet os = IncQueryObservables.observeMatchesAsSet(matcher);
	        os.addSetChangeListener(new ISetChangeListener() {

	            @Override
	            public void handleSetChange(SetChangeEvent event) {
	                for (Object _o : event.diff.getAdditions()) {
	                    IPatternMatch pm = (IPatternMatch) _o;
	                    // System.out.println("New match found:" + pm.toString());
                        YMCADemoView.appendStringIncQuery(pm.patternName()+";");
                        for (Object _pe : pm.toArray()) {
                            ((PositionedElement) _pe).setColor_r(255);
                        }
                
	                }
	                for (Object _o : event.diff.getRemovals()) {
	                    IPatternMatch pm = (IPatternMatch) _o;
	                    // System.out.println("Lost match found:" + pm.toString());
                        for (Object _pe : pm.toArray()) {
                            ((PositionedElement) _pe).setColor_r(0);
                        }
                
	                }
	                
	            }
	            
	        });
		}

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {

			try {
				Notifier km = KinectManager.INSTANCE.getSkeletonModel();
				IncQueryEngine e = IncQueryEngine.on(km);
				// ymca demo
				new IncQueryMatcherHelper(YMatcher.on(e));
				new IncQueryMatcherHelper(MMatcher.on(e));
				new IncQueryMatcherHelper(CMatcher.on(e));
				new IncQueryMatcherHelper(AMatcher.on(e));
				new IncQueryMatcherHelper(IMatcher.on(e));
				new IncQueryMatcherHelper(QMatcher.on(e));
				// robot demo
				new IncQueryMatcherHelper(FSMatcher.on(e));
				new IncQueryMatcherHelper(FEMatcher.on(e));
				new IncQueryMatcherHelper(BSMatcher.on(e));
				new IncQueryMatcherHelper(BEMatcher.on(e));
				// sheldon demo
				new IncQueryMatcherHelper(SEMatcher.on(e));
                new IncQueryMatcherHelper(SMMatcher.on(e));
                new IncQueryMatcherHelper(SEMatcher.on(e));
                
				
				
			} catch (IncQueryException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}

}
