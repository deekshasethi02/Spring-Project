package com.example.pbapp.exception;

public class ContactAlreadyExistsException extends Exception {
	
	/**
	 * Creating ContactAlreadyExistsException object without error message
	 */
	public ContactAlreadyExistsException() {
		super();
	}
	/**
	 * Creating ContactAlreadyExistsException object with error message
	 */
	public ContactAlreadyExistsException(String errMsg) {
		super(errMsg);
	}
}
