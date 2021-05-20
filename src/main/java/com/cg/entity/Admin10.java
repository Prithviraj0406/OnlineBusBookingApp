package com.cg.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*********************************************************************
 * 
 * @author Pranav 
 * Version: 1.0 
 * Date: 19-04-2021 
 * Description: This is the entity class of the Booking module
 *
 *********************************************************************/

@Entity
@Table
public class Admin10 {
	@Id
	private int adminId;
	private String adminUsername;
	private String password;
	
	@Column
    @ElementCollection(targetClass=Integer.class)
	private List<Integer> caseNumber; // bus operator's updation or bus cancelation request

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Integer> getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}

	
	/****************************************************
	 * 
	 * @param adminId
	 * @param adminUsername
	 * @param password
	 * @param caseNumber
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	
	public Admin10(int adminId, String adminUsername, String password, List<Integer> caseNumber) {
		super();
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.password = password;
		this.caseNumber = caseNumber;
	}

	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public Admin10() {
		super();
		
	}

	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "Admin10 [adminId=" + adminId + ", adminUsername=" + adminUsername + ", password=" + password
				+ ", caseNumber=" + caseNumber + "]";
	}
	
	
	
	
	
	
}