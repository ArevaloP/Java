package aritmetica;

import excepciones.OpeacionRuntimeException;

public class AritmeticaRuntimeException {
    public static int divisionRuntime(int numerador, int denominador){
        
        if (denominador == 0){
            throw new OpeacionRuntimeException("Division por cero");
        }
        
        return numerador/denominador;
        
    }
}
