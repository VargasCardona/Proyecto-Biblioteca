package com.utils;

import com.excepciones.CamposVaciosException;
import static java.lang.String.valueOf;
import java.text.SimpleDateFormat;
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
		String[] fechaSplit = fechaString.split("-");
		
		if (fechaSplit[0].equals("DD")
				|| fechaSplit[1].equals("MM")
				|| fechaSplit[2].equals("AAAA")) {
			throw new CamposVaciosException();
		}

		fechaRetorno.set(Calendar.YEAR, Integer.parseInt(fechaSplit[0]));
		fechaRetorno.set(Calendar.MONTH, Integer.parseInt(fechaSplit[1]));
		fechaRetorno.add(Calendar.MONTH, -1);
		fechaRetorno.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fechaSplit[2]));

		return fechaRetorno;
	}

	/**
	 * Convierte un objeto tipo Calendar en un string con su fecha
	 *
	 * @param fechaIngresada Calendar a convertir
         * @param tieneHora Especifica si el formato debe añadir la hora
	 * @return String con formato "yyyy-MM-dd" o "dd-MM-yyyy h.mm.ss"
	 */
	public static String convertirFechaString(Calendar fechaIngresada, boolean tieneHora) {
                String pattern = (tieneHora) ? "dd-MM-yyyy HH:mm:ss" : "yyyy-MM-dd";
                final SimpleDateFormat FORMATO = new SimpleDateFormat(pattern);
                return FORMATO.format(fechaIngresada.getTime());
	}
        
        /**
	 * Ajusta cadena a formato "yyyy-MM-dd"
	 *
	 * @param fechaIngresada Cadena a cambiar
	 * @return String con formato "yyyy-MM-dd"
	 */
        public static String formatearFechaString(String fechaIngresada) {
                String[] fecha = fechaIngresada.split("-");
                fecha[1] = formatearDatoFecha(fecha[1]);
                fecha[2] = formatearDatoFecha(fecha[2]);
                return fecha[0] + "-" + fecha[1] + "-" + fecha[2];
        }
        
        private static String formatearDatoFecha(String dato) {
                String adicion = "";
                if (Integer.parseInt(dato) < 10 && dato.charAt(0) != '0') {
                        adicion = "0";
                }
                return adicion + dato;
        }
}
