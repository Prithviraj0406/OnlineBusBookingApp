package com.cg.dto;

public class BusRouteDto3 {
	String source;
	String destination;
	String routeName;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public BusRouteDto3(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	public BusRouteDto3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
