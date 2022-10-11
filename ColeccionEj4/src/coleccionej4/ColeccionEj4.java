package coleccionej4;

import Servicio.ServicioPelicula;

public class ColeccionEj4 {

    public static void main(String[] args) {

        ServicioPelicula sp = new ServicioPelicula();

        sp.crearPelicula();
        sp.mostrarPeliculas();
        System.out.println("---------");
        System.out.println("Peliculas mayor con duracion mayor a 1 hora");
        System.out.println("");
        sp.mostrarPeliMayorUno();
        System.out.println("Orden de mayor a menor duracion");
        System.out.println("");
        sp.ordenarPeliMayor();
        System.out.println("Orden de menor a mayor duracion");
        System.out.println("");
        sp.ordenarPeliMenor();
        System.out.println("Ordenadas por titulo");
        System.out.println("");
        sp.ordenarTitulo();
        System.out.println("Ordenadas por Director");
        System.out.println("");
        sp.ordenarDirector();
    }

}
