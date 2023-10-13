package com.controladores;

import com.daos.DaoLibro;
import com.excepciones.AnioInvalidoException;
import com.excepciones.CamposVaciosException;
import com.excepciones.EntradasNumericasInvalidasException;
import com.modelos.Libro;
import com.utils.GeneralUtils;

public class ControladorGestionLibro {

	private DaoLibro daoLibro;

	public ControladorGestionLibro() {
		this.daoLibro = new DaoLibro();
	}

	public void actualizarLibro(String titulo, String autor, String idGenero, String anioPublicacion, String unidadesDisponibles, String isbn) {
		if (GeneralUtils.estaVacio(titulo, "Título")
				|| GeneralUtils.estaVacio(autor, "Autor")
				|| GeneralUtils.estaVacio(idGenero, "Seleccione")
				|| GeneralUtils.estaVacio(anioPublicacion, "Año de Publicación")
				|| GeneralUtils.estaVacio(unidadesDisponibles, "Unidades")) {
			throw new CamposVaciosException();
		}

		if (GeneralUtils.validarEntero(unidadesDisponibles)
				|| GeneralUtils.validarEntero(anioPublicacion)
				|| Integer.valueOf(unidadesDisponibles) < 0 ) {
			throw new EntradasNumericasInvalidasException();
		}

		if (Integer.valueOf(anioPublicacion) < 0 || Integer.valueOf(anioPublicacion) > 9999) {
			throw new AnioInvalidoException();
		}

		daoLibro.actualizar(new Libro(isbn, titulo, autor, idGenero, anioPublicacion, Integer.parseInt(unidadesDisponibles)));
	}

	public void eliminarLibro(String isbn) {
		daoLibro.eliminar(isbn);
	}
}
