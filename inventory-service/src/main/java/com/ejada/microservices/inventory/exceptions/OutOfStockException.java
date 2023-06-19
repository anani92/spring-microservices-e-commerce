package com.ejada.microservices.inventory.exceptions;

public class OutOfStockException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfStockException(String message) {
		super(message);
	}
}