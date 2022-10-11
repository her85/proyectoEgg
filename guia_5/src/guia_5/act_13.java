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
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
public class act_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int elementos;
        System.out.println("Ingrese elemetos");
        elementos = leer.nextInt();

        for (int i = 0; i < elementos; i++) {
            if (i == 0 || i == elementos - 1) {
                for (int j = 0; j < elementos; j++) {
                    System.out.print("*");
                }
                System.out.println("");
                //System.out.print("*");
            }
            if (i > 0 && i < elementos - 1) {
                for (int j = 0; j < elementos; j++) {
                    if (j == 0 || j == elementos - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println("");

            }

        }
    }
}
