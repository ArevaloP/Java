package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.*;

public class CatalogoPeliculasPresentacion {
    
    public static void main(String[] args) {
        int opcion = -1;
        
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        Scanner scanner = new Scanner(System.in);
        
        while(opcion != 0){
            System.out.println("Elige una opcion: \n" + 
                                "1. Iniciar Catalogo. \n"
                                + "2. Agregar pelicula. \n"
                                + "3. Listar peliculas. \n"
                                + "4. Buscar pelicula. \n"
                                + "0. Salir.");
            
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                
                case 2: 
                    System.out.println("Ingrese el nombre de la pelicula a agregar: ");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;

                case 3: 
                    catalogo.listarPeliculas();
                    break;
                    
                case 4:
                    System.out.println("Ingrese el nombre de la pelicula a buscar: ");
                    String buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                    
                case 0:
                    System.out.println("No vemos!");
                    break;
                    
                default:
                    System.out.println("Opcion no reconocida...");
                    break;
            }
            
        }
    }
    
}
