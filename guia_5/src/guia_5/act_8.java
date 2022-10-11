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
public class act_8 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java.
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palarabra de 8 caracteres");
        frase = leer.nextLine();
        
        int longitud = frase.length();
        
        System.out.println("" + longitud);
        
        boolean band = longitud == 8;
        if (band) {
            System.out.println("Es correcto");
        }else{
            System.out.println("Es incorrecto");
        }
        
    }
    
}
