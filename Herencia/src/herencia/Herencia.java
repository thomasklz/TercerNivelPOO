
package herencia;


public class Herencia {

   
    public static void main(String[] args) {
       
        Futbolista f = new Futbolista();
        Entrenador  e = new Entrenador();
       
        
       // f.concentrase();
       // f.viajar();
       // f.jugarPartido();
       // f.entrenar();
        f.setNombre("Juan");
        f.calcularSueldo(10, 4);
        
        e.setNombre("Alamda");
        e.calcularSueldo(20, 10);
        
        
    }
    
}
