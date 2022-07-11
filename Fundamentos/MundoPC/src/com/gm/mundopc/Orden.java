
package com.gm.mundopc;


public class Orden {
    
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if( this.contadorComputadoras < Orden.MAX_COMPUTADORAS ){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha pasado el limite de computadoras en la orden. " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostarOrden(){
        System.out.println("Orden: #" + this.idOrden);
        System.out.println("Computadoras:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("\t"+this.computadoras[i]);
        }
        System.out.println("\tTotal de computadoras: " + this.contadorComputadoras);
        
    }
    
}
