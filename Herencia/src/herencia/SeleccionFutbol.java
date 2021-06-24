
package herencia;


public class SeleccionFutbol {
    int id, edad;
    String nombre, apellido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
    
    
    public void concentrase(){
        System.out.println(getNombre()+ " está concentrado");
    }
    
    public void viajar(){
        System.out.println(getNombre()+" está viajando");
    }
    
    public void calcularSueldo(int vxhora,int yearexperiencia){
        
        System.out.println("El sueldo de: "+getNombre()+" es: "+(vxhora*yearexperiencia));
    
    }
}
