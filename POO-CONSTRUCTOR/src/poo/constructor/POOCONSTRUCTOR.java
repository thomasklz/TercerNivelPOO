
package poo.constructor;


public class POOCONSTRUCTOR {

    
    public static void main(String[] args) {
       
        
        telefono tel = new telefono(2014,"6s","iphone");
        System.out.println("La marca del teléfono es: "+tel.marca +" "+ tel.modelo +" "+ tel.year);
       
        
        telefono tel1 = new telefono(2010,"A20","samsung");
        System.out.println("La marca del teléfono es: "+tel1.marca +" "+ tel1.modelo +" "+ tel1.year);
        
        
        telefono tel2 = new telefono(2014);
        System.out.println("La marca del teléfono es: "+tel2.marca +" "+ tel2.modelo +" "+ tel2.year);
    }
    
}
