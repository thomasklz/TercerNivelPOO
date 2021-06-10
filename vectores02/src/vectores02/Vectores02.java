
package vectores02;

import java.util.Scanner;


public class Vectores02 {

   
    public static void main(String[] args) {
        
        String[] cadena = new String[5];
        Scanner d = new Scanner(System.in);
       /*cadena[0]="Tomás Loor 1313";
        cadena[1]="Oliver Loor 1212";
        cadena[2]="Susana Cedeño 5454";
        cadena[3]="Jasson Lopez 5454";
        cadena[4]="Andy Vite 45445";*/
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nombre a la posición: "+i);
            cadena[i]=d.nextLine();
        }
       
        
        for (int i = 0; i < 5; i++) {
            System.out.println(" Posición "+i+") valor: "+ cadena[i]); 
        }
       
  
        
    }
    
}
