
package poo.encapsulamiento;

import java.util.Scanner;


public class POOEncapsulamiento {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        persona p = new persona();
        
        System.out.println("Ingresa su nombre");
        p.setNombre(entrada.nextLine());
       
        
        System.out.println("Ingrese su edad");
        p.setEdad(entrada.nextInt());
        
     
        
        p.comer();
        p.dormir();
        
      //  System.out.println( p.getNombre());
        
        
       // p.setCedula(12345);
       // System.out.println( p.getCedula());
        
        
    }
    
}
