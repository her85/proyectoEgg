package Utilidad;

import Entidad.Matematica;

public class Utilidad {

    /*
    redondear valores.
     */
    public static void redondeo(Matematica nA) {

        nA.setNum1(Math.round(nA.getNum1()));
        nA.setNum2(Math.round(nA.getNum2()));
        System.out.println(nA.getNum1());
        System.out.println(nA.getNum2());
    }

    /*
    valor absoluto del número.
     */
    public static double valorAbsoluto(double menor) {
        double absolut = Math.abs(menor);

        return absolut;
    }

}
