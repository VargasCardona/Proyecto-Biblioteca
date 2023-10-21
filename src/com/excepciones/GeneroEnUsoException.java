package com.excepciones;

public class GeneroEnUsoException extends RuntimeException{

    public GeneroEnUsoException() {
        super("El género aún se encuentra asociado a un libro");
    }
    
}
