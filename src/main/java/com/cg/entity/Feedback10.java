package com.cg.entity;

import javax.persistence.CascadeType;
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
 * @author Prithviraj V 
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the entity class of the Feedback module
 *
 *********************************************************************/

@Entity
@Table
public class Feedback10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	private int ratings;
	private String comments;
	private String username;
	private String routeName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User10 user;

	@OneToOne
	@JoinColumn(name="busoperatorId")
	private BusOperator10 busoperator;

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public User10 getUser() {
		return user;
	}

	public void setUser(User10 user) {
		this.user = user;
	}

	public BusOperator10 getBusoperator() {
		return busoperator;
	}

	public void setBusoperator(BusOperator10 busoperator) {
		this.busoperator = busoperator;
	}

	
	/****************************************************
	 * 
	 * @param feedbackId
	 * @param ratings
	 * @param comments
	 * @param username
	 * @param routeName
	 * @param user
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	
	public Feedback10(int feedbackId, int ratings, String comments, String username, String routeName, User10 user,
			BusOperator10 busoperator
			) {
		super();
		this.feedbackId = feedbackId;
		this.ratings = ratings;
		this.comments = comments;
		this.username = username;
		this.routeName = routeName;
		this.user = user;
		this.busoperator = busoperator;
	}

	
	/**********************************
	 * 
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public Feedback10() {
		super();
		
	}

	
	/*******************************
	 * 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", ratings=" + ratings + ", comments=" + comments + ", username="
				+ username + ", routeName=" + routeName + ", user=" + user + ", busoperator=" + busoperator + 
				"]";
	}
	
	
	

}