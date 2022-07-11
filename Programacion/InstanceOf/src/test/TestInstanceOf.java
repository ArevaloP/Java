package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Pedro", 2000);
        definirTipo(empleado);
        
        Gerente gerente1 = new Gerente("Juan", 3000, "Sistemas");
        definirTipo(gerente1);
        
    }
    
    public static void definirTipo(Empleado empleado){
        
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            //((Gerente) empleado).getDepartamento();
            
        } else if (empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
        
    }
    
}
