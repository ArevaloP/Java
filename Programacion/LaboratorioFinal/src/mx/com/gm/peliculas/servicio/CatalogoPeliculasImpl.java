package mx.com.gm.peliculas.servicio;

import java.util.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;
    
    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try{
            boolean anexar = this.datos.existe(NOMBRE_RECURSO);
            this.datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        }catch(AccesoDatosEx ex){
            System.out.println("Error al agregar pelicula: " + ex.getMessage());
        } 
    }

    @Override
    public void listarPeliculas() {
        
        try{
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            peliculas.forEach(pelicula -> {
                System.out.println("pelicula: " + pelicula.getNombre());
            });
        }catch (AccesoDatosEx ex){
            System.out.println("Error al listar las peliculas: " + ex.getMessage());
        }
        
    }

    @Override
    public void buscarPelicula(String buscar) {
        
        try{
            System.out.println("Resultado: " + this.datos.buscar(NOMBRE_RECURSO, buscar));
        }catch(AccesoDatosEx ex){
            System.out.println("Error al buscar la pelicula: " + ex.getMessage());
        }
        
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            }else{
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar el catalogo: " + ex.getMessage());
        }
        
    }
    
    
    
}
