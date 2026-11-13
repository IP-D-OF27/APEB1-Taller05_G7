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
        System.out.println("Ingrese un numero del 1 al 7: ");
        int numero = tcl.nextInt();
        String diaSemana = null;
        switch (numero) {
            case 1:
                diaSemana = ("Lunes");
                break;
            case 2:
                diaSemana = ("Martes");
                break;
            case 3:
                diaSemana = ("Miércoles");
                break;
            case 4:
                diaSemana = ("Jueves");
                break;
            case 5:
                diaSemana = ("Viernes");
                break;
            case 6:
                diaSemana = ("Sábado");
                break;
            case 7:
                diaSemana = ("Domingo");
                break;
            default:
                System.out.println("Número inválido. Debe ser del 1 al 7.");
        }
        tcl.close();
        System.out.println("El dia se la semana es: " + diaSemana);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese un numero del 1 al 7: 
1
El dia se la semana es: Lunes
BUILD SUCCESSFUL (total time: 10 seconds)
 */