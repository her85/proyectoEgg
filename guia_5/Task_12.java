/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivitiesJavaIntroduction;

import java.util.Scanner;

/**
 *
 * @author Exe
 */
public class Task_12 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String chainText;
        int succesAcount, errorAcount;
        succesAcount = 0;
        errorAcount = 0;
        System.out.println("Análisis de cadenas de texto. Dispositivo RS232");
        System.out.println("-----------------------------------------------");
        do {
            System.out.println("Ingrese una cadena en formato de texto. Máximo 5 caracteres. (Para finalizar el envío de carácteres envie el formato especial FDE): ");
            chainText = read.nextLine();
            if (chainText.length() > 5 || chainText.equals("")) {
                System.out.println("");
                System.out.println("El carácter ingresado debe tener una longitud máxima de 5 carácteres y no puede ser vacio\nIngrese nuevamente la cádena");
                System.out.println("");
                errorAcount += 1;
                continue;
            }

            if (chainText.equals("&&&&&")) {
                break;
            }
            if (chainText.startsWith("X") && chainText.endsWith("O")) {
                succesAcount += 1;
            } else {
                errorAcount += 1;
            }

        } while (!"&&&&&".equals(chainText));
        System.out.println("El número de cádenas analizadas correctas es: " + succesAcount);
        System.out.println("");
        System.out.println("El número de cádenas analizadas incorrectas es: " + errorAcount);

    }
}
