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
public class act_6_Ex {

    /**
     * @param args the command line arguments
     */
    /*
        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.  
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int personas;
        int contador=0;
        double altura;
        
        System.out.println("Cuantas personas desea ingresar");
        personas=leer.nextInt();
        int [] cantidad=new int [personas];
        while(personas!=contador){
            for (int i = 0; i < cantidad.length; i++) {
               System.out.println("Ingrese la altura");
               altura=leer.nextDouble(); 
            }
            
            contador=contador+1;
        }
        
        
//        int [] cantidad = new int [personas];
//        estaturas(cantidad);
    }
    
//    public static void estaturas(int [] personas){
//        Scanner leer = new Scanner(System.in);
//        
//        double altura;
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println("Ingrese la altura");
//            altura=leer.nextDouble();
            
//        }
        
//    }
    
}
