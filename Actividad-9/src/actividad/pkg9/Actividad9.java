
package actividad.pkg9;

import java.util.Scanner;


public class Actividad9 {

    /**
      *@param args the command line arguments
    */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        persona p = new persona();
      
        p.ingresarPersona();
        
        
        boolean opcion= p.esMayorDeEdad();
        if(opcion==true){
            System.out.println("El usuario es mayor de edad");
        }else{
            System.out.println("El usuario es menor de edad");
        } 
        
        p.calcularIMC();
        p.buscarPersona();
        
        
        
        
    }
    
}
