package org.transitclock.rail.model;
/*
An arc e ∈ E is described by (start(e), end(e), w(e), type(e)) representing the start
event, the end event, the arc weight and the arc type (dwell, run, headway, connection).
 */
public class Arc {
	private Node startEvent;
	private Node endEvent;
	private Weight weight;
	private ArcType type;
	
	public Arc(Node startEvent, Node endEvent, Weight weight, ArcType type) {
		super();
		this.startEvent = startEvent;
		this.endEvent = endEvent;
		this.weight = weight;
		this.type = type;
	}
	public Arc() {
		super();		
	}	
	
	public Node getStartEvent() {
		return startEvent;
	}
	public void setStartEvent(Node startEvent) {
		this.startEvent = startEvent;
	}
	public Node getEndEvent() {
		return endEvent;
	}
	public void setEndEvent(Node endEvent) {
		this.endEvent = endEvent;
	}
	public Weight getWeight() {
		return weight;
	}
	public void setWeight(Weight weight) {
		this.weight = weight;
	}
	public ArcType getType() {
		return type;
	}
	public void setType(ArcType type) {
		this.type = type;
	}
	
}
