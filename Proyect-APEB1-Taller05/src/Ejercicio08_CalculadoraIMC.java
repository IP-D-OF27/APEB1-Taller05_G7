import java.util.Scanner;
/**
 * Ejercicio 08: Calcula el índice de masa corporal (IMC) de una persona y la
 * clasifica en función de su valor (bajo peso, peso normal, sobrepeso, etc.) 
 * @author Leandro, Jeremy
 * @version 1.0
 */
public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Ingrese su peso: ");
        peso = tcl.nextDouble();
        System.out.println("Ingrese su altura: ");
        altura = tcl.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}
/**
 **
 * EVIDENCIA DEL RUN: 
 * Ingrese su peso: 
110
Ingrese su altura: 
1,90
Su IMC es: 30.470914127423825
Obesidad
 */
