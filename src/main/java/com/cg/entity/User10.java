package com.cg.entity;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


/*********************************************************************
 * 
 * @author S Durga Anand
 * Version: 1.0
 * Date: 20-04-2021
 * Description: This is the entity class of the User module
 *
 *********************************************************************/

@Entity
@Table
public class User10 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="userCounter",sequenceName="userSequence",initialValue=1)
	private long userId; 
	@NotEmpty(message="username should not be empty")
	private String username;
	@NotEmpty(message="password should not be empty")
	private String password;

	@OneToMany(mappedBy="userId")
	private List<Booking10> bookingId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	@MapKeyColumn(name="Booking_feedback",nullable=true)
	private Map<Booking10, Feedback10> bookingFeedbackInfo;

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Booking10> getBookingobj() {
		return bookingId;
	}

	public void setBookingobj(List<Booking10> bookingobj) {
		this.bookingId = bookingobj;
	}
	
	public Map<Booking10, Feedback10> getBookingFeedbackInfo() {
		return bookingFeedbackInfo;
	}
	public void setBookingFeedbackInfo(Map<Booking10, Feedback10> bookingFeedbackInfo) {
		this.bookingFeedbackInfo = bookingFeedbackInfo;
	}
	
	
	/****************************************************
	 * 
	 * @param userId
	 * @param username
	 * @param password
	 * @param bookingobj
	 * @param bookinfFeedbackInfo
	 * This is a parameterized constructor
	 * 
	 ******************************************************/

	public User10(long userId, @NotEmpty(message = "username should not be empty") String username,
			@NotEmpty(message = "password should not be empty") String password, List<Booking10> bookingId, 
			Map<Booking10, Feedback10> bookingFeedbackInfo
			) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.bookingId = bookingId;
		this.bookingFeedbackInfo = bookingFeedbackInfo;
	}
	
	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public User10() {
		super();
		
	}
	

	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "User10 [userId=" + userId + ", username=" + username + ", password=" + password + ", bookingobj="
				+ bookingId + "]";
	}
	
	
	
	
	
	
	

}