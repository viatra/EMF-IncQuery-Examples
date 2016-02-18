package org.jnect.demo.query.esper.filters.complex;

import org.jnect.demo.query.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * EPL filter for the pattern "IQ" without time window.
 * 
 * @author idavid
 */
public class IQFilterNoWindowFeedback extends AbstractFilter {

	public IQFilterNoWindowFeedback(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(EsperMatchEvent(patternName='I') -> " +
					  		"EsperMatchEvent(patternName='Q'))]";
		statement = admin.createEPL(stmt);
	}


}
