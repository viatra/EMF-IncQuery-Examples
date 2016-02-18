package org.jnect.demo.query.sheldon;

import org.jnect.demo.query.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

/**
 * EPL filter for a complex EPL pattern based on start and end IQPL patterns
 * with a time window of continuous time. 
 * 
 * @author istvanrath
 */
public class SheldonEventPatternWithWindowFeedback implements IEventFilter {

	private EPStatement statement;

	public SheldonEventPatternWithWindowFeedback(EPAdministrator admin, String windowLength) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(EsperMatchEvent(patternName='SS') -> " +
					        "EsperMatchEvent(patternName='SM') -> " +
					  		"EsperMatchEvent(patternName='SE') WHERE timer:within("+windowLength+"))]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener) listener);
	}
	
	@Override
	public void removeListener(Object listener) {
		statement.removeListener((UpdateListener) listener);
	}
}