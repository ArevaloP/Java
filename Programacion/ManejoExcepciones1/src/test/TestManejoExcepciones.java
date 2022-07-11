package test;

import static aritmetica.Aritmetica.division;
import static aritmetica.AritmeticaRuntimeException.divisionRuntime;
import excepciones.OperacionExcepcion;

public class TestManejoExcepciones {
    
    public static void main(String[] args) {
        
        int resultado = 0;
        System.out.println("Exception");
        try{
            resultado = division(10,0);
            
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un erro de tipo OperacionExcepcion: ");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrió un error de tipo Exception: ");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
            
        }
        finally{
            System.out.println("Se ha revisado la division");
        }
        
        System.out.println("resultado = " + resultado);
        
        
        //Con RuntimeException no es necesario encapsular la excepcion en un try{}catch(){}
//        System.out.println("\nRuntimeException");
//        
//        resultado = divisionRuntime(10,0);
//        
//        System.out.println("resultado = " + resultado);
        
    }
    
}
