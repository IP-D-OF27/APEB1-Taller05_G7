import java.util.Scanner;
/**
 * Ejercicio 11: "Desarrollar una solución que imprima el costo
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad 
 * que se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%."
 * @author Jeremy, Leandro
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cant, precioUni, precioTotal, descuento = 0.15;
        String descrip;
        System.out.println("Descripcion del producto:");
        descrip = tcl.next();
        System.out.println("Cantidad de: " + descrip);
        cant = tcl.nextDouble();
        System.out.println("Precio unitario de: " + descrip);
        precioUni = tcl.nextDouble();
        precioTotal = cant * precioUni;
        if (cant > 50) {
            descuento *= precioTotal;
            precioTotal = precioTotal - descuento;
        }
        System.out.println("El costo total de " + descrip + " es " + precioTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Descripcion del producto:
botellas
Cantidad de: botellas
51
Precio unitario de: botellas
2
El costo total de botellas es 86.7
BUILD SUCCESSFUL (total time: 6 seconds)
 */
