package com.bytebank.model;

public class NotEnoughException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEnoughException(String message) {
		super(message);
	}

}
