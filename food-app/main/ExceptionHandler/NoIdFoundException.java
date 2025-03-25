package com.springboot.ExceptionHandler;

public class NoIdFoundException extends RuntimeException{
	
	private String message = "id does not exists";
	
	public NoIdFoundException() {
		super();
	}
	
	
	public NoIdFoundException(String message) {
		super();
		this.message = message;
	}
	
	
	public String getMessage() {
		return message;
	}
}
	
	