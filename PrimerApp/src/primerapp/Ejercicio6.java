
package primerapp;

import java.util.Scanner;


/**
Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejercicio6 {

 
    public static void main(String[] args) {
      
        System.out.println("ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        int n;
        n= leer.nextInt();
        if (n%2 == 0){
        System.out.println("el numero es Par");
        }
        else{
            System.out.println("el munero es Impar");    
        }
       
        
        
    }
    
}
