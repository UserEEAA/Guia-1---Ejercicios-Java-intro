/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package ejercicio_1_5;

import java.util.Scanner;

/**
 *
 * @author MarcosEA
 */
public class Ejercicio_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("El doble del numero ingresado es: " + (2*num));
        System.out.println("El triple del numero ingresado es: " + (3*num));
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
    }
    
}
