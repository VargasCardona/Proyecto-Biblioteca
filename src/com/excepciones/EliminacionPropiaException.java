package com.excepciones;

public class EliminacionPropiaException extends RuntimeException{

    public EliminacionPropiaException() {
        super("No puede eliminarse a sí mismo");
    }
    
}
