/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package limpiarpantalla;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
/**
 *
 * @author MarcosEA
 */
public class LimpiarPantalla {
     public static void limpiarPantalla() {
        try {
            System.out.println("Presione cualquier tecla para continuar...");
            new java.util.Scanner(System.in).nextLine();
            
            Robot pressbot = new Robot();
            pressbot.keyPress(KeyEvent.VK_CONTROL);
            pressbot.keyPress(KeyEvent.VK_L);
            pressbot.keyRelease(KeyEvent.VK_CONTROL);
            pressbot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex)
        {
            System.out.println(""+ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
