package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        

        Set<String> miSet = new HashSet<>();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Oscar");
        miMapa.put("Valor3", "Franco");
        
        String elementoMapa = miMapa.get("Valor1");
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection<String> coleccion) {
//        forEch tradicional
//        for (String elememto: coleccion) {
//            System.out.println("elememto = " + elememto);
//        }


//        Funcion de la clase ArryList que permite iterar los elementos de la lista por medio de funcion flecha
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
