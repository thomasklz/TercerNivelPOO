
package actividad.pkg11;

import java.util.ArrayList;


public class Actividad11 {

   
    public static void main(String[] args) {
        Docente docente= new Docente();
        Estudiante estudiante = new Estudiante();
        ArrayList<Docente> arrayDocente = new ArrayList<Docente>();
        ArrayList<Estudiante> arrayEstudiante = new ArrayList<Estudiante>();
        
         // op = 1 ingresar estudiante 
       /*9 for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el estudiante #: "+(i+1));
            estudiante.ingresar();
            arrayEstudiante.add( new Estudiante(
                            estudiante.getNombre(),
                            estudiante.getApellido(),
                            estudiante.getCedula(),
                            estudiante.getEdad(),
                            estudiante.getNivel(),
                            estudiante.getFecha_matricula()
            ));*/
        //}
        // op = 2 mostrar estudiante 
       /* for (int i = 0; i < arrayEstudiante.size(); i++) {
            System.out.println("Docente #: "+(i+1));
            System.out.println(
                    arrayEstudiante.get(i).getNombre() +" "+
                    arrayEstudiante.get(i).getApellido()
                    +" "+arrayEstudiante.get(i).getCedula()
                    +" "+arrayEstudiante.get(i).getNivel());
        }*/
        
        
        
        
        
        
         // op = 3 ingresar docente 
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el docente #: "+(i+1));
            docente.ingresar();
            arrayDocente.add( new Docente(
                            docente.getNombre(),
                            docente.getApellido(),
                            docente.getCedula(),
                            docente.getEdad(),
                            docente.getSueldo(),
                            docente.getFechaIngreso()
            ));
        }
        
        docente.listar(arrayDocente);
    }
    
}
