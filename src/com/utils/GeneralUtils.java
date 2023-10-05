package com.utils;

import com.excepciones.CamposVaciosException;
import static java.lang.String.valueOf;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GeneralUtils {

	/**
	 * Verifica si el String ingresado no es un entero.
	 *
	 * @param entrada String a procesar
	 * @return boolean indicando si el String ingresado no es un entero longs
	 * @throws NumberFormatException {@inheritDoc}
	 */
	public static boolean validarEntero(String entrada) {
		Integer aux;
		try {
			aux = Integer.parseInt(entrada);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	/**
	 * Verifica si el String ingresado no es un double.
	 *
	 * @param entrada String a procesar
	 * @return boolean indicando si el String ingresado no es un double longs
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

	/**
	 * Convierte un objeto tipo String en un objeto tipo Calendar
	 *
	 * @param fechaString Fecha a convertir en Calendar
	 * @return Objeto tipo Calendar
	 */
	public static Calendar convertirStringFecha(String fechaString) {
		Calendar fechaRetorno = new GregorianCalendar();
		String[] fechaSplit = fechaString.split("/");
		
		if (fechaSplit[0].equals("DD")
				|| fechaSplit[1].equals("MM")
				|| fechaSplit[2].equals("AAAA")) {
			throw new CamposVaciosException();
		}

		fechaRetorno.set(Calendar.YEAR, Integer.parseInt(fechaSplit[2]));
		fechaRetorno.set(Calendar.MONTH, Integer.parseInt(fechaSplit[1]));
		fechaRetorno.add(Calendar.MONTH, -1);
		fechaRetorno.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fechaSplit[0]));

		return fechaRetorno;
	}

	/**
	 * Convierte un objeto tipo Calendar en un string con su fecha
	 *
	 * @param fechaIngresada Calendar a convertir
	 * @return String con formato "dd/mm/yyyy"
	 */
	public static String convertirFechaString(Calendar fechaIngresada) {
		return fechaIngresada.get(Calendar.DAY_OF_MONTH) + "/"
				+ (fechaIngresada.get(Calendar.MONTH) + 1) + "/"
				+ fechaIngresada.get(Calendar.YEAR);
	}
}
