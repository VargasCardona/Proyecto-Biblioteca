package com.modelos;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String cedula;
	private String usuario;
	private String contrasenia;

	public Usuario(String nombre, String apellidos, String cedula, String rolAsignado, String usuario, String contrasenia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

}
