
package tes;


public class TestArreglos {
    
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10; 
        System.out.println("edades 0= " + edades[0]);
        
        edades[1] = 20;
        System.out.println("edades 1= " + edades[1]);
        
        edades[2] = 30;
        System.out.println("edades 2= " + edades[2]);
        
        for (int i = 0; i<edades.length; i++){
            System.out.println("edades elemetno " + i + ": "+ edades[i]);
        }
        
    }
    
}
