
package repasoarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Buses {
    
   Scanner entrada = new Scanner(System.in);
   private String nombreBus,cooperativa, propietario, year;

    public Buses(String nombreBus, String cooperativa, String propietario, String year) {
        this.nombreBus = nombreBus;
        this.cooperativa = cooperativa;
        this.propietario = propietario;
        this.year = year;
    }

    public Buses() {
    }

   
   
    public String getNombreBus() {
        return nombreBus;
    }

    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
   
    
    public void ingresarDatos(){
        System.out.println("Ingrese el nombre del bus");
        setNombreBus(entrada.nextLine());
        System.out.println("Ingrese el tipo de cooperativa");
        setCooperativa(entrada.nextLine());
        System.out.println("Ingrese el nombre del propietario");
        setPropietario(entrada.nextLine());
        System.out.println("Ingrese el año del bus");
        setYear(entrada.nextLine());
    }
   
    public void mostrar(ArrayList<Buses> arrayBuses){
        for (int i = 0; i< arrayBuses.size(); i++) {
            System.out.println("Datos del bus número :"+ i);
            System.out.println("Cooperativa: "+arrayBuses.get(i).getCooperativa());
            System.out.println("Nombre del bus: "+arrayBuses.get(i).getNombreBus());
            System.out.println("Año de fabricación: "+arrayBuses.get(i).getYear());
            System.out.println("Nombre del propietario: "+arrayBuses.get(i).getPropietario());
            System.out.println("Los años de funcionamiento del bus son: "+ calcularYearBus(Integer.parseInt(arrayBuses.get(i).getYear())));
        
        }
    }
    
    public int calcularYearBus(int year){
     return (2021 - year );
    }
    
    public void cantidadBusesCoop(ArrayList<Buses> arrayBuses, String dato){
      
        int aux=1;
        for (int i = 0; i < arrayBuses.size(); i++) {
            if(arrayBuses.get(i).getCooperativa().equals(dato)){
                System.out.println("bus:"+(aux)+" "+arrayBuses.get(i).getNombreBus());
                aux++;
            }
        }
    
    }
}
