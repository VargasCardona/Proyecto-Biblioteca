package com.controladores;

import com.daos.DaoGenero;
import com.daos.DaoLibro;
import com.daos.DaoUsuario;
import com.modelos.Genero;
import com.modelos.Libro;
import com.modelos.Usuario;
import java.util.ArrayList;

public class ControladorPrincipalUsuario extends ControladorBase{

	private DaoUsuario daoUsuario;
	private DaoGenero daoGenero;
        private DaoLibro daoLibro;

	public ControladorPrincipalUsuario() {
		this.daoUsuario = new DaoUsuario();
		this.daoGenero = new DaoGenero();
                this.daoLibro = new DaoLibro();
	}
	
	public ArrayList<Usuario> obtenerListaUsuarios() {
		return daoUsuario.obtenerListaUsuarios();
	}

	public ArrayList<Usuario> buscarCoincidencias(String where) {
		return daoUsuario.buscarCoincidencias(where);
	}
	
	public Usuario consultarUsuario(String argumento, boolean esConsultaCedula){
		return daoUsuario.consultarUsuario(argumento, esConsultaCedula);
	}
	
	public ArrayList<Genero> obtenerListaGeneros() {
		return daoGenero.obtenerListaGeneros();
	}
	
	public Genero consultarGenero(String idGenero){
		return daoGenero.consultarGenero(idGenero);
	}
        
	public ArrayList<Libro> obtenerListaLibros(String isbn, String idGenero) {
                return daoLibro.obtenerListaLibrosFiltro(isbn, idGenero); 
	}
	
	public Libro consultarLibro(String idLibro){
		return daoLibro.consultarLibro(idLibro);
	}
	
}
