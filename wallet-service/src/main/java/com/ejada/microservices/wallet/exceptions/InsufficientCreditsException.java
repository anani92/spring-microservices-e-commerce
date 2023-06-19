package com.ejada.microservices.wallet.exceptions;

public class InsufficientCreditsException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InsufficientCreditsException() {
		super();
	}

	public InsufficientCreditsException(String message) {
		super(message);
	}

}
