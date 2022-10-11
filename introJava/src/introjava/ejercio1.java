/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author hab_8
 */
public class ejercio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //ejercicio del 1 al 4
         Scanner leer = new Scanner(System.in);
         
        
         
         System.out.println("¿Cual es tu nombre?");
          String nombre = leer.next();
         System.out.println("¿Cual es tu edad?");
            int num = leer.nextInt();
         System.out.println("Tu nombre es " + nombre + " y tu edad: " + num);  
            
    }
    
}
