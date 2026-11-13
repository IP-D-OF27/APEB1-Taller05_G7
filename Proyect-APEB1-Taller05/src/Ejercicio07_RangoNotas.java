import java.util.Scanner;
/**
 * Ejercicio 07: Asignar una letra (A, B, C, D) a una calificación en función
 * de su rango (A para 90-100, B para 80-89, etc.) .
 * @author Jeremy, Leandro
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota;
        char letra;
        System.out.println("Ingrese la calificacion: ");
        nota = tcl.nextDouble();
        if (nota >= 90 && nota <= 100) {
            letra = 'A';
        } else if (nota >= 80) {
            letra = 'B';
        } else if (nota >= 70) {
            letra = 'C';
        } else {
            letra = 'D';
        }
        System.out.println("La letra correspondiente es: " + letra);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese la calificacion: 
89
La letra correspondiente es: B
 * Pegue aquí la evidencia de la ejecución del .java
 */
