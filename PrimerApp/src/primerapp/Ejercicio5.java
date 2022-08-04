
package primerapp;

import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {

 
    public static void main(String[] args) {
   System.out.println("Ingresa un numero");   
    Scanner leer  = new Scanner(System.in);
    int num,d,t;
    double rc;
     num = leer.nextInt();
     d= num*2;
     t= num*3;
     rc= Math.sqrt(num);
     
        System.out.println("El doble es; "+d);
         System.out.println("El triple es; "+t);
          System.out.println("La RC es; "+rc);
    }
    
}
