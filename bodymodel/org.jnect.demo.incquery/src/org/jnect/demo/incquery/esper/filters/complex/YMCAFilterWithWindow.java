package org.jnect.demo.incquery.esper.filters.complex;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the pattern "YMCA" with a time window of continuous time. (I.e. no discretization is
 * applied).
 * 
 * @author idavid
 */
public class YMCAFilterWithWindow implements IEventFilter {

	private EPStatement statement;

	public YMCAFilterWithWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(PatternMatchEvent(patternName='Y' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='M' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='C' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='A' AND type='NEW') WHERE timer:within(10 sec))]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener)listener);
	}
}
