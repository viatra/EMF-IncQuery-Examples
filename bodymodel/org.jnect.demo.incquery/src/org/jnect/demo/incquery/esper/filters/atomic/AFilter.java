package org.jnect.demo.incquery.esper.filters.atomic;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the atomic pattern "A".
 * 
 * @author idavid
 */
public class AFilter implements IEventFilter {

	private EPStatement statement;

	public AFilter(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[every-distinct(p.patternName, 1 seconds) p=PatternMatchEvent(patternName='A' AND type='NEW')]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
}