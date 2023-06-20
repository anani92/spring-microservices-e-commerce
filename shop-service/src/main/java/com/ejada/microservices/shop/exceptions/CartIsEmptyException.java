package com.ejada.microservices.shop.exceptions;

public class CartIsEmptyException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CartIsEmptyException() {
		super();
	}

	public CartIsEmptyException(String message) {
		super(message);
	}

}
