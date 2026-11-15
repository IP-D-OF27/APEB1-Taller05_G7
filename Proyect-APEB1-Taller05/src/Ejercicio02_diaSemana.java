import java.util.Scanner;
/**
 * Ejercicio 02: "Mostrar el nombre del día de la semana en función del número 
 * ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Leandro, Jeremy
 * @version 1.0
 */
public class Ejercicio02_diaSemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreDia;
        System.out.println("Ingrese un numero del 1 al 7: ");
        int numero = tcl.nextInt();
        switch (numero) {
            case 1 -> nombreDia = ("Lunes");
            case 2 -> nombreDia = ("Martes");
            case 3 -> nombreDia = ("Miercoles");
            case 4 -> nombreDia = ("Jueves");
            case 5 -> nombreDia = ("Viernes");
            case 6 -> nombreDia = ("Sabado");
            case 7 -> nombreDia = ("Domingo");
            default -> nombreDia = "error";
        }
        System.out.println("El dia de la semana es: " + nombreDia);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese un numero del 1 al 7: 
6
El dia de la semana es: Sabado
BUILD SUCCESSFUL (total time: 8 seconds)

 */