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
public class act_4 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);   
       
       float grado, retorno;
       
        System.out.println("Ingrese los grados centigrados");
        grado = leer.nextFloat();
        
        retorno = 32 + (9 * grado / 5);
        
        System.out.println("" + retorno + " °");
        
    }
    
}
