package org.jnect.demo.incquery.esper;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.jnect.demo.incquery.esper.events.PatternMatchEvent;
import org.jnect.demo.incquery.esper.events.PatternMatchEventType;

/**
 * Utility class to adapt IncQuery DeltaMonitor events to Esper events.
 * @author istvan rath
 *
 */
public class EsperAdapter {
    
    IncQueryMatcher<? extends IPatternMatch> matcher;
    DeltaMonitor<? extends IPatternMatch> dm;

    
    public EsperAdapter(IncQueryMatcher<? extends IPatternMatch> m) {

        matcher = m;
        dm = matcher.newDeltaMonitor(true);
        matcher.addCallbackAfterUpdates(new Runnable(){
           @Override
            public void run() {
                for (IPatternMatch pm : dm.matchFoundEvents) {
                   // System.out.println("New match found:" + pm.toString());
                   // v.appendString(pm.patternName());
                   // for (Object _pe: pm.toArray()) {
                   // 	((PositionedElement)_pe).setColor_r(255);
                   //}
                	EsperManager.getInstance().sendEvent(
                			new PatternMatchEvent(pm, pm.patternName(), PatternMatchEventType.NEW));
                }
                for (IPatternMatch pm : dm.matchLostEvents) {
                   // System.out.println("Lost match found:" + pm.toString());
                    // v.appendString(pm.patternName());
                    //for (Object _pe: pm.toArray()) {
                    //	((PositionedElement)_pe).setColor_r(0);
                    //}
                	EsperManager.getInstance().sendEvent(
                			new PatternMatchEvent(pm, pm.patternName(), PatternMatchEventType.LOST));
                }
                dm.clear();
            } 
        });
    }
    
    
}