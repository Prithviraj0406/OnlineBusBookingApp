package com.cg.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
public class BusRoute10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="busRoute_Counter",sequenceName="busRoute_Sequence",initialValue=1)
	private  int busrouteId;
	@Column(unique=true)
	private String routeName ;
	private String source;
	private String destination;
	
	@OneToOne(mappedBy="busRoute")
	private Bus10 bus;

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	
	public int getBusrouteId() {
		return busrouteId;
	}

	public void setBusrouteId(int busrouteId) {
		this.busrouteId = busrouteId;
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

	public Bus10 getBus() {
		return bus;
	}

	public void setBus(Bus10 bus) {
		this.bus = bus;
	}

	
	/****************************************************
	 * 
	 * @param busrouteId
	 * @param routeName
	 * @param source
	 * @param destination
	 * @param bus
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	
	public BusRoute10(int busrouteId, String routeName, String source, String destination, Bus10 bus) {
		super();
		this.busrouteId = busrouteId;
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
		this.bus = bus;
		
	}

	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public BusRoute10() {
		super();
		
	}
	
	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "BusRoute [busrouteId=" + busrouteId + ", routeName=" + routeName + ", source=" + source
				+ ", destination=" + destination + ", bus=" + bus + "]";
	}

	
}