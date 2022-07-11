package beans;

import org.apache.logging.log4j.*;


public class HolaMundoAction {
    
    private Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    private String saludosAtr;

    public String execute(){
        log.info("Ejecutando metodo execute desde Struts2");
        this.saludosAtr = "Adios desde Struts2";
        return "exito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
     
     
    
}
