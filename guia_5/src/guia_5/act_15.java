/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

/**
 *
 * @author hab_8
 */

/*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
 */
public class act_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector;
        vector = new int[101];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        for (int i = vector.length-1; i >= 0 ; i--) {
            System.out.println("( " + vector[i] + " )");
        }
    }

}
