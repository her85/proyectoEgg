package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {

    /*
    Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
     */
//    public static Comparator<Pelicula> duracionMayor = new Comparator<Pelicula>() {
//        @Override
//        public int compare(Pelicula t, Pelicula t1) {
//            return t1.getHoras().compareTo(t.getHoras());
//        }
//    };
    public static Comparator<Pelicula> duracionMayor = (Pelicula t, Pelicula t1) -> t1.getHoras().compareTo(t.getHoras());

    /*
    Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
     */
    public static Comparator<Pelicula> duracionMenor = (Pelicula t, Pelicula t1) -> t.getHoras().compareTo(t1.getHoras());

    /*
      Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public static Comparator<Pelicula> ordenarTitulo = (Pelicula t, Pelicula t1) -> t.getTitulo().compareTo(t1.getTitulo());
    /*
    Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public static Comparator<Pelicula> ordenarDirector = (Pelicula t, Pelicula t1) -> t.getDirector().compareTo(t1.getDirector());
}
