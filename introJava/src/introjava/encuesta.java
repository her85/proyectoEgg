/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author hab_8
 */
public class encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 al 5");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos semtimos apenados que no le haya gustado la peli");
                    break;
                case 3:
                    System.out.println("Peli buena");
                    break;
                case 4:
                    System.out.println("Peli muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico");
                    break;
            }
        } else if (opinion < 0) {
            System.out.println("Tan mala fue la peli");
        } else if (opinion == 0) {
            System.out.println("El valor " + opinion + " no es valido");
        } else {
            System.out.println("Se te fue la mano con la calificación!!!");
        }
        System.out.println("Hasta la proxima");;
    }
    
}
