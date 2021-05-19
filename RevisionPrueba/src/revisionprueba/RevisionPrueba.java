/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionprueba;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RevisionPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Scanner sc=new Scanner (System.in);
        String c;
            int v=0;
        System.out.println("ingrese la cadena de string");
        c=sc.nextLine();
        System.out.println("La cadena tiene: "+c.length());
        for(int i =0;i<c.length();i++)
      
        {
        if(c.charAt(i)=='a' && c.charAt(i)=='e'&& c.charAt(i)=='i' && c.charAt(i)=='o'&& c.charAt(i)=='u')
        
        v++;
        
        
        }
        
        System.out.println("la cadena tiene "+v+" vocales");
    }
    




        
    
    
}
