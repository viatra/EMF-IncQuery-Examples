package org.jnect.demo.query.esper.filters.atomic;

import org.jnect.demo.query.esper.filters.AbstractFilter;

import com.espertech.esper.client.EPAdministrator;

/**
 * Abstract EPL filter class for the atomic IncQuery patterns.
 * 
 * @author istvanrath
 */
public class AtomicPatternFilter extends AbstractFilter {

	public AtomicPatternFilter(EPAdministrator admin, String pName) {
		String stmt = "SELECT * FROM pattern[every-distinct(p.patternName, 1 seconds) p=PatternMatchEvent(patternName='"+pName+"' AND type='NEW')]";
		statement = admin.createEPL(stmt);
	}

	
}