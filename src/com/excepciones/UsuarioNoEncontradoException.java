package com.excepciones;

public class UsuarioNoEncontradoException extends RuntimeException {

	public UsuarioNoEncontradoException() {
		super("Usuario no encontrado");
	}

}
