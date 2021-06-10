/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresclase;

/**
 *
 * @author Usuario
 */
public class empleado {
    private String  nombre, apellido, cedula;

    
    public empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public empleado(String apellido) {
        this.apellido = apellido;
    }
public empleado() {
       
    }
    public empleado(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

  
  
    

   
   
    
    
    
    public String getNombre() {
        return nombre;
    }

    public empleado() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
