package com.cg.dto;

import javax.validation.constraints.NotEmpty;

/*********************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the BusRoute module
 *
 *********************************************************************/

public class BusRouteDto {
	@NotEmpty(message = "routename should not be empty")
	private String routeName;
	@NotEmpty(message = "source should not be empty")
	private String source;
	@NotEmpty(message = "destination should not be empty")
	private String destination;

	public BusRouteDto(String routeName, String source, String destination) {
		super();
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
	}

	public BusRouteDto() {
		super();

	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

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

}
