
package co.com.gm.web;

import co.com.gm.domain.Persona;
import co.com.gm.service.PersonaService;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;
    
    
    
    @GetMapping("/")
    public String inicio(Model model){
        List<Persona> personas = personaService.listarPersonas();   
        model.addAttribute("personas", personas);
        log.info("Ejecutando el controlador Spring MVC");
        return "index";
    }
    
}
