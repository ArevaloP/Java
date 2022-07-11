package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
//        imprimir(miLista);
        

        Set miSet = new HashSet();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map miMapa = new HashMap();
        
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Oscar");
        miMapa.put("Valor3", "Franco");
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection coleccion) {
//        forEch tradicional
//        for (Object elememto: coleccion) {
//            System.out.println("elememto = " + elememto);
//        }


//        Funcion de la clase ArryList que permite iterar los elementos de la lista por medio de funcion flecha
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
