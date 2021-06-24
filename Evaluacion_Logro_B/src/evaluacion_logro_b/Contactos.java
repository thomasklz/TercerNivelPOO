
package evaluacion_logro_b;

import java.util.ArrayList;
import java.util.Scanner;


public class Contactos {
    
    private String nombre, telefono ;
    Scanner entrada = new Scanner(System.in);
    public Contactos(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contactos() {
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
    
    
     public ArrayList<Contactos> anadirContacto(ArrayList<Contactos> array){
        
        boolean ops= agendaLlena(array);
        if(ops==true){
            System.out.println("La aganda está llena");
        }else{
            System.out.println("Ingresar nombre"); 
            setNombre(entrada.nextLine());

            int op= existeContacto(getNombre(), array);
            if(op==1){
                System.out.println("Contacto existente");
            }else{
                System.out.println("Ingresar el número de teléfono"); 
                setTelefono(entrada.nextLine());
                array.add( new Contactos(getNombre(), getTelefono()));
            }
        }
        return array;
     }
     
     
     public int  existeContacto(String nombre, ArrayList<Contactos> array){
        
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getNombre().equals(nombre)){
               return 1;
            }
        }
        return 0;
      } 
     
    public void listarContacto(ArrayList<Contactos> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Nombre: "+ array.get(i).getNombre()+" Teléfono: "+ array.get(i).getTelefono());  
        }
    }
    
    public void buscarContacto(ArrayList<Contactos> array){
        System.out.println("Ingrese el nombre del contacto a buscar");
        String nombre = entrada.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getNombre().equals(nombre)){
               System.out.println("Nombre: "+ array.get(i).getNombre()+" Teléfono: "+ array.get(i).getTelefono());  
            }else{
                System.out.println("El contacto buscado no existe");
            }
            
        }
    }
    
    public ArrayList<Contactos> elimanarContacto(ArrayList<Contactos> array){
       
        System.out.println("Ingrese el nombre del contacto a eliminar");
        String nombre = entrada.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getNombre().equals(nombre)){
                array.remove(i);
                System.out.println("Contacto eliminado");
            }
            else{
                System.out.println("No se puede eliminar el contacto");
            }
            
        }
       return array; 
    }
    
    public boolean agendaLlena(ArrayList<Contactos> array){
        if(array.size()==9){
            return true;
        }else{
            return false;
        }
    }
    
    public void huecosLibres(ArrayList<Contactos> array) {
       System.out.println("Los huecos disponibles son: " + (10 - array.size()));
    }
}

