import java.util.Scanner;
/**
 * Ejercicio 10: Dado un valor entero ingresado por teclado (positivo o 
 * negativo) , determine si se trata de un valor par o impar
 * @author Leandro, Jeremy
 * @version 1.0
 */
public class Ejercicio10_ValoresParImpar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero: ");
        numero = tcl.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese un numero entero: 
7
El numero es impa
 * Pegue aquí la evidencia de la ejecución del .java
 */