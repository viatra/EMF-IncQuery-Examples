package org.jnect.demo.incquery.esper.filters.complex;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the pattern "IQ" with a time window of continuous time. (I.e. no discretization is applied,
 * cf. org.jnect.demo.incquery.esper.filters.sampled.IQFilterWithWindow).
 * 
 * @author idavid
 */
public class IQFilterWithWindow implements IEventFilter {

	private EPStatement statement;

	public IQFilterWithWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(PatternMatchEvent(patternName='I' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='Q' AND type='NEW') WHERE timer:within(5 sec))]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
}