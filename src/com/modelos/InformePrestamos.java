package com.modelos;

public class InformePrestamos {
    
    public static String PRESTAMOS = "Prestamos";
    public static String DEVOLUCIONES = "Devoluciones";
    
    private String nombreUsuario;
    private String cedulaUsuario;
    private String tituloLibro;
    private String fecha;
    private String categoriaLibro;
    private String tipoInforme;

    public InformePrestamos(String nombreUsuario, String cedulaUsuario, String tituloLibro, String fecha, String categoriaLibro, String tipoInforme) {
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.tituloLibro = tituloLibro;
        this.fecha = fecha;
        this.categoriaLibro = categoriaLibro;
        this.tipoInforme = tipoInforme;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }
    
}
