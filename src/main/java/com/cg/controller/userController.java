package com.cg.controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.UserDto;
import com.cg.exception.InvalidUserException;
import com.cg.exception.InvalidUsernameException;
import com.cg.exception.UserValidationException;
import com.cg.exception.UsernameAlreadyExistsException;
import com.cg.exception.UsernameNotFoundException;
import com.cg.service.userServiceImpl;


/******************************************************************
 * 
 * @author Durga Anand
 * Description: This class is used for user controller where we can add, delete , update user
 * Version: v1.1
 * Created date: 20 April 2021
 * 
 *******************************************************************/
@RestController
@RequestMapping("/user")

public class userController {
	
	@Autowired
	private userServiceImpl userservice;
	
	
	/*************
	 * Method : addUser
	 * Description: method used for adding a new user
	 * 
	 * @param user
	 * @return ResponseEntity<Object>
	 * @PostMapping: Annotation used for mapping HTTP POST requests onto specific handler methods.
	 * Created date: 20 April 2021
	 * 
	 */
	
	@PostMapping("/userapi")
	public ResponseEntity<Object> addUser(@Valid @RequestBody UserDto user, BindingResult bindingResult)
	{
		if (bindingResult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new UserValidationException(errMessages);
		}
	    try
	    {
		userservice.addUser(user);
	    }
	    catch(InvalidUserException exception)
	    {
	    	throw new InvalidUserException("userName or password invalid");
	    }
		return new ResponseEntity<>("Added User Successfully", HttpStatus.OK);
	}
	
	
	/*************
	 * Method : deleteUser
	 * Description: method used for deleting existing  user
	 * 
	 * @param username
	 * @return ResponseEntity<Object>
	 * @DeleteMapping: Annotation used for mapping HTTP DELETE requests onto specific handler methods.
	 * Created date: 20 April 2021
	 * 
	 */
	@DeleteMapping("/delete/{username}")
	public ResponseEntity<Object> deleteUser(@Valid @PathVariable String username) {
		 try {
		userservice.deleteUser(username);
		 }
		 catch(UsernameNotFoundException exception)
		 {
			 throw new UsernameNotFoundException("user not found");
		 }
		return new ResponseEntity<>("Deleted User Successfully", HttpStatus.OK);
	}
    
    
	 /*************
		 * Method : updatePassword
		 * Description: method used updating password of an existing user
		 * 
		 * @param username, newPassword
		 * @return ResponseEntity<Object>
		 * @PuttMapping: Annotation used for mapping HTTP PUT requests onto specific handler methods.
		 * Created date: 20 April 2021
		 * 
		 */
		
    @PutMapping("/updateP/{username}")
    public ResponseEntity<Object> updatePassword(@Valid @PathVariable String username,@RequestBody String newPassword, BindingResult bindingResult) 
    {
    	if (bindingResult.hasErrors()) 
    	{
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
	
			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new UserValidationException(errMessages);
		 }
	   try
	   {
		   userservice.updatePassword(username, newPassword);
	   }
	   catch(InvalidUsernameException exception)
	   {
	   		throw new InvalidUsernameException("username not found ");
	   }
	   catch(InvalidUserException exception)
	   {
		   throw new InvalidUserException("userName or password invalid");
	   }
		  
	   return new ResponseEntity<>("password updated successfully", HttpStatus.OK);
	}

        
}