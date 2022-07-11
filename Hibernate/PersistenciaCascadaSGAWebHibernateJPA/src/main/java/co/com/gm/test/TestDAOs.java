package co.com.gm.test;

import co.com.gm.dao.*;
import java.util.*;

public class TestDAOs {
    
    public static void main(String[] args) {
        AlumnoDao alumnoDao = new AlumnoDao();
        System.out.println("Alumnos");
        imprimir(alumnoDao.listar());
        
        
        DomicilioDao domicilioDao = new DomicilioDao();
        System.out.println("Domicilio");
        imprimir(domicilioDao.listar());
        
        ContactoDao contactoDao = new ContactoDao();
        System.out.println("Contactos");
        imprimir(contactoDao.listar());
        
        CursoDao cursoDao = new CursoDao();
        System.out.println("Cursos");
        imprimir(cursoDao.listar());
        
        AsignacionDao asignacionDao = new AsignacionDao();
        System.out.println("Asignaciones");
        imprimir(asignacionDao.listar());
    }
    
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("Valor = " + o);
        }
    }
    
}
