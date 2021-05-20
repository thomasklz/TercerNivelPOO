
package poo.clase.pkg2;

public class POOCLASE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        telefono telefon= new telefono();
        
        telefon.marca= "Iphone";
        telefon.modelo="12s";
        telefon.year=2020;
        
        System.out.println("La marca del teléfono es: "+telefon.marca +" "+ telefon.modelo +" "+ telefon.year);
        
        telefon.encendido();
        telefon.apagado();
        
    

    }
    
}
