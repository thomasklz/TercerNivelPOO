
package funciones02;

import java.util.Scanner;


public class Funciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el radio");
        int radio= entrada.nextInt();
        float resul=culculalAreaCirculo(radio);
        System.out.println("El área de un circulo es: "+ resul);
        
    }
    
    public static float culculalAreaCirculo(int radio){
        float resultado;
        float pi=3.1416f;
        resultado=(int)(pi*(radio*radio));
        //System.out.println("El área de un circulo es: "+ resultado);
        return resultado;
    }
}
