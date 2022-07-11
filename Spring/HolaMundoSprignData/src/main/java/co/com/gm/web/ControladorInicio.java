
package co.com.gm.web;

import co.com.gm.dao.PersonaDao;
import co.com.gm.domain.Persona;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaDao personaDao;
    
    
    
    @GetMapping("/")
    public String inicio(Model model){
        Iterable<Persona> personas = personaDao.findAll();
        model.addAttribute("personas", personas);
        log.info("Ejecutando el controlador Spring MVC");
        return "index";
    }
    
}
