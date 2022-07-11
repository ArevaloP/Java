package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {
    
    public AccesoDatosImpl(){}

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        
        File archivo = new File(nombreRecurso);
        return archivo.exists();
        
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        
        List<Pelicula> peliculas = new ArrayList<>();
        
        File archivo = new File(nombreRecurso);
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            while(linea != null){
                peliculas.add(new Pelicula(linea));
                linea = entrada.readLine();
            }
            entrada.close();
            
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion en la lectura de peliculas: " + ex.getMessage());
        }catch(IOException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx ("Excepcion en la lectura de peliculas: " + ex.getMessage());
        }
        
        return peliculas;
        
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        
        File archivo = new File(nombreRecurso);
        
        try{
            PrintWriter salida = new PrintWriter( new FileWriter(archivo, anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha escrito la pelicula "+ pelicula.getNombre() + " en el archivo.");
        }catch (IOException ex){
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir la plicula en el archivo: " + ex.getMessage());
        } 
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        
        File archivo = new File (nombreRecurso);
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            int indice = 1;
            while(linea != null){
                if(buscar != null && linea.equalsIgnoreCase(buscar)){
                    return "Pelicula " + buscar + " encontrada en la linea " + indice;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar la pelicula: " + ex.getMessage());
        }catch(IOException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar la pelicula: " + ex.getMessage());
        }
        return "Pelicula no encontrada.";
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        
        File archivo = new File(nombreRecurso);
        
        try{
            PrintWriter salida = new PrintWriter( new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo.");
        }catch(IOException ex){
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear el archivo: " +  ex.getMessage());
        }
        
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        
        if(archivo.exists()){
            archivo.delete();
        }
        
        System.out.println("Se ha eliminado el archivo.");
        
    }
    
    
    
}
