package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServicioPelicula {

    //creo input
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //creo lista
    List<Pelicula> peliculas;

    public ServicioPelicula() {
        this.peliculas = new ArrayList();
    }

    //crea peliculas
    public void crearPelicula() {
        String respuesta;
        //bucle para crear peliculas
        do {
            Pelicula peli = new Pelicula(); //instancio el objeto pelicula
            System.out.println("Titulo");
            String titulo = leer.next();
            peli.setTitulo(titulo);
            System.out.println("Director");
            String director = leer.next();
            peli.setDirector(director);
            System.out.println("Duración de la pelicula");
            System.out.println("horas");
            Integer horas = leer.nextInt();
            peli.setHoras(horas);
            System.out.println("minutos");
            Integer minutos = leer.nextInt();
            peli.setMinutos(minutos);
            peliculas.add(peli); //lleno el listado de peliculas con el elemento pelicula
            System.out.println("Creas otra pelicula S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    //mostrar listado de peliculas
    public void mostrarPeliculas() {

        peliculas.stream().map((pelicula) -> {
            System.out.println("[" + pelicula + "]");
            return pelicula;
        }).forEachOrdered((_item) -> {
            System.out.println("");
        });
        System.out.println("-------------");
    }

    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliMayorUno() {
        boolean tiene = false;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getHoras() >= 1 && pelicula.getMinutos() >= 1) {
                System.out.println("[" + pelicula + "]");
                tiene = true;
                System.out.println("--------------");
            }
        }
        if (tiene == false) {
            System.out.println("No hay peliculas de duracion mayor a 1 hora");
        }

    }

    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void ordenarPeliMayor() {
        Collections.sort(peliculas, Comparadores.duracionMayor);
        mostrarPeliculas();
    }

    /*
    Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
    
     */
    public void ordenarPeliMenor() {
        Collections.sort(peliculas, Comparadores.duracionMenor);
        mostrarPeliculas();
    }

    /*
      Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarTitulo() {
        Collections.sort(peliculas, Comparadores.ordenarTitulo);
        mostrarPeliculas();
    }

    /*
    Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarDirector() {
        Collections.sort(peliculas, Comparadores.ordenarDirector);
        mostrarPeliculas();
    }
}
