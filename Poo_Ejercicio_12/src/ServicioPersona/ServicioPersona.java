package ServicioPersona;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/*
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.


 */
public class ServicioPersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Nombre");
        String nombre = leer.nextLine();
        System.out.println("Año");
        int anio = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Día");
        int dia = leer.nextInt();

        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fechaNacimiento);
    }

    /*
    • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
     */
    public void calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        System.out.println("Su edad es: " + (fechaActual.getYear() - persona.getFechaNacimiento().getYear()));

    }

    /*
    
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
     */
    public void mostrarPersona(Persona persona) {

        System.out.println(persona.toString());
    }

}
