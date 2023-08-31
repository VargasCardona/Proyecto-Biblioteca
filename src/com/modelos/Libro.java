package com.modelos;

public class Libro {

	private final String ISBN;
	private String titulo;
	private String autor;
	private String genero;
	private String anioPublicacion;
	private int unidadesDisponibles;

	public Libro(String ISBN, String titulo, String autor, String genero, String anioPublicacion, int unidadesDisponibles) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anioPublicacion = anioPublicacion;
		this.unidadesDisponibles = unidadesDisponibles;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	public String getISBN() {
		return ISBN;
	}
	
}
