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
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
public class act_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dimension del vector");
        int n = leer.nextInt();
        System.out.println("Número a buscar dentro del vector");
        int num=leer.nextInt();
        int contador=0;
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
            if(num==vector[i]){
                System.out.print("( "+num+" ) en el lugar "+i);
                contador=contador+1;
                
            }
            
        }
        System.out.println(",se repite "+contador);

    }

}
