package org.jnect.demo.incquery.esper;

/**
 * Common interface for Esper listeners.
 * @author istvanrath
 *
 */
public interface IEventFilter {
	public void addListener(Object listener);
	public void removeListener(Object listener);
}
