package poo_ejercicio_1;

import Entidad.Libro;
import Servicio.ServicioLibro;

public class Poo_Ejercicio_1 {

    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();

        Libro Libro1 = sl.crearLibro();

        sl.mostrarLibro(Libro1);
    }

}
