package org.jnect.demo.query.esper;

/**
 * Common interface for Esper listeners.
 * @author istvanrath
 *
 */
public interface IEventFilter {
	public void addListener(Object listener);
	public void removeListener(Object listener);
}
