
package co.com.gm.web;

import co.com.gm.domain.Persona;
import co.com.gm.service.PersonaService;
import java.util.*;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;
    
    
    
    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        List<Persona> personas = personaService.listarPersonas();  
        
        Double saldoTotal = 0D;
        
        for(Persona persona: personas){
            saldoTotal += persona.getSaldo();
        }
        model.addAttribute("saldoTotal", saldoTotal);
        model.addAttribute("totalClientes", personas.size());
        model.addAttribute("personas", personas);
        log.info("Usuario que ha hecho login: " + user);
        log.info("Ejecutando el controlador Spring MVC");
        return "index";
    }
    
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errors){
        
        
        if(errors.hasErrors()){
            return "modificar";
        }
        
        personaService.guardarPersona(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        persona = personaService.econtarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminarPersona(persona);
        return "redirect:/";
    }
    
}
