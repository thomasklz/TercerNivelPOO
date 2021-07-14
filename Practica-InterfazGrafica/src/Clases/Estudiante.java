
package Clases;

import java.util.ArrayList;

public class Estudiante {
    String nombre, apellido, cedula;
   public static ArrayList<Estudiante> arrayestudiante= new ArrayList<Estudiante>();
    
    public Estudiante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void guardarEstudiante(){
      this.arrayestudiante.add(new Estudiante(getNombre(), getCedula(), getApellido()));
    }
    
    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
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
