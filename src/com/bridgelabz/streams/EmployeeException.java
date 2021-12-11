package com.bridgelabz.streams;

public class EmployeeException extends RuntimeException {

	private String errorMessage;

	public EmployeeException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	
}
