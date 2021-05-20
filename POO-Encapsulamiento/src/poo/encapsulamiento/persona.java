
package poo.encapsulamiento;

public class persona {
    
    private String nombre;
    private int edad;
    private  int cedula;

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public persona() {
    }
    
    public void dormir(){
        System.out.println(this.nombre+" tiene una edad de: "+this.edad + " y está durmiendo");
    }
    
    public void comer(){
        System.out.println(this.nombre+ " está comiedno" + " y su cédula es: "+ this.cedula);
    }
    
}
