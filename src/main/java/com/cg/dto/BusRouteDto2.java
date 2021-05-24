package com.cg.dto;

public class BusRouteDto2 {
	private Integer busrouteId;
	private String routeName;
	public Integer getBusrouteId() {
		return busrouteId;
	}
	public void setBusrouteId(Integer busrouteId) {
		this.busrouteId = busrouteId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public BusRouteDto2(Integer busrouteId, String routeName) {
		super();
		this.busrouteId = busrouteId;
		this.routeName = routeName;
	}
	public BusRouteDto2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
