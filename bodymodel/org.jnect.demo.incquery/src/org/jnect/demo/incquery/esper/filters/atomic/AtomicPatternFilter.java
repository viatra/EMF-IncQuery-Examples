package org.jnect.demo.incquery.esper.filters.atomic;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * Abstract EPL filter class for the atomic IncQuery patterns.
 * 
 * @author istvanrath
 */
public class AtomicPatternFilter implements IEventFilter {

	protected EPStatement statement;

	public AtomicPatternFilter(EPAdministrator admin, String pName) {
		String stmt = "SELECT * FROM pattern[every-distinct(p.patternName, 1 seconds) p=PatternMatchEvent(patternName='"+pName+"' AND type='NEW')]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
}