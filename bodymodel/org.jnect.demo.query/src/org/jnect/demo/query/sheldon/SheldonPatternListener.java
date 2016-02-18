package org.jnect.demo.query.sheldon;

import org.jnect.demo.query.esper.EsperPatternListener;

import com.espertech.esper.client.EventBean;

/**
 * An Esper listener for the awt.Robot example that translates Esper events to OS-level keypresses.
 * 
 * @author istvanrath
 */
public class SheldonPatternListener extends EsperPatternListener {
	
    
	public SheldonPatternListener(String pName) {
        super(pName);
    }

    @Override
	protected void logEvent(EventBean event) {
		super.logEvent(event);
		SheldonConnectivity.getInstance().sendUDPMessage();
	}
}