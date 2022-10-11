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
public class act_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2;
        boolean aux = false;
        do {
            System.out.println("Ingrese dos números positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1 < 1 && num2 < 1);

        do {
            System.out.println("  MENU");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Eliga una opción");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Restar");
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    break;
                case 4:
                    System.out.println("Dividir");
                    break;
                case 5:
                    //System.out.println("Estas seguro de salir S/N");
                    System.out.println("Salir");
                    aux = true;
                //Switch (repuesta){
                //}
//                        String aux2 = "S";
//                        String respuesta;
//                        respuesta=leer.nextLine();
//                        int lecturaLongitud = respuesta.length();
//                        String aux1=respuesta.substring(0,0);
//                        
//                        if (aux2.equalsIgnoreCase(aux1)){
//                            aux=true;
//                            break;
//                        }else{
//                            break;
                //}
                default:
                    break;
            }
        } while (aux == false);

    }

}
    
