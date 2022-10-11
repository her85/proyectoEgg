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
public class act_18 {

    /**
     * @param args the command line arguments
     */
    /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
//        System.out.println("Filas de la matriz");
//        int fila = leer.nextInt();
//        System.out.println("Columnas de la matriz");
//        int columna = leer.nextInt();
        int fila = 4;
        int columna = 4;
        int[][] matriz = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                System.out.print("(" + matriz[j][i] + ")");
            }
            System.out.println("");
        }
    }
}
