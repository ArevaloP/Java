
package com.gm.mundopc.test;

import com.gm.mundopc.*;


public class TestMundoPC {
    
    public static void main(String[] args) {
        Monitor monitorApple = new Monitor ("Apple", 15);
        Teclado tecladoApple = new Teclado ("USB", "Apple");
        Raton ratonApple = new Raton ("USB", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        
        Monitor monitorAsus = new Monitor("Asus", 20);
        Teclado tecladoAsus = new Teclado("bluetooth", "Asus");
        Raton ratonAsus = new Raton("bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonApple);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraApple);
        orden1.mostarOrden();
        
    }
    
}
