package org.jnect.demo.incquery.esper.filters.complex;

import org.jnect.demo.incquery.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * EPL filter for the pattern "IQ" with a time window of continuous time. (I.e. no discretization is applied,
 * cf. org.jnect.demo.incquery.esper.filters.sampled.IQFilterWithWindow).
 * 
 * @author idavid
 */
public class IQFilterWithWindowFeedback extends AbstractFilter {


	public IQFilterWithWindowFeedback(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(EsperMatchEvent(patternName='I') -> " +
					  		"EsperMatchEvent(patternName='Q') WHERE timer:within(5 sec))]";
		statement = admin.createEPL(stmt);
	}

}