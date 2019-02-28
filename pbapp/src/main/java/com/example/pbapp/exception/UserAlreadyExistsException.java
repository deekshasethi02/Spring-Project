package com.example.pbapp.exception;

public class UserAlreadyExistsException extends Exception {
	
	/**
	 * Creating UserAlreadyExistsException object without error message
	 */
	public UserAlreadyExistsException() {
		super();
		
	}
	/**
	 * Creating UserAlreadyExistsException object with error message
	 */
	public UserAlreadyExistsException(String errMsg) {
		super(errMsg);
		
	}
	
}
