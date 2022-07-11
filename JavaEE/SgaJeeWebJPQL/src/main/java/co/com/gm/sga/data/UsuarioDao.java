package co.com.gm.sga.data;

import co.com.gm.sga.domain.Usuario;
import java.util.List;



public interface UsuarioDao {
    
    public List<Usuario> findAllUsurio();
    
    public Usuario findUsuarioById(Usuario usuario);
    
    public Usuario findUsuarioByUsername(Usuario usuario);
    
    public void insertUsuario(Usuario usuario);
    
    public void updateUsuario(Usuario usuario);
    
    public void deleteUsuario(Usuario usuario);
    
}
