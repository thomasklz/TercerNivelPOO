
package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/*
DESARROLLAR EL SIGUIENTE RESOLUCIÓN DE PROBLEMA:
Nos piden realizar una agenda telefónica de contactos.
•	Un contacto está definido por un nombre y un teléfono. 
•	Una agenda de contactos está formada por un conjunto de contactos.
•	La agenda tendrá un tamaño por defecto de 10 contactos.
•	Realizar los respectivos métodos get y set para cada atributo. (1pto)
Los métodos de la agenda deberán estar en la clase y serán los siguientes:
•	existeContacto(): indica si el contacto pasado existe o no, retorna true en caso de existir, false en caso de no existir.(1ptos)
•	anadirContacto(): 
Añade un contacto a la agenda
no se podrán meter más de 10 contactos en la agenda
si existen más de 10 se indicará con un mensaje por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono (UTILIZAR EL MÉTODO existeContacto). (2ptos)
•	listarContactos(): Lista todos los contactos de la agenda(1pto)
•	huecosLibres(): indica cuantos contactos más podemos agregar a la agenda.(1ptos)


*/
public class Agenda {


    public static void main(String[] args) {
       
        Scanner  entrada = new Scanner(System.in);
        ArrayList<contactos> arrayContactos= new ArrayList<contactos>();
        contactos c = new contactos();
        
        System.out.println("1) Espacios disponibles");
        System.out.println("2) Listar Contactos");
        System.out.println("3) Buscar Contactos");
        System.out.println("4) Añadir Contactos");
        System.out.println("5) Salir");
        
        System.out.println("Ingrese una opcion");
        
        
        
        
        
       //opcion4
         c.anadirContacto();
         arrayContactos.add(new contactos(c.getNombre(),c.getTelefono()));
       
         
        //3
       /* System.out.println("********Ingrese el nombre del contacto  que desea buscar**********");
        String nombreBuscar= entrada.nextLine();
        
        boolean estado= c.existeContacto(arrayContactos,nombreBuscar);
        
        if(estado==true){
            System.out.println("Contacto existente");
        }else{
            System.out.println("Puede ingresar ese contacto");
             
        }*/
       
       
       
       //opcion 1
        //c.huecosLibres(arrayContactos);
        
        
        //opcion 2
       // c.listarContactos(arrayContactos);
    
        
    }
    
}
