/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg11;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Personas {
    String nivel, fecha_matricula;

    public Estudiante(String nombre, String apellido, String cedula, int edad, String nivel, String fecha_matricula) {
        super(nombre, apellido, cedula, edad);
        this.nivel = nivel;
        this.fecha_matricula = fecha_matricula;
    }

    public Estudiante() {
    }

    public String getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(String fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void ingresar() {
        super.ingresar(); 
        System.out.println("Ingrese el nivel");
        setNivel(entrada.nextLine());
        System.out.println("Ingrese el fecha de matrciula");
        setFecha_matricula(entrada.nextLine());
    }
    
    
    public void mostrar_niveles(){
    
    }
}
