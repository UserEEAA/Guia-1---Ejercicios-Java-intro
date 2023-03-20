/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package ejercicio_1_2;
import java.util.Scanner;
/**
 *
 * @author MarcosEA
 */
public class Ejercicio_1_2 {

    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=leer.nextLine();
        System.out.println("Su nombre es " + nombre);
        
    }
    
}
