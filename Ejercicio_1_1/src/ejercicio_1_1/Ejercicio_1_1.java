/*
 Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package ejercicio_1_1;
import java.util.Scanner;
/**
 *
 * @author MarcosEA
 */
public class Ejercicio_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros: ");
        int num1 = leer.nextInt();
        System.out.println("+");
        int num2 = leer.nextInt();
        int suma = num1 + num2 ;
       
        System.out.println("=");
        System.out.println(suma);
    }
    
}
