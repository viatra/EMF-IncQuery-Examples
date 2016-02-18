package org.jnect.demo.query.esper.filters.complex;

import org.jnect.demo.query.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * EPL filter for the pattern "YMCA" with a time window of continuous time. (I.e. no discretization is
 * applied).
 * 
 * @author idavid
 */
public class YMCAFilterWithWindowFeedback extends AbstractFilter {

	public YMCAFilterWithWindowFeedback(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(EsperMatchEvent(patternName='Y') -> " +
					  		"EsperMatchEvent(patternName='M') -> " +
					  		"EsperMatchEvent(patternName='C') -> " +
					  		"EsperMatchEvent(patternName='A') WHERE timer:within(10 sec))]";
		statement = admin.createEPL(stmt);
	}

}
