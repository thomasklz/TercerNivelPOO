
package Modelos;

import java.util.ArrayList;




public class Persona {
    private String nombre, apellido;
    public static ArrayList<Persona> arrayPersona = new  ArrayList<Persona>();
    final int PI=45;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }
    public void ingresar(){
    
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

    public ArrayList<Persona> getArrayPersona() {
        return arrayPersona;
    }

    public void setArrayPersona(ArrayList<Persona> arrayPersona) {
        this.arrayPersona = arrayPersona;
    }
    
    
}
