package org.jnect.demo.incquery.esper;

import org.jnect.demo.incquery.views.YMCADemoView;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

import static org.jnect.demo.incquery.esper.utils.Logger.*;

/**
 * A super class for all the EPL listeners.
 * 
 * @author idavid
 */
public class EsperPatternListener implements UpdateListener {
	protected String consolMessage;
	protected String guiMessage;

	public EsperPatternListener(String pName) {
	    this("ESPER: "+pName+" atomic pattern recognized.","["+pName+"]");
	}
	
	public EsperPatternListener(String consolMessage, String guiMessage) {
		this.consolMessage = consolMessage;
		this.guiMessage = guiMessage;
	}

	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		if (newEvents != null) {
			logEvent(newEvents[0]);
		}
	}

	protected void logEvent(EventBean event) {
		log(consolMessage);
		YMCADemoView.appendStringEsper(guiMessage);
	}
}