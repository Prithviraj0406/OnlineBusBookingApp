package com.cg.exception;

import java.util.ArrayList;
import java.util.List;

/***************************************************************************************
 * 
 * Version: 1.0
 * Description: This is the implementation class of OnlineBusBookingValidationException
 * 				handels list of validation messages 
 * Created date: 23-04-2021
 * 
 ***************************************************************************************/

public class OnlineBusBookingValidationException extends RuntimeException {
List<String> messages = new ArrayList<>();

/**************************************
 * 
 * Created date: 22-04-2021
 * This is a no-arg constructor
 * 
 **************************************/

public OnlineBusBookingValidationException() {
	super();
	
}

/****************************************
 * 
 * Created date: 22-04-2021
 * @param message
 * This is a parameterized constructor
 * 
 *****************************************/

public OnlineBusBookingValidationException(List<String> messages) {
	super();
	this.messages = messages;
}

/*********************************************************
 * 
 * Created date: 22-04-2021
 * @return - this method returns a list of messages.
 *
 *********************************************************/

public List<String> getMessages() {
	return messages;
}


}
