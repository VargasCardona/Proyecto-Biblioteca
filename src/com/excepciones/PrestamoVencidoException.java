package com.excepciones;

public class PrestamoVencidoException extends RuntimeException{

    public PrestamoVencidoException(String id) {
        super("Préstamo vencido. Id: "+id);
    }
    
}
