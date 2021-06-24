
package evaluacion_logro_b;

import java.util.ArrayList;
import java.util.Scanner;


public class Evaluacion_Logro_B {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Contactos> arraycontactos = new ArrayList<Contactos>();
        Contactos contactos = new Contactos();
         int op =0;
        do {
            System.out.println("1)Ingresar contacto");
            System.out.println("2)Ingresar buscar un contacto");
            System.out.println("3)Ingresar eliminar un contacto");
            System.out.println("4)Huecos disponibles");
            System.out.println("5)Listar contactos");
            System.out.println("6)Salir");
            System.out.println("Seleccione una opción");
            op = entrada.nextInt();
            switch (op){
            case 1:
              arraycontactos = contactos.anadirContacto(arraycontactos);
              break;
            case 2:
              contactos.buscarContacto(arraycontactos);
              break;
            case 3:
              arraycontactos = contactos.elimanarContacto(arraycontactos);
              break;
            case 4: 
               contactos.huecosLibres(arraycontactos);
               break;
            case 5:
               contactos.listarContacto(arraycontactos);
               break;
                
            }
           }  while(op!=6);
        
        
    }
    
}
