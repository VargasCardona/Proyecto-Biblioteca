package com.modelos;

public class InformeRegistros {
    
    public static final String INFORME_GENERAL = "General";
    
    private String nombreUsuario;
    private String cedulaUsuario;
    private String detalles;
    private String fechaRealizacion;

    public InformeRegistros(String nombreUsuario, String cedulaUsuario, String detalles, String fechaRealizacion) {
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.detalles = detalles;
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }
    
}
