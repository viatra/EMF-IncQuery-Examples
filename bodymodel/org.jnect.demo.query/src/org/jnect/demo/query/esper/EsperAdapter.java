package org.jnect.demo.query.esper;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.viatra.addon.databinding.runtime.api.IncQueryHeadlessRealm;
import org.eclipse.viatra.addon.databinding.runtime.api.IncQueryObservables;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.jnect.demo.query.esper.events.PatternMatchEvent;
import org.jnect.demo.query.esper.events.PatternMatchEventType;

/**
 * Utility class to adapt IncQuery DeltaMonitor events to Esper events.
 * @author istvan rath
 *
 */
public class EsperAdapter {
    
    ViatraQueryMatcher<? extends IPatternMatch> matcher;

    
    public EsperAdapter(ViatraQueryMatcher<? extends IPatternMatch> m) {
        matcher = m;
 //       if (Realm.getDefault()==null) {
            // make sure we work well in a headless / non-UI thread environment
            IncQueryHeadlessRealm realm = new IncQueryHeadlessRealm();
 //       }
        IObservableSet os = IncQueryObservables.observeMatchesAsSet(matcher);
        os.addSetChangeListener(new ISetChangeListener() {

            @Override
            public void handleSetChange(SetChangeEvent event) {
                for (Object _o : event.diff.getAdditions()) {
                    IPatternMatch pm = (IPatternMatch) _o;
                 // System.out.println("New match found:" + pm.toString());
                    // v.appendString(pm.patternName());
                    // for (Object _pe: pm.toArray()) {
                    //   ((PositionedElement)_pe).setColor_r(255);
                    //}
                     EsperManager.getInstance().sendEvent(
                             new PatternMatchEvent(pm, pm.patternName(), PatternMatchEventType.NEW));
                }
                for (Object _o : event.diff.getRemovals()) {
                    IPatternMatch pm = (IPatternMatch) _o;
                 // System.out.println("Lost match found:" + pm.toString());
                    // v.appendString(pm.patternName());
                    //for (Object _pe: pm.toArray()) {
                    //  ((PositionedElement)_pe).setColor_r(0);
                    //}
                    EsperManager.getInstance().sendEvent(
                            new PatternMatchEvent(pm, pm.patternName(), PatternMatchEventType.LOST));
                }
                
            }
            
        });
    }
    
    
}