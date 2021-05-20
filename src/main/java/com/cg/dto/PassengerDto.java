package com.cg.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/*********************************************************************
 * 
 * @author Harshitha V 
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the Passenger module
 *
 *********************************************************************/

public class PassengerDto 
{
	@NotEmpty(message="username should not be empty")
	private String username;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	@Email(message = "Enter valid email id")
    private String email;
	private long identityDocNumber;
	private String identityDocumentName;
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
	public PassengerDto(@NotEmpty(message = "username should not be empty") String username, String firstName,
			String lastName, long phoneNumber, @Email(message = "Enter valid email id") String email,
			long identityDocNumber, String identityDocumentName) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.identityDocNumber = identityDocNumber;
		this.identityDocumentName = identityDocumentName;
	}
	public PassengerDto() {
		super();
	}
	
	

}
