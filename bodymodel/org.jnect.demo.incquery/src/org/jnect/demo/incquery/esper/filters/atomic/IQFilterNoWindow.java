package org.jnect.demo.incquery.esper.filters.atomic;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the pattern "IQ" with time-discretization (sampling) applied.
 * 
 * @author idavid
 */
@Deprecated
public class IQFilterNoWindow implements IEventFilter {

	private EPStatement statement;

	public IQFilterNoWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" + 
					  "every((every-distinct(i.patternName, 1 seconds) i=PatternMatchEvent(patternName='I' AND type='NEW')) -> " + 
					  	   "(every-distinct(q.patternName, 1 seconds) q=PatternMatchEvent(patternName='Q' AND type='NEW')))]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
}