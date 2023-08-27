package com.excepciones;

public class ContraseniaIncorrectaException extends RuntimeException{

	public ContraseniaIncorrectaException() {
		super("Contraseña incorrecta");
	}

}
