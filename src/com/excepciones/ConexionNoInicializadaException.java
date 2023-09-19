package com.excepciones;

/**
 *
 * @author Mateo
 */
public class ConexionNoInicializadaException extends RuntimeException {

    public ConexionNoInicializadaException() {
        super("No se pudo realizar la conexión");
    }
    
}
