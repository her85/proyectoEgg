package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioPerro {

    private final List<String> razas;

    //guarda razas de perros en un ArrayList de tipo String.
    public ServicioPerro() {
        this.razas = new ArrayList();
    }

//pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
    public void crearPerro() {
        String respuesta, raza;
        boolean salirFuncion = false;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese raza");
        raza = leer.nextLine();
        razas.add(raza);
        do {
            System.out.println("Desea seguir creando razas s/n");
            respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Saliendo");
                salirFuncion = true;
            } else if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Ingrese raza");
                raza = leer.nextLine();
                razas.add(raza);
            } else {
                System.out.println("opcion incorrecta");
            }
        } while (salirFuncion == false);

    }
// Si decide salir, se mostrará todos los perros guardados en el ArrayList.

    public void mostrarPerro() {

        razas.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    /*al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
 Si el perro está en la lista, se eliminará el perro que ingresó el usuario
     */
    public void recorrerLista() {
        Iterator<String> it = razas.iterator();
        Scanner leer = new Scanner(System.in);
        String razaEliminar;
        boolean esta = false;
        System.out.println("Ingrese una raza a eliminar");
        razaEliminar = leer.nextLine();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(razaEliminar)) {
                it.remove();
                esta = true;
            }
        }
        if (esta != true) {
            System.out.println("La raza no esta en la lista");
        }
    }

    /*
    se mostrará la lista ordenada.
     */
    public void ordenarLista() {
        Collections.sort(razas);
    }

}
