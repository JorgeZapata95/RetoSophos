package com.google.www.exceptions;

public class HttpServiceException extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String BAD_RESPONSE_SERVICE = "The service has responded with an unexpected answer ";
	
	public HttpServiceException(String message, Throwable error) {
		super(message, error);
	}

}
