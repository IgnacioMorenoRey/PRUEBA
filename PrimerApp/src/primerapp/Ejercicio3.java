
package primerapp;

import java.util.Locale;
import java.util.Scanner;

/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio3 {

 
    public static void main(String[] args) {
    System.out.println("Ingresa una frase");   
    Scanner leer  = new Scanner(System.in);
    String cadena = leer.nextLine();
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
    }
    
}
