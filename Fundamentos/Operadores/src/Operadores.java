
public class Operadores {

    public static void main(String args[]) {

        //Operadores aritmeticos
        System.out.println("\n==== Operadores Aritmeticos ====");

        int a = 3, b = 2;

        var resultado = a + b;
        System.out.println("Resultado de la suma = " + resultado);

        resultado = a - b;
        System.out.println("Resultado de la resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado de la division entera = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado de la division flotante = " + resultado2);

        resultado = a % b;
        System.out.println("resultado de la modulacion = " + resultado);

        //Operadores de asignacion y de composicion = += -= *= /= %=
        System.out.println("\n==== Operadores de asigancion y de composicion ====");
        var c = a + 5 - b;
        System.out.println("c = " + c);

        a += 3;
        System.out.println("a = " + a);

        a -= 1;
        System.out.println("a = " + a);

        a *= 3;
        System.out.println("a = " + a);

        a /= 2;
        System.out.println("a = " + a);

        a %= 3;
        System.out.println("a = " + a);

        //Operadores unarios - para invertir signo, ! en boolean
        System.out.println("\n==== Operadores Unarios ====");

        var aNegado = -a;
        System.out.println("a = " + a);
        System.out.println("aNegado = " + aNegado);

        var bool = true;
        var boolInv = !bool;
        System.out.println("bool = " + bool);
        System.out.println("boolInv = " + boolInv);

        System.out.println("\n==== Operadores de incremento y decremento ====");
        // Incremento
        // 1. Preincremento
        System.out.println("-Incremento");
        var e = 5;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2. Postincremento
        var g = 6;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Drecremento
        //1. Predecremento
        System.out.println("\n-Decremento");
        var i = 6;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //2. Postdecremento
        var k = 9;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        System.out.println("\n==== Operadores de igualdad y relacionales ====");
        //Igualdad
        int n1 = 3, n2 = 2;
        var comp = (n1 == n2);
        System.out.println("comp = " + comp);

        comp = n1 != n2;
        System.out.println("comp = " + comp);

        var cadena = "Hola";
        var cadena2 = "Hola";

        var compCadena = cadena == cadena2;// No es correcto, compara es la referencia de objetos, ya que String es de tipo Object
        System.out.println("compCadena = " + compCadena);

        compCadena = cadena.equals(cadena2);// Forma correcta de comparar dos cadenas de caracteres.
        System.out.println("compCadena = " + compCadena);

        //Relacionales
        var rel = n1 > n2;
        System.out.println("\nrelacion mayor que = " + rel);

        rel = n1 < n2;
        System.out.println("relacion menor que = " + rel);

        rel = n1 >= n2;
        System.out.println("relacion mayor o igual que = " + rel);

        rel = n1 <= n2;
        System.out.println("relacion menor o igual que = " + rel);
        
        
        System.out.println("\n==== Operadores Condicionales ====");
        //Operadores condicionlaes && ||
        
        var num = 3;
        var min = 0;
        var max = 10;
        
        boolean res = num >= min && num <= max;
        
        System.out.println("El numero esta dentro del rango? " + res);
        
        var vacaciones = false;
        var diaDescanso = false;
        
        var libre = vacaciones || diaDescanso;
        if (libre){
            System.out.println("Se puede realizar la visita");
        }else{
            System.out.println("Ocupado");
        }
        
        System.out.println("\n==== Operador Ternario ====");
        // (Condicion) ? True : False
        var result = (3>2)?"Verdad":"Falso";
        System.out.println("result = " + result);
        
        var nume = 6;
        result = (nume % 2 == 0)? "Par" : "Impar";
        System.out.println("result = " + result);
        
        System.out.println("\n==== Precedencia de operadores ====");
        // Prioridad de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("z = " + z);
        
        z = 4 + 5 * 6 / 3;
        System.out.println("z = " + z);
        
        z = (4+5) * 6/3;
        System.out.println("z = " + z);
        
    }

}
