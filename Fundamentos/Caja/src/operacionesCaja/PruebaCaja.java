
package operacionesCaja;

public class PruebaCaja {
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
        caja1.alto = 12.3;
        caja1.ancho = 13;
        caja1.profundo = 9;
        double volumenCaja = caja1.calcularVolumen();
        System.out.println("volumenCaja = " + volumenCaja);
        
        Caja caja2 = new Caja(14.5 , 7 , 9.6);
        volumenCaja = caja2.calcularVolumen();
        System.out.println("volumenCaja = " + volumenCaja);
        
        
    }
}
