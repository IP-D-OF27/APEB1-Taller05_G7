import java.util.Scanner;
/**
 * Ejercicio 13: "En una hostería de la ciudad de Loja se hace un descuento del
 * 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10
 * días y del 20% si se hospeda más de 15 días. Elaborar una solución que pida
 * el número de días y el precio diario de la habitación y luego calcule e
 * imprima el subtotal por pagar, el descuento y el total por pagar."
 *
 * @author Leandro, Jeremy
 * @version 1.0
 */
public class Ejercicio13_ReservasHoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numDias;
        double precioDia, descuento, subtotal, total, montoDescuento;
        System.out.println("Cuantos dias se hospeda:");
        numDias = tcl.nextInt();
        if (numDias > 15) {
            descuento = 20;
        } else if (numDias > 10) {
            descuento = 15;
        } else if (numDias > 5) {
            descuento = 10;
        } else {
            descuento = 0;
        }
        System.out.println("Precio diario de la habitacion:");
        precioDia = tcl.nextDouble();
        subtotal = precioDia * numDias;
        System.out.println("El subototal a pagar es de: " + subtotal);
        montoDescuento = subtotal * descuento / 100;
        total = subtotal - montoDescuento;
        System.out.println("Usted ha aplicado a un decuento del " + descuento
                + "% " + montoDescuento + "$");
        System.out.println("Su total a pagar es de: " + total);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN: 
 * Cuantos dias se hospeda:
6
Precio diario de la habitacion:
15
El subototal a pagar es de: 90.0
Usted ha aplicado a un decuento del 10.0% 9.0$
Su total a pagar es de: 81.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */
