package org.jnect.demo.incquery.esper.filters.continuous;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for the pattern "IQ" without time window.
 * 
 * @author idavid
 */
public class IQFilterNoWindow implements IEventFilter {

	private EPStatement statement;

	public IQFilterNoWindow(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
					  "PatternMatchEvent(patternName='I' AND type='NEW') -> " +
					  "PatternMatchEvent(patternName='Q' AND type='NEW')]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener)listener);
	}
}
