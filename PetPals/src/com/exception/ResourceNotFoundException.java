package com.exception;

public class ResourceNotFoundException extends Exception {
	private String message;

	public String getMessage() {
		return message;
	}

	public ResourceNotFoundException(String message) {
		this.message = message;
	}

	private static final long serialVersionUID = 2563272640903576703L;
}
