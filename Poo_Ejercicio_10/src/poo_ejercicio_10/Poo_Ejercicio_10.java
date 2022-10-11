package poo_ejercicio_10;

import java.util.Arrays;


/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class Poo_Ejercicio_10 {

    public static void main(String[] args) {
//        ServicioArreglos sa = new ServicioArreglos();
//
//        sa.crearArreglo();

        double arreglo1[] = new double[50];
        double arreglo2[] = new double[20];

        for (int i = 0; i < arreglo1.length; i++) {

            Arrays.fill(arreglo1, i, i + 1, Math.random() * 10 + 1);
            //arreglo1[i]=Math.random();

        }
        Arrays.sort(arreglo1);
        System.out.println("Arreglo1: " + Arrays.toString(arreglo1));

        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);

        for (int i = 10; i < 20; i++) {

            arreglo2[i] = 0.5;
        }
        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
    }

}
