package org.jnect.demo.incquery.esper;

import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;

/**
 * DTO to pass IncQuery pattern matching deltas to Esper.
 * @author istvan rath
 *
 */
public class PatternMatchEvent {

	IPatternMatch match;
	
	String patternName;
	
	enum EventType {
		NEW, LOST
	}
	
	EventType type;
	
	public PatternMatchEvent(IPatternMatch _pm, String _pname, EventType _type) {
		this.patternName = _pname;
		this.match = _pm;
		this.type = _type;
	}
	
	@Override
	public String toString() {
		return ""+type.toString()+" match for "+patternName;
	}
	
}
