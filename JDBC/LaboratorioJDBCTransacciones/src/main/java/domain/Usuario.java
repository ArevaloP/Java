package domain;

public class Usuario {

    private int idUsuario;
    private String user;
    private String password;
    
    public Usuario(){
        
    }
    
    public Usuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    
    public Usuario(String user, String password){
        this.user = user;
        this.password = password;
    }
    
    public Usuario(int idUsuario, String user, String password){
        this.idUsuario = idUsuario;
        this.user = user;
        this.password = password;
    }
    
    public int getIdUsuario(){
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", user=").append(user);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
