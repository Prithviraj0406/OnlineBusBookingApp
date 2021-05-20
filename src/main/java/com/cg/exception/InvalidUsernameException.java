package com.cg.exception;

public class InvalidUsernameException extends RuntimeException {

	public InvalidUsernameException() {
		super();
	}

	public InvalidUsernameException(String message) {
		super(message);

	}

}
