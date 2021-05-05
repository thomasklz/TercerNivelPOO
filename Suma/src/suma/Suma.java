
package suma;

import java.util.Scanner;

public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Realizar la suma de dos número
        
        int  numero1, numero2;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("::  Ingresa un número ::");
        numero1 = entrada.nextInt(); 
        
        /// numero1=10
        System.out.println(":: Ingresa el segundo número ::");
        numero2 = entrada.nextInt();
        // numero2=5
        
        numero1 += numero2;
      
                
                //numero1=15
        System.out.println("--->> La suma de los dos número es :"+ numero1 );
        
       
       
        
    }
    
}
