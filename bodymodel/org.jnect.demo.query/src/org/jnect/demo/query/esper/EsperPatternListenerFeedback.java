package org.jnect.demo.query.esper;

import org.jnect.demo.query.esper.events.EsperMatchEvent;

import com.espertech.esper.client.EventBean;

/**
 * Feedback listener that feeds Esper match event back to the Esper event stream.
 * @author istvanrath
 */
public class EsperPatternListenerFeedback extends EsperPatternListener {
	
	protected String pName;

	public EsperPatternListenerFeedback(String _pName) {
		super("ESPERFEEDBACK: "+_pName+" atomic pattern recognized.","["+_pName+"]");
		this.pName = _pName;
	}
	
	
	@Override
	protected void logEvent(EventBean event) {
		super.logEvent(event);
		// insert EsperMatchEvent into event stream
		EsperManager.getInstance().sendEvent(new EsperMatchEvent(pName));
	}
}