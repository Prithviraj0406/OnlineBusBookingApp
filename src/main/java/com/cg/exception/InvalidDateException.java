package com.cg.exception;

/***********************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the implementation class of InvalidDateException
 * Created date: 24-04-2021
 * 
 ************************************************************************************/

public class InvalidDateException extends RuntimeException{
	
	/**************************************
	 * 
	 * @author Harshitha V
	 * Created date: 21-04-2021
	 * This is a no-arg constructor
	 * 
	 **************************************/
	
	public InvalidDateException() {
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
	
	public InvalidDateException(String message) {
		super(message);
	}

}
