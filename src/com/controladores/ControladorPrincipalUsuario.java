package com.controladores;

import com.daos.DaoGenero;
import com.daos.DaoLibro;
import com.daos.DaoPrestamo;
import com.daos.DaoUsuario;
import com.modelos.Genero;
import com.modelos.InformePrestamos;
import com.modelos.Libro;
import com.modelos.Prestamo;
import com.modelos.Usuario;
import com.utils.FormUtils;
import com.utils.GeneralUtils;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorPrincipalUsuario {

	private DaoUsuario daoUsuario;
	private DaoGenero daoGenero;
        private DaoLibro daoLibro;
	private DaoPrestamo daoPrestamo;

	public ControladorPrincipalUsuario() {
		this.daoUsuario = new DaoUsuario();
		this.daoGenero = new DaoGenero();
                this.daoLibro = new DaoLibro();
		this.daoPrestamo = new DaoPrestamo();
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
        
	public ArrayList<Libro> obtenerListaLibrosFiltro(String atributo, String entrada) {
                String clave = (GeneralUtils.estaVacio(entrada, "Filtrar por término"))
                        ? null
                        : entrada;
                String atributoTabla = null;
                switch (atributo) {
                        case "ISBN" -> atributoTabla = "l.isbn";
                        case "Título" -> atributoTabla = "l.titulo";
                        case "Autor" -> atributoTabla = "l.autor";
                        case "Género" -> atributoTabla = "g.nombre";
                        case "Año de publicación" -> atributoTabla = "l.anioPublicacion";
                }
                return daoLibro.obtenerListaLibrosFiltroAvanzado(atributoTabla, clave); 
	}
	
	public Libro consultarLibro(String idLibro){
		return daoLibro.consultarLibro(idLibro);
	}
	
	public DefaultTableModel obtenerListaPrestamos(String id) {
		return (GeneralUtils.estaVacio(id, "Filtrar por ID"))
                        ? daoPrestamo.obtenerTablaPrestamos()
                        : daoPrestamo.obtenerTablaPrestamos(id);
	}
	
	public Prestamo consultarPrestamo(String id){
		return daoPrestamo.consultarPrestamo(id);
	}
	
        public void generarInformeGeneral(String tipoInforme, String fechaInicio, String fechaFin) {
                ArrayList<InformePrestamos> lista = daoPrestamo.obtenerListaInforme(null, "2023-10-01", "2023-11-01", true);
                FormUtils.generarInformePrestamos(lista);
        }
}
