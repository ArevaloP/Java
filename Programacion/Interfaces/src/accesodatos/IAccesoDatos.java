package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void eliminar();
    
    void actualizar();
    
    void listar();
}
