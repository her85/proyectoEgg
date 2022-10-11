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
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class act_1_Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int minutos;
        System.out.println("Ingrese los minutos a convertir");
        minutos=leer.nextInt();
        
        System.out.print("Son "+(dias(minutos))+" dias");
        System.out.println(" y "+(horas(minutos))+" horas");
    }
    public static int dias(int minutos ){
        int dias;
        
        dias=minutos/1440;
        
        return dias;
    }
    
    public static int horas(int minutos){
    int horas;
    int aux;
    aux=minutos/60;
    horas=aux-24;
    
    return horas;
    }
}
