package com.excepciones;

public class NoHayUnidadesDisponiblesException extends RuntimeException {

	public NoHayUnidadesDisponiblesException() {
		super("No hay unidades disponibles del libro solicitado");
	}

}
