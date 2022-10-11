/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

/**
 *
 * @author hab_8
 */
/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class act_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Delarando el vector
        int vector[] = new int[]{20, 1, 33, 100, 101, 4040, 4, 5, 38, 56780, 303};
        for (int i = 0; i < vector.length; i++) {
            System.out.print("(" + vector[i] + ")");

        }
        System.out.println(" ");

       //contadores de digitos
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
        int aux5 = 0;
    
        for (int i = 0; i < vector.length; i++) {
            int contador = 0;//contador del switch
            while (vector[i] != 0) {//hasta que vector sea diferente a 0 repetir
                vector[i] = vector[i] / 10;//si divido x/10 n veces hasta que el result sea 0, n=digitos 
                contador = contador + 1;
            }
            switch (contador) {
                case 1:
                    aux1 = aux1 + 1;
                    break;
                case 2:
                    aux2 = aux2 + 1;
                    break;
                case 3:
                    aux3 = aux3 + 1;
                    break;
                case 4:
                    aux4 = aux4 + 1;
                    break;
                default:
                    aux5 = aux5 + 1;
                    break;
            }

        }
        System.out.println("una cifra " + aux1 + " dos cifras " + aux2 + " tres cifras " + aux3 + " cuatros cifras " + aux4 + " cinco cifras " + aux5);
    }

}
