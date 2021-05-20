package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dto.UserDto;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.InvalidRouteNameException;
import com.cg.exception.InvalidUsernameException;
import com.cg.service.IBookingService;
import com.cg.service.IBusOperatorService;
import com.cg.service.IFeedBackService;
import com.cg.service.IUsersService;

/**************************************************************
 * 
 * Version: 1.0
 * Description: This is the test class for booking module
 * Created date: 25-04-2021
 * 
 ***************************************************************/

@SpringBootTest
class OnlineBusBooking7ApplicationTests {

	@Autowired
	IBookingService bookingService;
	
	
	/***********************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws IdNotFoundException
	 * Test case passes
	 * 
	 ***********************************************************************************************************************************/
	
	@Test
	void testBookingIdExists() {
		
		assertThrows(IdNotFoundException.class,()-> {
			bookingService.getBookingDetailsById(100);
		});
	}
	
	/***********************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws IdNotFoundException
	 * Test case failed
	 * 
	 ***********************************************************************************************************************************/
	
	@Test
	void testBookingIdExists1() {
		
		assertThrows(IdNotFoundException.class,()-> {
			bookingService.getBookingDetailsById(3);
		});
	}

	

	/**********************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBookingUsernameException
	 * Test case passes
	 * 
	 **********************************************************************************************************************************************/
	
	@Test
	void testgetByUsername() {
		
		assertThrows(InvalidUsernameException.class,()-> {
			bookingService.getAllBookingsByUsername("Sonia");
		});
	}
	
	
	/**********************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBookingUsernameException
	 * Test case failed
	 * 
	 **********************************************************************************************************************************************/
	
	@Test
	void testgetByUsername2() {
		
		assertThrows(InvalidUsernameException.class,()-> {
			bookingService.getAllBookingsByUsername("hars1");
		});
	}
	
	
	
	/*******************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBusRouteNameException
	 * Test case passes
	 * 
	 *******************************************************************************************************************************************/
	
	@Test
	void testforFeedback() {
		
		assertThrows(InvalidRouteNameException.class,()-> {
			bookingService.getFeedBackByBusRoute("Delhi");
		});
	}
	
	/*******************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBusRouteNameException
	 * Test case failed
	 * 
	 *******************************************************************************************************************************************/
	
	@Test
	void testforFeedback2() {
		
		assertThrows(InvalidRouteNameException.class,()-> {
			bookingService.getFeedBackByBusRoute("Bangalore");
		});
	}
	
	
	
	@Autowired 
    IUsersService userService;
    
	/****************************************************************************
	 * 
	 * @author Durga Anand
	 * Created date: 25-04-2021
	 * This is the test case to add user details and test equality of two objects
	 * 
	 *****************************************************************************/
	
	@Test
	void addUserTest() 
	{
		UserDto userdto = new UserDto("harika", "456");
		assertEquals("anand", userService.addUser(userdto).getUsername());
		
	}
	
	/********************************************************************
	 * 
	 * @author Durga Anand
	 * Created date: 25-04-2021
	 * This is the test case to check for updation of password of a user
	 * 
	 *******************************************************************/
	
	@Test
	void updateUserPasswordTest()
	{
		assertThrows(InvalidUsernameException.class, ()->userService.updatePassword("bindhu","789"));
		
	}

	
	@Autowired
	IBusOperatorService  ibusoperatorservice;
	
	/****************************************************************************
	 * 
	 * @author Hima Bindhu
	 * Created date: 25-04-2021
	 * This is the test case to check for updation of password of a bus operator
	 * 
	 ***************************************************************************/
	
	@Test
	void updatebusOpeartorPasswordTest()
	{
		assertThrows(InvalidUsernameException.class,()->ibusoperatorservice.updatePassword("","1234"));
	}

	
	@Autowired
	IFeedBackService feedbackService;
	
	/**************************************************************************************************************************************
	 * 
	 * @author Prithviraj V
	 * Created date: 25-04-2021
	 * This is the test case to check feedback of an existing bus route details from the database which throws InvalidBusRouteNameException
	 * Test case failed
	 * 
	 **************************************************************************************************************************************/
	
	@Test
	void testRouteNameExists()
	{
		assertThrows(InvalidRouteNameException.class, ()-> {
			feedbackService.viewAllFeedBacks("Bangalore");
		});
	}
	
	/**************************************************************************************************************************************
	 * 
	 * @author Prithviraj V
	 * Created date: 25-04-2021
	 * This is the test case to check feedback of an existing bus route details from the database which throws InvalidBusRouteNameException
	 * Test case passes
	 * 
	 **************************************************************************************************************************************/
	
	@Test
	void testRouteNameExists2()
	{
		assertThrows(InvalidRouteNameException.class, ()-> {
			feedbackService.viewAllFeedBacks("New York");
		});
	}
}