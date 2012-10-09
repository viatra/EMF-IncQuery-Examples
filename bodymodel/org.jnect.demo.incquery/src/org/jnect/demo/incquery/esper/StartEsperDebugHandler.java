package org.jnect.demo.incquery.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.esper.events.PatternMatchEvent;
import org.jnect.demo.incquery.esper.events.PatternMatchEvent.EventType;

import bodymodel.ymca.a.AMatcher;
import bodymodel.ymca.c.CMatcher;
import bodymodel.ymca.i.IMatcher;
import bodymodel.ymca.m.MMatcher;
import bodymodel.ymca.q.QMatcher;
import bodymodel.ymca.y.YMatcher;


/**
 * Esper debugging handler to aid Esper debugging without IncQuery.
 * @author istvanrath
 *
 */
public class StartEsperDebugHandler extends AbstractHandler {

    @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
    	try {
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "Y", EventType.NEW));
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "Y", EventType.LOST));
    	
    	
			Thread.sleep(1000l);
		
    	
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "M", EventType.NEW));
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "M", EventType.LOST));
    	
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "C", EventType.NEW));
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "C", EventType.LOST));
    	
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "A", EventType.NEW));
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "A", EventType.LOST));
    	
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "I", EventType.NEW));
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "I", EventType.LOST));
    	
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "Q", EventType.NEW));
    	EsperManager.getInstance().sendEvent(
    			new PatternMatchEvent(null, "Q", EventType.LOST));
    	
    	} catch (InterruptedException e) {
			throw new ExecutionException(e.getLocalizedMessage(),e);
		}
    	
		return null;
	}

	
}
