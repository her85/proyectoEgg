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
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
public class act_2_Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d;
        int aux,aux1;
        System.out.println("Ingrese 4 variables");
        a=leer.nextInt();
        b=leer.nextInt();
        c=leer.nextInt();
        d=leer.nextInt();
        System.out.println("Las variables ingresadas son: A="+a+",B="+b+",C="+c+",D="+d);
        aux1=b;
        b=c;
        aux=c;
        c=a;
        aux=a;
        a=d;
        d=aux1;
                
        System.out.println("Las nuevas varibales son: A="+a+",B="+b+",C="+c+",D="+d);
        
    }
    
}
