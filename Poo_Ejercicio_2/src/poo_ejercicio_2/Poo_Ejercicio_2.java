/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_2;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

/**
 *
 * @author hab_8
 */
public class Poo_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCircunferencia s2 = new ServicioCircunferencia();

        Circunferencia circulo1 = s2.crearCircunferencia();

        s2.mostraRadio(circulo1);

        System.out.println(s2.calculoArea(circulo1));
        System.out.println(s2.calculoPerimetro(circulo1));

    }

}
