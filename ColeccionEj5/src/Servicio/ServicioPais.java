package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ServicioPais {

    //creo lector de datos por teclado
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //creo Set como Treeset para poder onrdenarlos alfabeticamente
    Set<Pais> paises;

    public ServicioPais() {
        this.paises = new TreeSet();
    }

    //crear paises
    public void crearPais() {
        {

            String respuesta;
            //bucle para crear paises
            do {
                Pais pais = new Pais(); //instancio el objeto pais
                System.out.println("Pais");
                String nombre = leer.next();
                pais.setNombre(nombre);
                paises.add(pais); //lleno el listado de paises con el elemento pais
                System.out.println("Creas otro pais S/N");
                respuesta = leer.next();
            } while (respuesta.equalsIgnoreCase("S"));
        }

    }

    //mostrar listado de paises
    public void mostrarPaises() {
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    /*
    al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
     */
    public void eliminarPais() {
        Iterator<Pais> it = paises.iterator();
        System.out.println("Que pais desea eliminar");
        String nombre = leer.next();

//        while (it.hasNext()) {
//            if (it.next().)
//            
//        }
//
    }
}
