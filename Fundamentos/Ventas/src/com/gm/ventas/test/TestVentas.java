
package com.gm.ventas.test;

import com.gm.ventas.*;


public class TestVentas {
    
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Chaqueta", 130.00);
        
        Orden orden1 = new Orden();
        orden1.agrgarProducto(producto1);
        orden1.agrgarProducto(producto2);
        orden1.mostrarOrden();
        
        System.out.println("\n");
        
        Orden orden2 = new Orden();
        orden2.agrgarProducto(producto1);
        orden2.agrgarProducto(producto3);
        orden2.agrgarProducto(producto2);
        orden2.mostrarOrden();
    }
    
}
