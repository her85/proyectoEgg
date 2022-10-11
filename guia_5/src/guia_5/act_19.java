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
public class act_19 {

    /**
     * @param args the command line arguments
     */
//    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        llenarMatriz(matriz);
        System.out.println("");
        matrizInversa(matriz);
        
        
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Ingrese el numero de la fila " + i + " y la columna " + j);
                num = leer.nextInt();
                matriz[i][j] = num;
            }
        }
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("(" + matriz1[j] + ")");
            }
            System.out.println("");
        }
    }
    
    public static void matrizInversa(int[][]matriz){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int[] matriz1 : matriz) {
                System.out.print("(" + matriz1[i] + ")");
            }
            System.out.println("");
        }
        
    }
    
    
}
