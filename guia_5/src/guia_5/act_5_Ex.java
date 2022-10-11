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

//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento

public class act_5_Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        String carnet;
        System.out.println("Tipo de socio");
        carnet=leer.nextLine();
        
        
     System.out.println(descuento(carnet));
         
    }
    
   
    
    
    public static double descuento(String carnet){
        Scanner leer = new Scanner(System.in);
        
        int tratamiento;
        double descuentoAplicado;
        
        System.out.println("Valor del tratamiento");
        tratamiento=leer.nextInt();
        
        switch(carnet){
            case "A":
                descuentoAplicado=tratamiento/1.5;
                break;
            case "B":
                descuentoAplicado=tratamiento/1.25;
                break;
            default:
                descuentoAplicado=tratamiento;
                    
        }
        return descuentoAplicado;
    }
    
}
