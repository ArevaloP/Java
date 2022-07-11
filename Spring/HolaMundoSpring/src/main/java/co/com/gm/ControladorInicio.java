
package co.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador REST");
        log.debug("Mensaje desde el Controlador");
        return "Hola Mundo Con Spring Boot";
    }
    
}
