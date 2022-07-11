package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;



public class LoginAction extends ActionSupport{
    
    private Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
    
    public LoginAction(){
        
    }
    
    @Override
    public String execute(){
        log.info("El usuario es - " + this.usuario);
        log.info("El password es - " + this.password);
        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUser(){
        return getText("form.user");
    }
    
    public String getTitulo(){
        return getText("form.titulo");
    }
    
    public String getPasswordMensaje(){
        return getText("form.password");
    }
    
    public String getButtom(){
        return getText("form.buttom");
    }
    
    public String getValor(){
        return getText("form.valor");
    }
    
}
