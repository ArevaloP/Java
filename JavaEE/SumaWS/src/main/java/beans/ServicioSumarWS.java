package beans;

import javax.jws.*;

@WebService
public interface ServicioSumarWS {
    
    @WebMethod
    public int sumar(int a, int b);
    
}
