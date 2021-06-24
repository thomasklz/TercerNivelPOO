
package herencia;


public class Entrenador  extends SeleccionFutbol{
   String idFederacion;

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
   
   public void dirigirPartido(){
       System.out.println("Dirigir partido");
   }
   public void dirigirEntrenamiento(){
       System.out.println("Dirigir entrenamiento");
   }
}
