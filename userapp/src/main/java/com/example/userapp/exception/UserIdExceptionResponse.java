package com.example.userapp.exception;

public class UserIdExceptionResponse {
	private String userIdentifier;

	public UserIdExceptionResponse(String userIdentifier) {
		super();
		this.userIdentifier = userIdentifier;
	}

	public String getuserIdentifier() {
		return userIdentifier;
	}

	public void setuserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

}
