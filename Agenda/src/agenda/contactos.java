
package agenda;

import java.util.ArrayList;
import java.util.Scanner;





public class contactos {
Scanner  entrada = new Scanner(System.in);
    private String nombre;
    private String telefono;

    public contactos() {
    }


    public contactos(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
   
    
    
   public boolean existeContacto(ArrayList<contactos> array, String nombre ){
        
       for (int i = 0; i < array.size(); i++) {
          if(array.get(i).getNombre().equals(nombre)){
                return true;
           }
       }
       
       return false;      
    }
   
   
   public void listarContactos(ArrayList<contactos> array){
       for (int i = 0; i < array.size(); i++) {
           
           System.out.println("Nombre: "+array.get(i).getNombre()+" "+ "telefono: "+ array.get(i).getTelefono());
           
       }
   }
   
   
   public void huecosLibres(ArrayList<contactos> array){
   
        System.out.println("Los huecos disponibles son: "+ (10 - array.size()));
   }
   
   public void anadirContacto(){
        System.out.println("Ingrese el nombre");
        setNombre(entrada.nextLine());
        System.out.println("Ingrese el numero de telefono ");
        setTelefono(entrada.nextLine());
        
   }
}

