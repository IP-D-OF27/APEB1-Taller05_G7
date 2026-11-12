
import java.util.Scanner;

/**
 * Ejercicio 04: Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100 ; 
 * De lo contrario, no hay descuento
 * @author Leandro, Jeremy 
 * @version 1.0
 */

public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precio, precioFinal;
        System.out.println("Ingrese el precio:");
        precio = tcl.nextDouble();
        if (precio > 100) {
            precioFinal = precio - (precio * 0.10);
        } else {
            precioFinal = precio;
        }
        System.out.println("Precio final: $" + precioFinal);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese el precio:
120
Precio final: $108.0
 
 * Pegue aquí la evidencia de la ejecución del .java
 */