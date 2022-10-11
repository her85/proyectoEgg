package poo_ejerciocio_9;

import Entidad.Matematica;
import Servicio.ServicioMatematica;

public class Poo_Ejerciocio_9 {

    public static void main(String[] args) {

        ServicioMatematica sm = new ServicioMatematica();

        Matematica nA = sm.crearNumeros();
        sm.mostrarNumeros(nA);
        System.out.println("El mayor numero"
                + " es: " + sm.devolverMayor(nA));
        sm.calcularPotencia(nA);
        System.out.println("Raiz del menor número = "
                + sm.calcularRaiz(nA));

    }

}
