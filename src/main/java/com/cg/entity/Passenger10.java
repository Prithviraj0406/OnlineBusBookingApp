package com.cg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/*********************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Date: 19-04-2021
 * Description: This is the entity class of the Passenger module
 *
 *********************************************************************/

@Entity
@Table
public class Passenger10 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="passenger_Counter",sequenceName="passenger_Sequence",initialValue=1)
	private int passengerId;
	@NotEmpty(message="username should not be empty")
	private String username;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	@Email(message = "Enter valid email id")
    private String email;
	private long identityDocNumber;
	private String identityDocumentName;

	@OneToMany(mappedBy="passengerInfo", cascade=  CascadeType.ALL)
	private List<Booking10> booking;

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIdentityDocNumber() {
		return identityDocNumber;
	}

	public void setIdentityDocNumber(long identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
	}

	public String getIdentityDocumentName() {
		return identityDocumentName;
	}

	public void setIdentityDocumentName(String identityDocumentName) {
		this.identityDocumentName = identityDocumentName;
	}

	public List<Booking10> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking10> booking) {
		this.booking = booking;
	}

	
	/****************************************************
	 * 
	 * @param passengerId
	 * @param username
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param email
	 * @param identityDocNumber
	 * @param identityDocumentName
	 * @param booking
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	
	public Passenger10(int passengerId, String username, String firstName, String lastName, long phoneNumber,
			String email, long identityDocNumber, String identityDocumentName, List<Booking10> booking) {
		super();
		this.passengerId = passengerId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.identityDocNumber = identityDocNumber;
		this.identityDocumentName = identityDocumentName;
		this.booking = booking;
	}

	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public Passenger10() {
		super();
		
	}


	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/
	
	@Override
	public String toString() {
		return "Passenger10 [passengerId=" + passengerId + ", username=" + username + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", identityDocNumber=" + identityDocNumber + ", identityDocumentName=" + identityDocumentName
				+ ", booking=" + booking + "]";
	}
	
	
	
	
	
	

}