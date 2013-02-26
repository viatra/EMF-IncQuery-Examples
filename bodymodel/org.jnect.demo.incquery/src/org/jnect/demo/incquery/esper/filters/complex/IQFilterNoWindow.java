package org.jnect.demo.incquery.esper.filters.complex;

import org.jnect.demo.incquery.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * EPL filter for the pattern "IQ" without time window.
 * 
 * @author idavid
 */
public class IQFilterNoWindow extends AbstractFilter {

	public IQFilterNoWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(PatternMatchEvent(patternName='I' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='Q' AND type='NEW'))]";
		statement = admin.createEPL(stmt);
	}


}
