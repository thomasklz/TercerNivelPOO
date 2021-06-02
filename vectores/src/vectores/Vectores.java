/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
          //DECLARO UN VECTOR
        int[] numeros= new int[7];
        
        //LLENO UN VECTOR
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un valor en la posición: "+i);
            numeros[i]= entrada.nextInt();
        }
        
        int positivos=0;
        
        // IMPRIMO UN VECTOR
        for (int i = 0; i < 7; i++) {
            if(numeros[i]>0){
             positivos++;
            }
        }
      
        System.out.println("El total de números pisitivos son: "+ positivos);
        
        
    }
    
}
