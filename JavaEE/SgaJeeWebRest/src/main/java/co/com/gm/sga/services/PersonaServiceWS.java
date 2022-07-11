
package co.com.gm.sga.services;

import co.com.gm.sga.domain.Persona;
import java.util.List;
import javax.jws.*;

@WebService
public interface PersonaServiceWS {
    
    @WebMethod
    public List<Persona> listarPersonas();
    
}
