
package primerapp;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
public class Ejercicio7 {

 
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String cadena, m;
    System.out.println("Ingrese una frase");
    cadena=leer.nextLine();
    m="eureka";
    if (cadena.equals(m)){
        System.out.println("CORRECTO");
    }
    else{
        System.out.println("INCORRECTO");
    }
    }}
    
     
