package com.excepciones;

public class ContraseniasNoCoincidenException extends RuntimeException {

	public ContraseniasNoCoincidenException() {
		super("Las contraseñas no coinciden");
	}

}
