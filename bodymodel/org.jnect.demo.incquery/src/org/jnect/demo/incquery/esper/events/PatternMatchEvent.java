package org.jnect.demo.incquery.esper.events;

import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.jnect.demo.incquery.esper.events.PatternMatchEventType;

/**
 * DTO to pass IncQuery pattern matching deltas to Esper.
 * @author istvan rath
 *
 */
public class PatternMatchEvent {
	private IPatternMatch match;
	private String patternName;
	private PatternMatchEventType type;
	
	public PatternMatchEvent(IPatternMatch _pm, String _pname, PatternMatchEventType _type) {
		this.patternName = _pname;
		this.match = _pm;
		this.type = _type;
	}
	
	@Override
	public String toString() {
		return ""+type.toString()+" match for "+patternName;
	}

	public IPatternMatch getMatch() {
		return match;
	}

	public String getPatternName() {
		return patternName;
	}

	public String getType() {
		return type.toString();
	}
}