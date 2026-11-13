import java.util.Scanner;
/**
 * Ejercicio 09: Dados tres números, ordenarlos en orden ascendente
 * @author Jeremy, Leandro
 * @version 1.0
 */
public class Ejercicio09_Orden3numeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primer numero:");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero:");
        num3 = tcl.nextInt();
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Es: " + num1 + ", " + num2 + ", " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println("Es: " + num1 + ", " + num3 + ", " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println("Es: " + num2 + ", " + num1 + ", " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println("Es: " + num2 + ", " + num3 + ", " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println("Es: " + num3 + ", " + num1 + ", " + num2);
        } else {
            System.out.println("Es: " + num3 + ", " + num2 + ", " + num1);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese el primer numero:
1
Ingrese el segundo numero:
23
Ingrese el tercer numero:
14
Es: 1, 14, 23
 * Pegue aquí la evidencia de la ejecución del .java
 */