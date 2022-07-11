package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsaurios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        Usuario usuarioNuevo = new Usuario(3, "Georffrey", "julian123");
        
//        int reg = usuarioDao.insertar(usuarioNuevo);
//        System.out.println("Se han insertado "+ reg + " Usuarios.");
        
          usuarioDao.actualizar(usuarioNuevo); 
        
        List<Usuario> usuarios = usuarioDao.seleccionar();
        
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
        
    }
    
}
