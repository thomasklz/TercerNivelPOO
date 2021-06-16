
package repasoarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class RepasoArrayList {

   
    public static void main(String[] args) {
       
        Buses b = new Buses();
        ArrayList<Buses> ab= new ArrayList<Buses>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de buses que desea ingresar");
        int cantidad = entrada.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
             
             System.out.println("Ingrese el dato: "+ i);
             b.ingresarDatos();
             ab.add(new Buses(b.getNombreBus(),b.getCooperativa(), b.getPropietario(), b.getYear()));
        }
       
        b.mostrar(ab);
        
        entrada.nextLine();
        System.out.println("Ingrese la cooperativaa buscar :");
        String dato = entrada.nextLine();
        b.cantidadBusesCoop(ab, dato);
        
        
        
    }
    
}
