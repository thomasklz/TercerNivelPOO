
package switch2;

import java.util.Scanner;


public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Ingresar un número del 1 al 5 y mostrar en pantalla su valor en letras
        
        
        Scanner entrada = new Scanner(System.in);
        short numero;
        System.out.println("Ingresa un número del 1 al 5");
        numero=entrada.nextShort();
        
       /* if(numero ==1){
            System.out.println("Uno");
        }
        if(numero ==2){
            System.out.println("Dos");
        }
         if(numero ==3){
            System.out.println("tres");
        }
         if(numero ==4){
            System.out.println("Cuatro");
        }
         if(numero ==5){
            System.out.println("Cinco");
        }*/
       
       switch(numero){
           
           case 1:
               System.out.println("Uno");
               break;
           case 3:
               System.out.println("Tres");
               break;
           case 2:
               System.out.println("Dos");
               break;
          case 4:
               System.out.println("Cuatro");
               break;
           case 5:
               System.out.println("Cinco");
               break;
       
       }
        
    }
    
}
