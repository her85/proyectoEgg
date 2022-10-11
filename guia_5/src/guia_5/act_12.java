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
public class act_12 {

    /**
     * @param args the command line arguments
     */
    /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
    X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
    de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
    incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String lectura;
        int longitud = 5;
        String primerAux = "X";
        String segundoAux = "O";
        int i = 0, j = 0, k = 0;
        boolean band = false;
        //String salida = "&&&&&";
        do {
            System.out.println("Ingrese una cadena");
            lectura = leer.nextLine();
            if (lectura.equals("&&&&&")) {
                        band=true;
                        break;
                    }
            //band = true == salida.equalsIgnoreCase(lectura);
            int lecturaLongitud = lectura.length();
            //System.out.println(lecturaLongitud);
            if (longitud == lecturaLongitud) {
                //System.out.println("Y");
                String aux1 = lectura.substring(0, 1);
                String aux2 = lectura.substring(4, 5);
                //System.out.println(aux1);
                //System.out.println(aux2);
                if (primerAux.equalsIgnoreCase(aux1) && segundoAux.equalsIgnoreCase(aux2)) {
                    i = i + 1;
                    String aux3 = lectura.substring(0, 5);
//                    if (lectura.equals("&&&&&")) {
//                        band=true;
//                    }
                } else {
                    j = j + 1;
                }
            } else {
                k = k + 1;
            }
        } while (band=true);
        int positivas = i;
        int negativas = j + k;
        System.out.println("Cantidad de correctas = " + positivas + " cantidad de incorrectas = " + negativas);
    }

}
