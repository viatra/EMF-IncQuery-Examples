package org.jnect.demo.incquery.esper;

import java.io.Serializable;

public class DBServerFull implements Serializable{
	//Unique identifier of the Event - no business information here, only for tracing
	private String eventId;
	//Unique identifier of the source
	private String sourceId = "DBServer1";
	//Event characteristic
	private String characteristic;
	//Measurement(s)
	private double FreeSpace;
	
	//getters and setters
	public String getEventId (){
		return eventId;
	}
	
	public void setEventId (String eventId){
		this.eventId = eventId;
	}
	public String getSourceId (){
		return sourceId;
	}
	
	public void setSourceId (String sourceId){
		this.sourceId = sourceId;
	}
	
	public String getCharacteristic (){
		return characteristic;
	}
	
	public void setCharacteristic (String characteristic){
		this.characteristic = characteristic;
	}
	
	public double getFreeSpace (){
		return FreeSpace;
	}
	
	public void setFreeSpace (double FreeSpace){
		this.FreeSpace = FreeSpace;
	}
	
}
