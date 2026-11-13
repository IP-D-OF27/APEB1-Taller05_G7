/**
 * Ejercicio 05: "Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial."
 * @author Jeremy, Leandro
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio05_AnioBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un anio: ");
        int anio = tcl.nextInt();
        if (anio % 400 == 0) {
            System.out.println("El anio" + anio + " es bisiesto.");
        } else if (anio % 100 == 0) {
            System.out.println("El anio " + anio + " no es bisiesto.");
        } else if (anio % 4 == 0) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese un anio: 
2028
El anio 2028 es bisiesto.
BUILD SUCCESSFUL (total time: 1 minute 8 seconds)
 */
