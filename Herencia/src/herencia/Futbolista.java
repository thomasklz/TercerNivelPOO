
package herencia;

public class Futbolista extends SeleccionFutbol {
    String demarcacion;
    int dorsal;

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
 
   public void jugarPartido(){
       System.out.println("Jugar partido");
   }
   public void entrenar(){
       System.out.println("Entrenar");
   }
}
