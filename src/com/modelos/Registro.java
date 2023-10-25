package com.modelos;

import java.util.Calendar;

public class Registro {
    
    private int id;
    private String cedulaUsuario;
    private String detalles;
    private Calendar fechaRealizacion;

    public Registro(int id, String cedulaUsuario, String detalles, Calendar fechaRealizacion) {
        this.id = id;
        this.cedulaUsuario = cedulaUsuario;
        this.detalles = detalles;
        this.fechaRealizacion = fechaRealizacion;
    }
    
    public Registro(int id, String cedulaUsuario, String detalles) {
        this.id = id;
        this.cedulaUsuario = cedulaUsuario;
        this.detalles = detalles;
        this.fechaRealizacion = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Calendar getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Calendar fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    
}
