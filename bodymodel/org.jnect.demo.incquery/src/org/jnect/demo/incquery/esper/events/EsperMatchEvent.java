package org.jnect.demo.incquery.esper.events;


/**
 * DTO to feedback Esper match events to Esper.
 * @author istvan rath
 *
 */
public class EsperMatchEvent {

	private String patternName;
	
	public EsperMatchEvent(String _pname) {
		this.patternName = _pname;
	}
	
	@Override
	public String toString() {
		return "Esper match for "+patternName;
	}

	public String getPatternName() {
		return patternName;
	}

}