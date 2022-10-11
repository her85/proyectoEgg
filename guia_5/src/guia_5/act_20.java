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
public class act_20 {

    /**
     * @param args the command line arguments
     */
//    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] cuadradoMagico = new int[3][3];

        llenadoCuadradoMagico(cuadradoMagico);
        System.out.println("");
        System.out.println(matrizMagica(cuadradoMagico));
    }

    
    
    public static void llenadoCuadradoMagico(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int num;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                boolean band = true;
                do {
                    System.out.println("Número de fila {" + i + "} y columna {" + j + "}");
                    num = leer.nextInt();
                    if (num >= 1 && num <= 9) {
                        band = false;
                    }
                } while (band != false);
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

    public static String matrizMagica(int[][] matriz) {
        String resultado ="magica";
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaDiagonalPrincipal=0;
        int sumaDiagonalSecundaria=0;
        int aux1 = 0;
        boolean band = false;
        //boolean magica=false;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                sumaFilas += +matriz[i][j];
                sumaColumnas += +matriz[j][i];
            }
            if (sumaFilas == sumaColumnas) {
                aux1++;
                if (aux1 == matriz.length) {
                    band = true;
                } else {
                    sumaFilas = 0;
                    sumaColumnas = 0;
                }

            }else {
               break;
            }
        }
        if(band==true){
            for (int i = 0; i < matriz.length; i++) {
                
                for (int j = 0; j < matriz.length; j++) {
                   if(i==j){
                       sumaDiagonalPrincipal+=+matriz[i][j];
                   }
                    if((i+j)==matriz.length-1){
                       sumaDiagonalSecundaria+=+matriz[i][j];
                   }
                   
                }
            }
            if(sumaDiagonalPrincipal!=sumaDiagonalSecundaria){
                band=false;
            }
        }
        //if(sumaFilas && sumaColumnas == sumaDiagonalPrincipal && sumaDiagonalSecundaria){
            //magica=true;
        //}
        
        if(band==true){
            System.out.print("La matriz es ");
        }else{
            System.out.print("La matriz no es ");
        }

        return resultado;
    }
}
