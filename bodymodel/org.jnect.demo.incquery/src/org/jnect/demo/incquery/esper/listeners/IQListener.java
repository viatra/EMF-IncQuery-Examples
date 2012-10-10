package org.jnect.demo.incquery.esper.listeners;

import org.jnect.demo.incquery.views.YMCADemoView;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class IQListener implements UpdateListener{
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		if (newEvents != null) {
			logEvent(newEvents[0]);
		}
	}

	private void logEvent(EventBean event) {
		System.out.println("ESPER: IQ complex pattern recognized.");
		YMCADemoView.appendStringEsper("[IQ]");
	}
}