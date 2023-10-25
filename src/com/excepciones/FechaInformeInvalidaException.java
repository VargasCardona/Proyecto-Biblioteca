package com.excepciones;

public class FechaInformeInvalidaException extends RuntimeException{

    public FechaInformeInvalidaException() {
        super("La fecha de finalización ocurre antes que la de inicio");
    }
    
}
