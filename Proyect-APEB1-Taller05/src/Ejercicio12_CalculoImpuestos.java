import java.util.Scanner;
/**
 * Ejercicio 12: "Desarrollar una solución que permita leer los datos de un
 * automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio
 * de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%,
 * si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%"
 *
 * @author Leandro, Jeremy
 * @version 1.0
 */
public class Ejercicio12_CalculoImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca, origen;
        double costo, montoImpuesto, costoTotal;
        int impuesto;
        System.out.println("Cual es la marca del automovil:");
        marca = tcl.next();
        System.out.println("Cual es el origen del automovil (Alemania, Japon, Italia, U.S.A):");
        origen = tcl.next();
        switch (origen) {
            case "Alemania" -> impuesto = 20;
            case "Japon" -> impuesto = 30;
            case "Italia" -> impuesto = 15;
            case "U.S.A" -> impuesto = 8;
            default -> {
                System.out.println("Pais de origen no valido");
                return;
            }
        }
        System.out.println("Cual es el costo del automovil:");
        costo = tcl.nextDouble();
        montoImpuesto = costo * impuesto / 100;
        costoTotal = costo + montoImpuesto;
        System.out.println("El impuesto por pagar es de: " + impuesto + "% " + montoImpuesto + "$");
        System.out.println("El total a pagar del automovil " + marca + " es: " + costoTotal);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN: 
 * Cual es la marca del automovil:
Toyota
Cual es el origen del automovil (Alemania, Japon, Italia, U.S.A):
Japon
Cual es el costo del automovil:
25000
El impuesto por pagar es de: 30% 7500.0$
El total a pagar del automovil Toyota es: 32500.0
BUILD SUCCESSFUL (total time: 18 seconds)
 */
