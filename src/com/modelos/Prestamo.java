package com.modelos;

import java.util.Calendar;

public class Prestamo {

	private String id;
	private String isbnLibro;
	private String cedulaUsuario;
	private Calendar fechaPrestamo;
	private Calendar fechaVencimiento;
	private Calendar fechaRetorno;
	private boolean estaActivo;

	public Prestamo(String id, String isbnLibro, String cedulaUsuario, Calendar fechaPrestamo, Calendar fechaVencimiento) {
		this.id = id;
		this.isbnLibro = isbnLibro;
		this.cedulaUsuario = cedulaUsuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaVencimiento = fechaVencimiento;
		this.estaActivo = true;
	}

	public Prestamo(String id, String isbnLibro, String cedulaUsuario, Calendar fechaPrestamo, Calendar fechaVencimiento, Calendar fechaRetorno, boolean estaActivo) {
		this.id = id;
		this.isbnLibro = isbnLibro;
		this.cedulaUsuario = cedulaUsuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaRetorno = fechaRetorno;
		this.estaActivo = estaActivo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsbnLibro() {
		return isbnLibro;
	}

	public void setIsbnLibro(String isbnLibro) {
		this.isbnLibro = isbnLibro;
	}

	public String getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(String cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public Calendar getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Calendar fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Calendar getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Calendar fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Calendar getFechaRetorno() {
		return fechaRetorno;
	}

	public void setFechaRetorno(Calendar fechaRetorno) {
		this.fechaRetorno = fechaRetorno;
	}

	public boolean isEstaActivo() {
		return estaActivo;
	}

	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}

}
