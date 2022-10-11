package poo_ejercicio_4_ex;

import Entidad.Nif;
import Servicio.ServicioNif;

public class Poo_Ejercicio_4_Ex {

    public static void main(String[] args) {
        ServicioNif nf = new ServicioNif();
        Nif nif = nf.crearNif();
        nf.mostrar(nif);

    }

}
