package com.excepciones;

public class FechaInvalidaException extends RuntimeException {

	public FechaInvalidaException() {
		super("La fecha de vencimiento ocurre antes que la actual");
	}
}
