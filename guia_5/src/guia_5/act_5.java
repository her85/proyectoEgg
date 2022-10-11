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

/*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
public class act_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double num,doble, triple, raizC;
        
        
        System.out.println("Ingrese un numero entero");
        num = leer.nextDouble();
        
        System.out.println(doble = num * 2);
        System.out.println(triple = num * 3);
        System.out.println(raizC = Math.sqrt(num));
        
    }
    
}
