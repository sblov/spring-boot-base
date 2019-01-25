package com.lov.exception;

public class UserNotExistException extends RuntimeException {

	public UserNotExistException() {
		super("user not exsit");
	}
	
}
