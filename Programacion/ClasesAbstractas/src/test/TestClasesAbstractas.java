package test;

import domain.*;

public class TestClasesAbstractas {
    
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica("Rectangulo"); las clases abstract no pueden ser instanciadas
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
        
    }
    
}
