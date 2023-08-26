package com.excepciones;

public class CuentaExistenteException extends RuntimeException {

	public CuentaExistenteException() {
		super("Este usuario ya esta en uso");
	}

}
