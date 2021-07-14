
package modificadoresacceso;

import Modelos.Persona;


public class ModificadoresAcceso {

   
    public static void main(String[] args) {
        
       /* Persona p = new Persona();
        System.out.println(p.nombre);
         System.out.println( p.apellido);*/
       
      Persona.arrayPersona.add(new Persona("Tomas","Loor"));
        for (int i = 0; i < Persona.arrayPersona.size(); i++) {
            System.out.println(Persona.arrayPersona.get(i).getNombre());
        }
    }
    
}
