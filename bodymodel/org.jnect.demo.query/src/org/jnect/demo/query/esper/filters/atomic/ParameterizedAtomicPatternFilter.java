package org.jnect.demo.query.esper.filters.atomic;

import org.jnect.demo.query.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * Abstract EPL filter class for the atomic IncQuery patterns.
 * 
 * @author istvanrath
 */
public class ParameterizedAtomicPatternFilter extends AbstractFilter {

	public ParameterizedAtomicPatternFilter(EPAdministrator admin, String pName, String windowLength) {
		String stmt = "SELECT * FROM pattern[every-distinct(p.patternName, "+windowLength+") p=PatternMatchEvent(patternName='"+pName+"' AND type='NEW')]";
		statement = admin.createEPL(stmt);
	}

	
}