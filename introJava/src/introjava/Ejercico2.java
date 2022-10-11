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
public class Ejercico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        
//        int num;
        
//        System.out.println("Ingrese la nota");
//        num = leer.nextInt();
//        
//        while (num <= 0 || num >= 10) {
//            System.out.println("Ingrese la nota");
//            num = leer.nextInt();
//        }
//        
//        System.out.println("Su nota es: " + num);
       
//        int aux = 0;
//        
//        do {
//            System.out.println("Ingrese los numeros sumar, para salir ingrese 0");
//            num = leer.nextInt(); 
//            if (num < 0){
//                do {
//                    System.out.println("Ingrese los numeros sumar y no deben ser negativos");
//            num = leer.nextInt();
//                } while (num < 0);  
//            }
//            aux = num + aux;
//        } while (num != 0);
//        System.out.println("El resultado de la sumatoria es: " + aux);
        
         int num1; 
         //num2, num3, num4;
         
         for (int i = 0; i < 4; i++) {
             System.out.println("Ingrese un numero");
             num1 = leer.nextInt();
             if (num1 < 0 || num1 > 20)
                continue;
             System.out.print("" + num1 + " ");
             for (int j = 0; j < num1; j++) {
                 System.out.print("*");
             }
             System.out.println("");
        }
         //hasta ejercio 10
         
    }     
    
}
