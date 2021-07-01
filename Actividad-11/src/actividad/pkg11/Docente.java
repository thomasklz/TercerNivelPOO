/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg11;

import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Docente extends Personas{
    String sueldo,fechaIngreso;
   
    public Docente(String nombre, String apellido, String cedula, int edad,String sueldo, String fechaIngreso) {
        super(nombre, apellido, cedula, edad);
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
    }

    public Docente() {
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void ingresar() {
        super.ingresar(); 
        System.out.println("ingrese el sueldo");
        setSueldo(entrada.nextLine());
        System.out.println("ingrese el fecha de ingreso");
        setFechaIngreso(entrada.nextLine());
    }

    @Override
    public void listar(ArrayList<Docente> array) {
      //  super.listar();
        for (int i = 0; i < array.size(); i++) {
             System.out.println("Docente #: "+(i+1));
            System.out.println(
                    array.get(i).getNombre() +" "+
                    array.get(i).getApellido()
                    +" "+array.get(i).getCedula());
        }
       
    }
    
    
   
    
    
    
}
