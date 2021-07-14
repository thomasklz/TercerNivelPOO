
package Modelos;



public abstract class Figura {
    
    int area; 

    public Figura(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public abstract int calcularArea();
    
    public void ingresardatos(){
        System.out.println("Ingrasdasdas asdas");
    }
    
}
