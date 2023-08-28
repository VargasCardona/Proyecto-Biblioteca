package com.excepciones;

/**
 *
 * @author Mateo
 */
public class EliminacionPropiaException extends RuntimeException{

    public EliminacionPropiaException() {
        super("No puede eliminarse a sí mismo");
    }
    
}
