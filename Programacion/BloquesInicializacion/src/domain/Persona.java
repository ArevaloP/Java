package domain;

public class Persona {
    
    public final int idPersona;
    public static int contadorPersona;
    
    static{
        
        System.out.println("Ejecucion del bloque estatico...");
        ++Persona.contadorPersona;
        
    }
    
    {
        System.out.println("Ejecucion del bloque no estatico...");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor...");
    }
    
    public int getPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
