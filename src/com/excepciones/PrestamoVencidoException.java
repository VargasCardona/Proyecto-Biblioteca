package com.excepciones;

/**
 *
 * @author Mateo
 */
public class PrestamoVencidoException extends RuntimeException{

    public PrestamoVencidoException(String isbn) {
        super("Préstamo vencido para el libro con isbn: "+isbn);
    }
    
}
