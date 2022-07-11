package beans;

import javax.ejb.*;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumerImpl implements ServicioSumarWS{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
}
