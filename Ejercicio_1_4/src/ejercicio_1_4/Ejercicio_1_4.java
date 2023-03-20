/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ Մ9 * C / 5Յ.
 */
package ejercicio_1_4;

import java.util.Scanner;

/**
 *
 * @author MarcosEA
 */
public class Ejercicio_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura en °C : ");
        double temp = leer.nextDouble();
        System.out.println("La temperatura en °F es " +((9*temp/5)+32));
    }
    
}
