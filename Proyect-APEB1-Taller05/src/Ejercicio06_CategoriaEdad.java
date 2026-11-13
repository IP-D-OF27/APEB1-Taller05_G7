import java.util.Scanner;
/**
 * Ejercicio 06:Clasificar a una persona en una categoría de edad (niño, 
 * adolescente, adulto) en función de su edad.
 * @author Leandro, Jeremy
 * @version 1.0
 */
public class Ejercicio06_CategoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        String categoria;
        System.out.println("Ingrese su edad:");
        edad = tcl.nextInt();
        if (edad < 12) {
            categoria = "Niño";
        } else if (edad < 18) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto";
        }
        System.out.println("Categoria: " + categoria);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese su edad:
19
Categoria: Adulto
 * Pegue aquí la evidencia de la ejecución del .java
 */