/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg11;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Personas {
    String nombre, apellido, cedula;
    int edad;
  Scanner entrada =  new Scanner(System.in);
    public Personas(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    public Personas() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void ingresar(){
        System.out.println("ingrese el nombre");
        setNombre(entrada.nextLine());
        System.out.println("ingrese el apellido");
        setApellido(entrada.nextLine());
        System.out.println("ingrese el cedula");
        setCedula(entrada.nextLine());
        System.out.println("ingrese el edad");
        setEdad(entrada.nextInt());
        entrada.nextLine();
    }
    
    public void listar (ArrayList<Docente> array){
    }
    
    public void buscar_por_fecha(){
        
    }
    
    
}
