import java.util.Scanner;
/**
 * Ejercicio 03: Mayor de tres números: Dados tres números distintos, determine
 * cuál es el mayor.
 * @author Jeremy, Leandro
 * @version 1.0
 */
public class Ejercicio03_Mayor3numeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = tcl.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tcl.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tcl.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("El mayor es: " + num3);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */