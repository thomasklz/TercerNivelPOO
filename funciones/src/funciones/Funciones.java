
package funciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Funciones {

    public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
        
     suma(8,9);
     suma(3,9);
     suma(4,9);
     suma(5,9);
     suma(6,9);
         
     resta();
     int resultado= multiplciacion(7,7);
     System.out.println("la multiplicación es: "+resultado);
        
    }
    
    // tipo de funciones 
      
    // funciones que recien valores y no devuelven nada
    public static void suma(int n1, int n2){
        System.out.println("la suma es "+ (n1+n2));        
    }
    
    // funciones que no recien valores y no devuelven nada
    public static void resta(){
        int a=5,b=4;
        System.out.println("la resta es "+ (a-b));        
    }
    
     // funciones que  recien valores y  que devuelve un valor
    public static int multiplciacion(int n1, int n2){
        return (n1*n2);
    }
    
     // funciones que  no recien valores y  que devuelve un valor
    public static int division(){
        int n1=5,n2=5;
        return (n1*n2);
    }
    
   /* public static void opciones(){
        System.out.println("Sleccione una opcion");
        System.out.println("1) suma");
        System.out.println("1) resta");          
    }*/
}
