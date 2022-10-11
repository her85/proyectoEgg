package poo_ejercicio_ex_3;

import Entidad.Raices;
import Servicio.ServicioRaices;

public class Poo_Ejercicio_Ex_3 {

    public static void main(String[] args) {

        ServicioRaices sr = new ServicioRaices();
        Raices raices = sr.crearCoeficientes();
        System.out.println(raices.toString());
        System.out.println(sr.valorDiscriminante(raices));
        sr.calcular(raices);

    }

}
