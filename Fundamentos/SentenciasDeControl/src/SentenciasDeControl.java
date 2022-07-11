
public class SentenciasDeControl {

    public static void main(String args[]) {

        System.out.println("==== if (---){} else {} ====");
        var condicion = false;
        if (condicion) {
            System.out.println("Verdadero.");
        } else {
            System.out.println("Falso.");
        }

        //Pasar un numero del 1 al 4 a texto
        var numero = 9;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Uno.";
        } else if (numero == 2) {
            numeroTexto = "Dos.";
        } else if (numero == 3) {
            numeroTexto = "Tres.";
        } else if (numero == 4) {
            numeroTexto = "Cuatro.";
        } else {
            numeroTexto = "Numero no encontrado.";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
        //Calcula aproximado de la estacion del año dado el mes.
        
        var mes = 12;
        var estacion = "Estacion desconocida.";
        
        if ( mes == 1 || mes == 2 || mes == 12 ){
            estacion = "Invierno.";
        } else if ( mes == 3 || mes == 4 || mes == 5 ){
            estacion = "Primavera.";
        } else if ( mes == 6 || mes == 7 || mes == 8 ){
            estacion = "Verano.";
        } else if ( mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio.";
        }
        
        System.out.println("estacion = " + estacion);
        
        System.out.println("\n==== switch ====");
        // Ejercicio anterios de los numeros pero con switch
        
        var num = 2;
        var numText = "Numero desconocido.";
        
        switch(num){
            case 1:
                numText = "Uno.";
                break;
            case 2:
                numText = "Dos.";
                break;
            case 3:
                numText = "Tres.";
                break;
            case 4:
                numText = "Cuatro.";
                break;
            default:
                numText = "Caso no encontrado.";
        }
        
        System.out.println("numText = " + numText);
        
        //Ejercicio anterior de las estaciones pero con switch.
        
        var month = 8;
        var est = "Estacion desconocida.";
        
        switch (month){
            case 1: case 2: case 12:
                est = "Invierno.";
                break;
            case 3: case 4: case 5:
                est = "Primavera.";
                break;
            case 6: case 7: case 8:
                est = "Verano.";
                break;
            case 9: case 10: case 11:
                est = "Otonio";
                break;
        }
        
        System.out.println("estacion = " + est);

    }

}
