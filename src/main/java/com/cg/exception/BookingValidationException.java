package com.cg.exception;

import java.util.ArrayList;
import java.util.List;

/***********************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the implementation class of BookingValidationException
 * Created date: 23-04-2021
 * 
 ************************************************************************************/

public class BookingValidationException extends RuntimeException {
List<String> messages = new ArrayList<>();

/**************************************
 * 
 * @author Harshitha V
 * Created date: 22-04-2021
 * This is a no-arg constructor
 * 
 **************************************/

public BookingValidationException() {
	super();
	
}

/****************************************
 * 
 * @author Harshitha V
 * Created date: 22-04-2021
 * @param message
 * This is a parameterized constructor
 * 
 *****************************************/

public BookingValidationException(List<String> messages) {
	super();
	this.messages = messages;
}

/*********************************************************
 * 
 * @author Harshitha V
 * Created date: 22-04-2021
 * @return - this method returns a list of messages.
 *
 *********************************************************/

public List<String> getMessages() {
	return messages;
}


}
