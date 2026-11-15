import java.util.Scanner;
/**
 * Ejercicio 07: Asignar una letra (A, B, C, D) a una calificación en función de
 * su rango (A para 90-100, B para 80-89, etc.) .
 *
 * @author Jeremy, Leandro
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota;
        char letra = 0;
        System.out.println("Ingrese la calificacion: ");
        nota = tcl.nextDouble();
        if (nota >= 90 && nota <= 100) {
            letra = 'A';
        } else if (nota >= 80 && nota <= 89) {
            letra = 'B';
        } else if (nota >= 70 && nota <= 79) {
            letra = 'C';
        } else if (nota >= 0 && nota <= 69) {
            letra = 'D';
        } else {
            System.out.println("Nota no valida");
            return;
        }      
        System.out.println("La letra correspondiente es: " + letra);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN: 
 * Ingrese la calificacion: 
50
La letra correspondiente es: D
BUILD SUCCESSFUL (total time: 4 seconds)
 */
