package com.excepciones;

public class EntradasNumericasInvalidasException extends RuntimeException{

	public EntradasNumericasInvalidasException() {
		super("Campos numéricos inválidos");
	}

}
