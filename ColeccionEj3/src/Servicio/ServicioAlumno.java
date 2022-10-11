package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //creo la lista de alumnos
    List<Alumno> alumnos;

    public ServicioAlumno() {
        this.alumnos = new ArrayList();
    }

    public void crearAlumno() {
        String respuesta;
        boolean entero = false;
        //un bucle que crea un objeto Alumno.
        do {
            Alumno a1 = new Alumno(); //creo un alumno

            List<Integer> listaNotas = new ArrayList();
            System.out.println("Nombre del alumno");
            String nombre = leer.next();
            a1.setNombre(nombre);
            do {
                System.out.println("Nota 1");
                int nota1 = leer.nextInt();
                if (nota1 > 100 || nota1 < 0) {
                    entero = true;
                }
                listaNotas.add(nota1);

            } while (entero == true);
            entero = false;
            do {
                System.out.println("Nota 2");
                int nota2 = leer.nextInt();
                listaNotas.add(nota2);
            } while (entero == true);
            entero = false;
            do {
                System.out.println("Nota 3");
                int nota3 = leer.nextInt();
                listaNotas.add(nota3);
            } while (entero == true);

            //lleno la lista de notas
            a1.setListaNotas(listaNotas);

            alumnos.add(a1); //Agrego el objeto alumno a la lista alumnos.
            System.out.println("Desea crear otro alumno S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    //for each (para cada) objeto de la lista alumno
    public void mostraAlumnos() {
        alumnos.forEach((alumno) -> {
            System.out.println(alumno);
        });
    }

    public void mostrarNotaFinal() {

        System.out.println("De que alumno desea calcular la nota final");
        String nombre = leer.next();
        /*
             El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos.
         */
        alumnos.stream().filter((alumno) -> (alumno.getNombre().equalsIgnoreCase(nombre))).forEachOrdered((alumno) -> {
            /*
 Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
             */
            System.out.println("La nota final es: " + alumno.notaFinal());
        });

        /*
        for (Alumno alumno : alumnos) {
        if(alumno.getNombre().equalsIgnoreCase(nombre){
        System.out.println("La nota final es: " + alumno.notaFinal());
            }
        }
         */
    }

}
