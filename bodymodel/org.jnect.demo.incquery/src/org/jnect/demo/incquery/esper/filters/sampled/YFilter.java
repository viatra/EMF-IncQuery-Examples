package org.jnect.demo.incquery.esper.filters.sampled;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the atomic pattern "Y".
 * 
 * @author idavid
 */
public class YFilter implements IEventFilter {

	private EPStatement statement;

	public YFilter(EPAdministrator admin) {
		String stmt = "SELECT DISTINCT * FROM PatternMatchEvent(patternName='Y' AND type='NEW') output every 1 seconds";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
}