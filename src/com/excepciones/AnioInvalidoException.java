package com.excepciones;

public class AnioInvalidoException extends RuntimeException{

	public AnioInvalidoException() {
		super("El año seleccionado es invalido");
	}

}
