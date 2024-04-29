package com.exception;

public class AgeInvalidException extends Exception{
	private String message;

	public String getMessage() {
		return message;
	}

	public AgeInvalidException(String message) {
		this.message = message;
	}

	private static final long serialVersionUID = 2563272640903576703L;
}
