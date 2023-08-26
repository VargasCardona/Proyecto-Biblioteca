package com.utils;

import static java.lang.String.valueOf;

public class Utils {
	
	/**
	 * Verifica si el String ingresado no es un double.
	 *
	 * @param entrada String a procesar
	 * @return boolean indicando si el String ingresado no es un double
	 * longs
	 * @throws NumberFormatException {@inheritDoc}
	 */
	public static boolean validarDouble(String entrada) {
		Double aux;
		try {
			aux = Double.parseDouble(entrada);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
	
	/**
	 * Verifica si el String ingresado esta vacio
	 *
	 * @param entrada String a procesar
	 * @return boolean indicando si el String ingresado esta vacio
	 */
	public static boolean estaVacio(String entrada) {
		if (entrada.isBlank()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Verifica si el String ingresado esta vacio considerando que es un
	 * placeholder.
	 *
	 * @param entrada String a procesar
	 * @param placeholder Placeholder activo
	 * @return boolean indicando si el String ingresado esta vacio
	 */
	public static boolean estaVacio(String entrada, String placeholder) {
		if (entrada.isBlank() || entrada.equals(placeholder)) {
			return true;
		}
		return false;
	}

	/**
	 * Genera un identificador basado en un String ingresado
	 *
	 * @param stringIngresado String bajo el cual se creara el identificador
	 * @return String identificador compuesto de una letra y dos numeros
	 */
	public static String generarSku(String stringIngresado) {
		int numeroMaximo = 100;
		int numeroMinimo = 999;
		return "" + Character.toUpperCase(stringIngresado.charAt(0)) + valueOf((int) (Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo));
	}
}
