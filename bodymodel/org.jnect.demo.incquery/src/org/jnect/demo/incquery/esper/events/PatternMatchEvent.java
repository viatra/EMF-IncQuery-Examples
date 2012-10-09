package org.jnect.demo.incquery.esper.events;

import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;

/**
 * DTO to pass IncQuery pattern matching deltas to Esper.
 * @author istvan rath
 *
 */
public class PatternMatchEvent {
	private String patternName;
	public IPatternMatch match;
	
	
	public enum EventType {
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

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}
}
