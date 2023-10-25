package com.excepciones;

public class TipoInformeNoSeleccionadoException extends RuntimeException{

    public TipoInformeNoSeleccionadoException() {
        super("Seleccione un tipo de informe");
    }
    
}
