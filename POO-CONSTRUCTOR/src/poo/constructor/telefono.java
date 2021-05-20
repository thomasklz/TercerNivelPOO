
package poo.constructor;

public class telefono {
   int year ;
   String modelo;
   String marca;

    public telefono(int year, String modelo, String marca) {
        this.year = year;
        this.modelo = modelo;
        this.marca = marca;
    }

    public telefono(int year) {
        this.year = year;
    }

    public telefono(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    
   public void encendido (){
       System.out.println("Encendido");
   }
    public void apagado (){
        System.out.println("Apagado");
   }
    
    
    
}
