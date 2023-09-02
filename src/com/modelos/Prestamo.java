package com.modelos;

import java.util.Calendar;

public class Prestamo {

	public static final String ACTIVO = "Activo";
	public static final String INACTIVO = "Inactivo";

	private String estado;
	private String cedulaUsuarioResponsable;
	private String[] arregloIdLibros;
	private Calendar fechaDePrestamo;
	private Calendar fechaVencimiento;

	public Prestamo(String cedulaUsuarioResponsable, String[] arregloIdLibros, Calendar fechaDePrestamo, Calendar fechaVencimiento) {
		this.estado = ACTIVO;
		this.cedulaUsuarioResponsable = cedulaUsuarioResponsable;
		this.arregloIdLibros = arregloIdLibros;
		this.fechaDePrestamo = fechaDePrestamo;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getEstado() {
		return estado;
	}

	public String getCedulaUsuarioResponsable() {
		return cedulaUsuarioResponsable;
	}

	public String[] getArregloIdLibros() {
		return arregloIdLibros;
	}

	public Calendar getFechaDePrestamo() {
		return fechaDePrestamo;
	}

	public Calendar getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
