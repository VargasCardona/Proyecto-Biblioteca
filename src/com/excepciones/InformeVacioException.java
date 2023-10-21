package com.excepciones;

public class InformeVacioException extends RuntimeException{

    public InformeVacioException() {
        super("El informe no arrojó resultados");
    }
    
}
