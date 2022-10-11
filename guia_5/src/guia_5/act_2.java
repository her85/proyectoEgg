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
public class act_2 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    pantalla.
    */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre completo");
        nombre = leer.nextLine();
        System.out.println("" + nombre);
        
    }
    
}
