package test;

import accesodatos.*;

public class TestIntrfaces {
    
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.actualizar();
        imprimir(datos);
        
        
        datos = new ImplemantacionOracle();
        datos.actualizar();
        imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.actualizar();
    }
    
}
