
package pkgif;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String salir;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Jasson arreglaste la casa");
        salir = entrada.nextLine();
        
              // Si si
        if(salir.equals("Si") || salir.equals("si") ){
            System.out.println("Puede salir a jugar");
        }else{
            System.out.println("No puede salir");
        }
        
        
        
    }
    
}
