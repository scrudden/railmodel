package org.transitclock.rail.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
This model is based on the description from
 
An online railway traffic prediction model
Pavle Kecman, Rob M.P. Goverde

Snippet from paper

"A node v ∈ V is described by (n(v), infra(v), type(v), in(v), out(v), t pred (v),
t rec (v)), representing the train number, infrastructure element (signal or platform track),
type, the set of incoming arcs, the set of outgoing arcs, predicted realisation time and the
recorded time (when available), respectively."
*/
public class Node {
	private String trainNumber;
	private InfrastutureElement infrastratureElement;
	private List<Arc> incomingArcs;
	private List<Arc> outgoingArcs;
	private Date predictionRealistationTime;
	private Date actualRealisationTime;
	public Node() {		
		super();
		incomingArcs=new LinkedList<Arc>();
		outgoingArcs=new LinkedList<Arc>();
	}
	public Node(String trainNumber, InfrastutureElement infrastratureElement, List<Arc> incomingArcs,
			List<Arc> outgoingArcs, Date predictionRealistationTime, Date actualRealisationTime) {
		super();
		this.trainNumber = trainNumber;
		this.infrastratureElement = infrastratureElement;
		this.incomingArcs = incomingArcs;
		this.outgoingArcs = outgoingArcs;
		this.predictionRealistationTime = predictionRealistationTime;
		this.actualRealisationTime = actualRealisationTime;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public InfrastutureElement getInfrastratureElement() {
		return infrastratureElement;
	}
	public void setInfrastratureElement(InfrastutureElement infrastratureElement) {
		this.infrastratureElement = infrastratureElement;
	}	
	public List<Arc> getIncomingArcs() {
		return incomingArcs;
	}	
	public List<Arc> getOutgoingArcs() {
		return outgoingArcs;
	}	
	public Date getPredictionRealistationTime() {
		return predictionRealistationTime;
	}
	public void setPredictionRealistationTime(Date predictionRealistationTime) {
		this.predictionRealistationTime = predictionRealistationTime;
	}
	public Date getActualRealisationTime() {
		return actualRealisationTime;
	}
	public void setActualRealisationTime(Date actualRealisationTime) {
		this.actualRealisationTime = actualRealisationTime;
	}
	public void  addIncomingArc(Arc arc)
	{
		if(this.incomingArcs!=null)
		{
			this.incomingArcs=new LinkedList<Arc>();
		}
		this.incomingArcs.add(arc);
	}
	public void addOutgoingArc(Arc arc)
	{
		if(this.outgoingArcs!=null)
		{
			this.outgoingArcs=new LinkedList<Arc>();
		}
	}
	
	
}
