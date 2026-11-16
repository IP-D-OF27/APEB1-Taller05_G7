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
       if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 > 0)) {
            System.out.println("El anio " + anio + " es bisiesto.");
            System.out.println("Este anio tiene 366 dias");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese un anio: 
2024
El anio 2024 es bisiesto.
Este anio tiene 366 dias
BUILD SUCCESSFUL (total time: 3 seconds)
 */
