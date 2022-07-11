package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamamdo al EJB desde el cliente\n");
        
        try{
            Context jdni = new InitialContext();
            HolaMundoEjbRemote holaMundoEjb = (HolaMundoEjbRemote) jdni.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjb.sumar(2, 3);
            System.out.println("Resultado de la suma 2 + 3: " + resultado);
        }catch(NamingException e){
            e.printStackTrace(System.out);
        }
        
    }
}
