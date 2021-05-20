package com.cg.exception;

import java.util.ArrayList;
import java.util.List;

public class UserValidationException extends RuntimeException
{
   List<String> messages= new ArrayList();
	public UserValidationException()
	{
		super();
		
	}

	public UserValidationException(String message) 
	{
		super(message);
		
	}

	public UserValidationException(List<String> messages) 
	{
		this.messages=messages;
		
		
	}

	public List<String> getMessages() 
	{
		return messages;
	}

}