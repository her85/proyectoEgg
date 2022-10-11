
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hab_8
 */
public class act_7_eX {

    /**
     * @param args the command line arguments
     */
    /*
        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n, num;
        System.out.println("Ingrese n");
        n = leer.nextInt();
        int contador = 0;
        int valorMaximo = 0;
        int valorMinimo = 0;
        int total = 0;

//        while (contador < n) {
//            System.out.println("Ingrese números");
//            num = leer.nextInt();
//            total += num;
//            if (contador == 0) {
//                valorMaximo = num;
//                valorMinimo = num;
//            }
//            contador++;
//            if (num > valorMaximo) {
//                valorMaximo = num;
//            } else if (num < valorMinimo) {
//                valorMinimo = num;
//            }
//
//        }
//        System.out.println("Valor maximo: " + valorMaximo);
//        System.out.println("Valor minimo: " + valorMinimo);
//        System.out.println("El promedio: " + (total / n));

        do {
            System.out.println("Ingrese numeros");
            num = leer.nextInt();
            total += num;
            if (contador == 0) {
                valorMaximo = num;
                valorMinimo = num;
            }
            contador++;
            if (num > valorMaximo) {
                valorMaximo = num;
            } else if (num < valorMinimo) {
                valorMinimo = num;
            }

        } while (contador != n);
        System.out.println("Valor maximo: " + valorMaximo);
        System.out.println("Valor minimo: " + valorMinimo);
        System.out.println("El promedio: " + (total / n));
    }

}
