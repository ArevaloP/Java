
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Jaison Arevalo", 1500000);
        
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente("Georffrey", 'M', 20, "Calle 3 #2-43", false, new Date());
        System.out.println("cliente1 = " + cliente1);
        
        Cliente cliente2 = new Cliente ("Julian", 'M', 21, "Carrera 2", false, new Date());
        System.out.println("cliente2 = " + cliente2);
    }
    
}
