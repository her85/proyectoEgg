
package Servicio;

import Entidad.Libro;
import java.util.Scanner;


public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");//evita el salto del enter

    public Libro crearLibro() {

        System.out.println("Codigo del libro");
        int ISBN = leer.nextInt();
        System.out.println("Titulo");
        String titulo = leer.next();
        System.out.println("Autor");
        String autor = leer.next();
        System.out.println("Cantidad de paginas");
        int numeroPaginas = leer.nextInt();

        return new Libro(ISBN, titulo, autor, numeroPaginas);

    }

    public void mostrarLibro(Libro Libro) {

        System.out.println("Codigo:" + Libro.getISBN());
        System.out.println("Titulo:" + Libro.getTitulo());
        System.out.println("Autor:" + Libro.getAutor());
        System.out.println("Paginas:" + Libro.getNumeroPaginas());
    }
}
