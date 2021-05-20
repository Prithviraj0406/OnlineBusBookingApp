package com.cg.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*********************************************************************
 * 
 * @author Hima Bindhu 
 * Version: 1.0 
 * Date: 19-04-2021 
 * Description: This is the entity class of the Booking module
 *
 *********************************************************************/

@Entity
@Table
public class Bus10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busId;
	private String busNumber;
	private int totalSeats;
	private int fare;
	
	@OneToOne
	@JoinColumn(name="busrouteId")
	private BusRoute10 busRoute;
	
	@ManyToOne
	@JoinColumn(name="busoperatorId",referencedColumnName = "busopeartorId")
	private  BusOperator10 busOperator;
	
	@OneToOne
	@JoinColumn(name="busoperatorrequestId")
	private BusOperatorRequest10 busOperatorRequest;


	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public BusRoute10 getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(BusRoute10 busRoute) {
		this.busRoute = busRoute;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public BusOperator10 getBusOperator() {
		return busOperator;
	}
	public void setBusOperator(BusOperator10 busOperator) {
		this.busOperator = busOperator;
	}
	public BusOperatorRequest10 getBusOperatorRequest() {
		return busOperatorRequest;
	}
	public void setBusOperatorRequest(BusOperatorRequest10 busOperatorRequest) {
		this.busOperatorRequest = busOperatorRequest;
	}

	
	/****************************************************
	 * 
	 * @param busId
	 * @param busNumber
	 * @param busRoute
	 * @param totalSeats
	 * @param fare
	 * @param busOperator 
	 * @param busOperatorRequest
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	
	public Bus10(int busId, String busNumber, BusRoute10 busRoute, int totalSeats, int fare, BusOperator10 busOperator,
			BusOperatorRequest10 busOperatorRequest) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busRoute = busRoute;
		this.totalSeats = totalSeats;
		this.fare = fare;
		this.busOperator = busOperator;
		this.busOperatorRequest = busOperatorRequest;
	}

	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public Bus10() {
		super();
		
	}
	
	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busNumber=" + busNumber + ", busRoute=" + busRoute + ", totalSeats="
				+ totalSeats + ", fare=" + fare + ", busOperator=" + busOperator + ", busOperatorRequest="
				+ busOperatorRequest + "]";
	}

}