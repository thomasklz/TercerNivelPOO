
package poo.clase;


public class POOCLASE {

   
    public static void main(String[] args) {
        
       Auto carro = new Auto();
       
       carro.marca="Toyota";
       carro.peso=58;
       carro.year=2010;
       
       
       
       System.out.println("---------- CARRO 1 --------------");
        System.out.println("La marca del carro es:"+carro.marca);
        System.out.println("El peso del carro es:"+carro.peso);
        System.out.println("El año del carro es:"+carro.year);     
        
        carro.avanzar();
        
        
       System.out.println("---------- CARRO 2 --------------");
       Auto carro1 = new Auto();
       carro.marca="Mazda";
       carro.peso=10;
       carro.year=1870;
       
        System.out.println("La marca del carro es:"+carro.marca);
        System.out.println("El peso del carro es:"+carro.peso);
        System.out.println("El año del carro es:"+carro.year);     
        carro.frenar();
        
    }
    
}
