/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Persona {
   private String nombre, apellido, cedula;
   private int idpersona;

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
   
   public static ArrayList<Persona> arrayPersona= new  ArrayList<Persona>();
    
   public Persona(int idpersona, String nombre, String apellido, String cedula) {
        this.idpersona=idpersona; 
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
       
    }

    public Persona() {
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
   
    public void guardar(){
        this.arrayPersona.add(new Persona(getIdpersona(),getNombre(), getApellido(), getCedula()));
    }
}
