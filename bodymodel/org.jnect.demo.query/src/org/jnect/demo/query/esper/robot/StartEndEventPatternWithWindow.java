package org.jnect.demo.query.esper.robot;

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
public class StartEndEventPatternWithWindow implements IEventFilter {

	private EPStatement statement;

	public StartEndEventPatternWithWindow(EPAdministrator admin, String startPName, String endPName, String windowLength) {
		String stmt = "SELECT * FROM pattern[" +
					  "every(PatternMatchEvent(patternName='"+startPName+"' AND type='NEW') -> " +
					  		"PatternMatchEvent(patternName='"+endPName+"' AND type='NEW') WHERE timer:within("+windowLength+"))]";
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