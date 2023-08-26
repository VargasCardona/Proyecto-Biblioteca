package com.excepciones;

public class CedulaEnUsoException extends RuntimeException {

	public CedulaEnUsoException() {
		super("Esta cédula ya esta en uso");
	}

}
