package com.excepciones;

public class UsuarioEnPrestamoException extends RuntimeException {

	public UsuarioEnPrestamoException() {
		super("El usuario se encuentra asociado a un préstamo");
	}

}
