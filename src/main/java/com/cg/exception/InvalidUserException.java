package com.cg.exception;

public class InvalidUserException extends RuntimeException {

	public InvalidUserException() {
		super();
		
	}

	public InvalidUserException(String message) {
		super(message);
	
	}
	
	

}