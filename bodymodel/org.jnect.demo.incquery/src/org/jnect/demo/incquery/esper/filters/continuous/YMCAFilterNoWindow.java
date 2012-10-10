package org.jnect.demo.incquery.esper.filters.continuous;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the pattern "YMCA" without time window.
 * 
 * @author idavid
 */
public class YMCAFilterNoWindow implements IEventFilter {

	private EPStatement statement;

	public YMCAFilterNoWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "PatternMatchEvent(patternName='Y' AND type='NEW') -> " +
					  "PatternMatchEvent(patternName='M' AND type='NEW') -> " +
					  "PatternMatchEvent(patternName='C' AND type='NEW') -> " +
					  "PatternMatchEvent(patternName='A' AND type='NEW')]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener)listener);
	}
}
