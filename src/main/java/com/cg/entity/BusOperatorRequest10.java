package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class BusOperatorRequest10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busoperatorrequestId;
	private int caseNumber;
	private String busOperatorUsername;
	private String requestMsg;
	private String requestFor; // Possible values deleteBus,update Fare,Change Route , Change Time
	private boolean status; // approved = true , unapproved = false
	private LocalDate requestDate;
	
	@OneToOne(mappedBy="busOperatorRequest")
	private Bus10 bus;


	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	
	public int getBusoperatorrequestId() {
		return busoperatorrequestId;
	}
	public void setBusoperatorrequestId(int busoperatorrequestId) {
		this.busoperatorrequestId = busoperatorrequestId;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public String getRequestMsg() {
		return requestMsg;
	}
	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}
	public String getRequestFor() {
		return requestFor;
	}
	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	public Bus10 getBus() {
		return bus;
	}
	public void setBus(Bus10 bus) {
		this.bus = bus;
	}

	
	/****************************************************
	 * 
	 * @param busoperatorrequestId
	 * @param caseNumber
	 * @param busOperatorUsername
	 * @param requestMsg
	 * @param requestFor
	 * @param status 
	 * @param requestDate 
	 * @param bus
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	
	public BusOperatorRequest10(int busoperatorrequestId, int caseNumber, String busOperatorUsername, String requestMsg,
			String requestFor, boolean status, LocalDate requestDate, Bus10 bus) {
		super();
		this.busoperatorrequestId = busoperatorrequestId;
		this.caseNumber = caseNumber;
		this.busOperatorUsername = busOperatorUsername;
		this.requestMsg = requestMsg;
		this.requestFor = requestFor;
		this.status = status;
		this.requestDate = requestDate;
		this.bus = bus;
	}

	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public BusOperatorRequest10() {
		super();
		
	}
	
	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "BusOperatorRequest [busoperatorrequestId=" + busoperatorrequestId + ", caseNumber=" + caseNumber
				+ ", busOperatorUsername=" + busOperatorUsername + ", requestMsg=" + requestMsg + ", requestFor="
				+ requestFor + ", status=" + status + ", requestDate=" + requestDate + ", bus=" + bus + "]";
	}
	

}