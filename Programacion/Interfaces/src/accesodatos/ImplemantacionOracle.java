package accesodatos;

public class ImplemantacionOracle implements IAccesoDatos {

    @Override
    public void eliminar(){
        System.out.println("Eliminar desde Oracle");
    }
    
    @Override
    public void insertar(){
        System.out.println("Insertar desde Oracle");
    }
    
    @Override
    public void actualizar(){
        System.out.println("Actualizar desde Oracle");
    }
    
    @Override
    public void listar(){
        System.out.println("Listar desde Oracle");
    }
    
}
