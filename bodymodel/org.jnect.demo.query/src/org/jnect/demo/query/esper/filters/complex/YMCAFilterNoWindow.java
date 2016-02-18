package org.jnect.demo.query.esper.filters.complex;

import org.jnect.demo.query.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * EPL filter for the pattern "YMCA" without time window.
 * 
 * @author idavid
 */
public class YMCAFilterNoWindow extends AbstractFilter {

	public YMCAFilterNoWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(PatternMatchEvent(patternName='Y' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='M' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='C' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='A' AND type='NEW'))]";
		statement = admin.createEPL(stmt);
	}

}
