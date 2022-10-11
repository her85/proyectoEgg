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
public class act_3 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase ());
        System.out.println(frase.toLowerCase());
        
    }
    
}
