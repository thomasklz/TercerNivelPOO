
package Clases;

import java.util.ArrayList;


public class vehiculo {
    private String marca, modelo, color, year_fabricacion;
   public static ArrayList<vehiculo> arrayVehiculo= new ArrayList<vehiculo>();
    
    public vehiculo(String marca, String modelo, String color, String year_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year_fabricacion = year_fabricacion;
    }

    
     public void guardarVehiculos(){
        arrayVehiculo.add(new vehiculo(getMarca(), getModelo(), getColor(), getYear_fabricacion()));
     }
     
    public vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear_fabricacion() {
        return year_fabricacion;
    }

    public void setYear_fabricacion(String year_fabricacion) {
        this.year_fabricacion = year_fabricacion;
    }
    
    
}
