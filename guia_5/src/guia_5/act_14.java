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
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class act_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double euro;
        double libras = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;

        System.out.println("Cantidad de Euros a convertir");
        euro = leer.nextDouble();
        
        double resultLibras=convertidor(euro, libras);
        double resultDolares=convertidor(euro, dolar);
        double resultYenes=convertidor(euro, yenes);
        System.out.println(euro + " son " + (resultLibras) + " libras");
        System.out.println(euro + " son " + (resultDolares) + (" dolares"));
        System.out.println(euro + " son " + (resultYenes) + (" yenes"));
    }

    public static double convertidor(double moneda, double euro){
        double result=euro*moneda;
        return result;          
    }
}
