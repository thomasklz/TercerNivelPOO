
package operation;


public class Operaciones {
   int num1; int num2; 

   public Operaciones() {
    }

   
    public void setNum1(int n) {
        this.num1 = n;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    
    
    
    
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
   
    public void suma(){
        System.out.println("La suma es :"+( this.num1+ this.num2) );
    }
   public void resta(int n1, int n2){
        this.num1= n1;
        this.num2=n2;
        System.out.println("La resta es :"+( this.num1- this.num2) );
    }
   public void multiplicacion(int n1, int n2){
        this.num1= n1;
        this.num2=n2;
        System.out.println("La multiplicación es :"+( this.num1*this.num2) );
    }
    public int division(int n1, int n2){
        this.num1= n1;
        this.num2=n2;
       // System.out.println("La división es :"+( this.num1/ this.num2) );
        return ( this.num1/ this.num2);
    }
   
   
   
}
