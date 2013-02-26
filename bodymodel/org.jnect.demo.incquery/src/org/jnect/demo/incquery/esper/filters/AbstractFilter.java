package org.jnect.demo.incquery.esper.filters;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

public abstract class AbstractFilter implements IEventFilter {

	protected EPStatement statement;

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
	
	@Override
	public void removeListener(Object listener) {
		statement.removeListener((UpdateListener) listener);
	}
	
}
