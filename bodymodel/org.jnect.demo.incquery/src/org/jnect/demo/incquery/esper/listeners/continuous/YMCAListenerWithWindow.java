package org.jnect.demo.incquery.esper.listeners.continuous;

import org.jnect.demo.incquery.esper.AbstractListener;

public class YMCAListenerWithWindow extends AbstractListener {
	
	public YMCAListenerWithWindow() {
		super("ESPER: YMCA complex pattern with time window recognized.", "[YMCA]");
	}
}