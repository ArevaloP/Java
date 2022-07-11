package paquete2;

public class TestClaseDafault {

    public static void main(String[] args) {
        ClaseDefault clase1 = new ClaseDefault();
        clase1.atributoDefault = "Valor cambiado desde la prueba";
        System.out.println("clase1 atributo = " + clase1.atributoDefault);
        clase1.metodoDefault();
        
    }
    
}
