package cooleccionej_1;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
 */
import Servicio.ServicioPerro;

public class CooleccionEj_1 {

    public static void main(String[] args) {

        ServicioPerro sp = new ServicioPerro();

        sp.crearPerro();
        sp.mostrarPerro();
        sp.recorrerLista();
        sp.ordenarLista();
        System.out.println("----------");
        System.out.println("Lista ordenada");
        sp.mostrarPerro();
    }

}
