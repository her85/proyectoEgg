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
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
public class act_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        do{
            System.out.println("Ingrese un numero del 1 al 100");
            num = leer.nextInt();
        }while (num < 0 || num > 100) ;
        
        //System.out.println(num);
        
        int suma=0, aux;
        
//        do{
//            System.out.println("Ingrese un numero");
//            aux = leer.nextInt();
//            suma=suma+aux;
//        }while (suma < num);
        
        while (suma< num){
            System.out.println("Ingrese un numero");
            aux = leer.nextInt();
            suma=suma+aux;
        }
        
        System.out.println(suma);
    }
    
}
