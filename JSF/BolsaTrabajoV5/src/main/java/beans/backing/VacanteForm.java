
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.*;
import org.apache.logging.log4j.*;

@Named
@RequestScoped
public class VacanteForm {
    
    @Inject
    private Candidato candidato;
    
    Logger log = LogManager.getRootLogger();
    
    public VacanteForm(){
        log.info("Creando el objeto vacanteForm");
    }
    
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("Juan")){
            
            if(this.candidato.getApellido().equals("Perez")){
                String msg = "Lo sentimos pero el empleado Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }
            
            log.info("Entrando al caso de exito.");
            return "exito";
        }else{
            log.info("Entrando al caso de fallo.");
            return "fallo";
        }
    }
    
    public void codigoPostalListner(ValueChangeEvent valueChangeEvent){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        
        //Recuperamos el valor del codigo postal nuevo
        String nuevoCodigoPostal = (String) valueChangeEvent.getNewValue();
        
        if("03810".equals(nuevoCodigoPostal.trim())){
            UIInput coloniaInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:colonia");
            String nuevacolonia = "Napoles";
            coloniaInputText.setValue(nuevacolonia);
            coloniaInputText.setSubmittedValue(nuevacolonia);
            
            UIInput ciudadInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:ciudad");
            String nuevaCiudad = "Ciudad de Mexico";
            ciudadInputText.setValue(nuevaCiudad);
            ciudadInputText.setSubmittedValue(nuevaCiudad);
            
            facesContext.renderResponse();
            
        }
    }
    
}