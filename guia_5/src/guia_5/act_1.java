/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author hab_8
 */
public class act_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
            
            int  num1, num2, suma;
            
            System.out.println("Ingrese dos numeros enteros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            
            suma = num1 + num2;
            
            System.out.println("" + suma);

        
    }
    
}
