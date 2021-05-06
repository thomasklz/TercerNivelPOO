
package pkgswitch;

import java.util.Scanner;


public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada= new Scanner(System.in);
        int op;
      
        System.out.println(":: Bienvenidos al soft de operaciones :: ");
        System.out.println(":: Seleccione una opción :: ");
        System.out.println("------------------------------");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("------------------------------");
        
        op=entrada.nextInt();
        
        switch(op){
            case 1: 
                int num1=5, num2=4;
                System.out.println("la suma es: "+(num1+num2));
                break;
            case 2: 
                int num3=5, num4=4;
                System.out.println("la suma es: "+(num3-num4));
                break;
        }
        
    }
    
}
