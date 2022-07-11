package test;

import enumeracion.*;

public class TestEnumeraciones {

    public static void main(String[] args) {
        System.out.println("dia = " + Dias.LUNES);

        indicarDiaSemana(Dias.LUNES);

        System.out.println("Continente no 1: " + Continentes.AMERICA);
        System.out.println("No de paises en el 1er continente: " + Continentes.AMERICA.getPaises());

        System.out.println("Continente no 5: " + Continentes.OCEANIA);
        System.out.println("No de paises en el 5to continente: " + Continentes.OCEANIA.getPaises());

    }

    private static void indicarDiaSemana(Dias dia) {

        switch (dia) {
            case LUNES:
                System.out.println("Primer dia de la semana. ");
                break;

            case MARTES:
                System.out.println("Segundo dia de la semana. ");
                break;

            case MIERCOLES:
                System.out.println("Tercer dia de la semana. ");
                break;

            case JUEVES:
                System.out.println("Cuarto dia de la semana. ");
                break;

            case VIERNES:
                System.out.println("Quinto dia de la semana. ");
                break;

            case SABADO:
                System.out.println("Sexto dia de la semana. ");
                break;

            case DOMINGO:
                System.out.println("Septimo dia de la semana. ");
                break;

            default:
                System.out.println("Dia no especificado correctamente. ");
                break;
        }

    }

}
