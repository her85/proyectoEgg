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
public class act_9 {

    /**
     * @param args the command line arguments
     */
    
    /*
        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
    diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
    la función Substring y equals() de Java.
    */
    public static void main(String[] args) {
    
           Scanner leer = new Scanner(System.in);
           
           System.out.println("Escribe una frase");
           String frase = leer.nextLine();
           
          int longitud = frase.length();
          String letra = "A";
          //frase.substring(1);
          String aux = frase.substring(0,1);
          System.out.println(aux);
           
          if (letra.equalsIgnoreCase(aux)){
              System.out.println("Es correcto");
          }else {
              System.out.println("ES incorrecto");
          }
    }
    
}
