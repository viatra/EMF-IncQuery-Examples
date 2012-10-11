package org.jnect.demo.incquery.esper.filters.atomic;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the pattern "IQ" with a time window of discrete time.
 * 
 * @author idavid
 */
@Deprecated
public class IQFilterWithWindow implements IEventFilter {

	private EPStatement statement;

	/**
	 * the query itself is wrong, cf. how IQFilterNoWindow uses distinction time spec 
	 */
	public IQFilterWithWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "(every-distinct(i.patternName) i=PatternMatchEvent(patternName='I' AND type='NEW') " +
					  		"WHERE timer:within(1 sec) -> " +
					  "every-distinct(q.patternName) q=PatternMatchEvent(patternName='Q' AND type='NEW') " +
					  		"WHERE timer:within(1 sec)) " +
					  "WHERE timer:within(5 sec)]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
}