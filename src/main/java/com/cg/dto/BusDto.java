package com.cg.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/*********************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the Bus module
 *
 *********************************************************************/

public class BusDto {
	
    @NotEmpty(message = "busnumber should not be null")
	private String busNumber;
	@NotNull(message = "fare should not be null")
	private int fare;
	@NotNull(message = "no of seats should not be null")
    private int totalSeats;
	@NotNull(message = "busRouteId should not be null")
	private int busRouteId;

	public BusDto(String busNumber, int fare, int totalSeats, int busRouteId) {
		super();
		this.busNumber = busNumber;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.busRouteId = busRouteId;
	}

	public BusDto() {
		super();

	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getBusRouteId() {
		return busRouteId;
	}

	public void setBusRouteId(int busRouteId) {
		this.busRouteId = busRouteId;
	}
}
