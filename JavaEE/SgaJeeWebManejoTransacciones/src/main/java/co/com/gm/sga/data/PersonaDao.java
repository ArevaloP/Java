/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.gm.sga.data;

import co.com.gm.sga.domain.Persona;
import java.util.List;

/**
 *
 * @author Georffrey
 */
public interface PersonaDao {
    
    public List<Persona> findAllPersona();
    
    public Persona findPersonaById(Persona persona);
    
   public Persona findPersonaByEmai(Persona persona);
   
   public void insertPersona(Persona persona);
   
   public void upadatePersona(Persona persona);
   
   public void deletePersona(Persona persona);
    
}
