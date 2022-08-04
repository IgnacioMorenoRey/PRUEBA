
package primerapp;

import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

   
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
        int c;
        double f;
          System.out.println("Ingrese la Temp en °C");
            c = leer.nextInt();
            f =  32 + (9*c/5);
            System.out.println("La Temp en °F es: "+f);
    }
    
}
