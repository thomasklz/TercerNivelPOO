/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Operaciones op = new Operaciones();
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("Ingrese el número 1");
        op.setNum1(entrada.nextInt()); // 20
      
        System.out.println("Ingrese el número 2");
        op.setNum2(entrada.nextInt()); // 4
        
        System.out.println(op.getNum1());
        System.out.println(op.getNum2());
        
        
        
        
        
        
        
       /* op.suma(op.getNum1(), op.getNum2());
        
        op.resta(op.getNum1(), op.getNum2());
        op.multiplicacion(op.getNum1(), op.getNum2());*/
        
    }
    
}
