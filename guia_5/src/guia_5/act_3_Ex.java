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
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class act_3_Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char letra;
        System.out.println("Ingrese una letra");
        letra = leer.next().charAt(0);
        System.out.println(vocal(letra));
    }

    public static String vocal(char letra) {
        String mensaje;
        boolean band = false;
        char char1 = 'a';
        char char2 = 'e';
        char char3 = 'i';
        char char4 = 'o';
        char char5 = 'u';
        if (char1 == letra) {
            band = true;
        } else if (char2 == letra) {
            band = true;
        } else if (char3 == letra) {
            band = true;
        } else if (char4 == letra) {
            band = true;
        } else if (char5 == letra) {
            band = true;
        }

        if (band == true) {
            mensaje = "Es una vocal";
        } else {
            mensaje = "No es una vocal";
        }

        return mensaje;
    }
}
