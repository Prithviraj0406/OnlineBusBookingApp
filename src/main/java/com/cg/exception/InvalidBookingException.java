package com.cg.exception;

/***********************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the implementation class of InvalidBookingException
 * Created date: 23-04-2021
 * 
 ************************************************************************************/

public class InvalidBookingException extends RuntimeException {

	/**************************************
	 * 
	 * @author Harshitha V
	 * Created date: 21-04-2021
	 * This is a no-arg constructor
	 * 
	 **************************************/
	
	public InvalidBookingException() {
		super();
		
	}

	/****************************************
	 * 
	 * @author Harshitha V
	 * Created date: 21-04-2021
	 * @param message
	 * This is a parameterized constructor
	 * 
	 *****************************************/
	
	public InvalidBookingException(String message) {
		super(message);
	
	}
	

}
