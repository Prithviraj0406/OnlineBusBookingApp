package com.cg.exception;

import java.util.ArrayList;
import java.util.List;

public class BusOperatorValidationException extends RuntimeException {
	
	List<String> messages = new ArrayList<>();

	public BusOperatorValidationException() {
		super();

	}

	public BusOperatorValidationException(List<String> messages) {
		super();
		this.messages = messages;
	}

	public List<String> getMessages() {
		return messages;
	}

}