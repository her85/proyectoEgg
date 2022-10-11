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
public class act_6 {

    /**
     * @param args the command line arguments
     */
    
    /*
        Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero para saber si es par o impar");
        num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero " + num + " es par");
        }else{
             System.out.println("El numero " + num + " es impar");
        }            
    }
    
}
