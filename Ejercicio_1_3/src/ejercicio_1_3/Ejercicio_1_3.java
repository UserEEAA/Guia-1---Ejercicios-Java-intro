/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas
 */
package ejercicio_1_3;

import java.util.Scanner;

/**
 *
 * @author MarcosEA
 */
public class Ejercicio_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase cualquiera");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
}
