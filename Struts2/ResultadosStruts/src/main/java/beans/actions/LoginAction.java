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
        if("admin".equals(this.usuario)){
            return SUCCESS;
        }else{
            return INPUT;
        }
        
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
    
    
    
}
