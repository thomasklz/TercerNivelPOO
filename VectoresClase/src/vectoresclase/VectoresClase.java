
package vectoresclase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VectoresClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<empleado> arrayempleado = new ArrayList<empleado>();
        Scanner entrada= new Scanner(System.in);
        empleado em = new empleado(); 
        
        
        
        
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Ingrese los datos en la posición "+i);
            System.out.println("Ingresa el nombre");
            em.setNombre(entrada.nextLine());
            
            System.out.println("Ingrese el apellido");
            em.setApellido(entrada.nextLine());
            
            System.out.println("Ingrese la cédula");
            em.setCedula(entrada.nextLine());
            
            arrayempleado.add(new empleado(em.getApellido()));
            
        }
        
         System.out.println("Persona almacenadas en el array");
        for (int i = 0; i < arrayempleado.size(); i++) {
            System.out.println(arrayempleado.get(i).getApellido());
            
        }
        
        
        
        
        
       /* arrayempleado.add(new empleado("Tomas", "Loor", "12113"));
        arrayempleado.add(new empleado("Oliver", "Loor", "22222")); 
        arrayempleado.add(new empleado("Susana", "Zambrano", "3333"));*/ 
        
       // burcar un persona por cédula 
       
      System.out.println("Ingrese un número de cédula a buscar: ");
        String cedula=entrada.nextLine();
        int op=0;
        for (int i = 0; i < arrayempleado.size(); i++) {
           if(cedula.equals(arrayempleado.get(i).getCedula())){
                System.out.println("Persona encontrada: "+arrayempleado.get(i).getNombre() +" "+ arrayempleado.get(i).getApellido()+" "+ arrayempleado.get(i).getCedula());
               op=1;
           }
              
          
        }
        
        if(op==0){
            System.out.println("Persona no existe");
        }
       
        
        
        
        
       
       
    }
    
}
