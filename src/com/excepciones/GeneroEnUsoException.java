package com.excepciones;

/**
 *
 * @author Mateo
 */
public class GeneroEnUsoException extends RuntimeException{

    public GeneroEnUsoException() {
        super("El género aún se encuentra asociado a un libro");
    }
    
}
