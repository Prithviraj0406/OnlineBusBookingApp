package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*************************************************************************
 * 
 * Description: This is global exception class to handle all exceptions
 * Created date: 20-04-2021
 * 
 *************************************************************************/


@RestControllerAdvice
public class OnlineBusBookingGlobalController  
{
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(BookingValidationException.class)
	public ResponseEntity<Object> handleException(BookingValidationException exception)
	{
		return new ResponseEntity<Object>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidBookingException.class)
	public ResponseEntity<Object> handleException(InvalidBookingException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidDateException.class)
	public ResponseEntity<Object> handleException(InvalidDateException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	

	/****************************************************************************************
	 * 
	 * @author Durga Anand
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = UsernameAlreadyExistsException.class)
	public ResponseEntity<Object> handleException(UsernameAlreadyExistsException exception) {
		
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.CONFLICT);

	}

	/****************************************************************************************
	 * 
	 * @author Durga Anand
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidUsernameException.class)
	public ResponseEntity<Object> handleException(InvalidUsernameException exception) {
	
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);

	}


	/****************************************************************************************
	 * 
	 * @author Durga Anand
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = UserValidationException.class)
	public ResponseEntity<Object> handleException(UserValidationException exception) {
		return new ResponseEntity<>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
	

	/****************************************************************************************
	 * 
	 * @author Durga Anand
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidUserException.class)
	public ResponseEntity<Object> handleException(InvalidUserException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	/****************************************************************************************
	 * 
	 * @author Hima Bindhu
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidBusOperatorException.class)
	public ResponseEntity<Object> handleException(InvalidBusOperatorException exception) {
		
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	
	}

	
	/****************************************************************************************
	 * 
	 * @author Hima Bindhu
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = BusOperatorValidationException.class)
	public ResponseEntity<Object> handleException(BusOperatorValidationException exception) {
	
		return new ResponseEntity<>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	
	}

	
	/****************************************************************************************
	 * 
	 * @author Hima Bindhu
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = BusNotFoundException.class)
	public ResponseEntity<Object> handleException(BusNotFoundException exception) {
	
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	
	}
	
	
	/****************************************************************************************
	 * 
	 * @author Prithviraj V
	 * Created date: 20-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidRouteNameException.class)
	public ResponseEntity<Object> handleException(InvalidRouteNameException exception) {
	
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	
	}


}
