package Servicio;

import Entidad.Tiempo;
import java.util.Scanner;

public class ServicioTiempo {

    /*
    Metodo para ingresar hora,minutos y segundos por el usuario.
     */
    public Tiempo crearTiempo() {
        Scanner leer = new Scanner(System.in);
        int hora = 0;
        int minuto = 0;
        int segundo = 0;
        do {
            System.out.println("Ingrese la hora");
            hora = leer.nextInt();
        } while (hora < 0 || hora > 24);
        do {
            System.out.println("Minutos");
            minuto = leer.nextInt();
        } while (minuto < 0 || minuto > 60);

        do {
            System.out.println("Segundos");
            segundo = leer.nextInt();

        } while (segundo < 0 || segundo > 60);

        return new Tiempo(hora, minuto, segundo);

    }

    /*
    Mostrar tiempo
     */
    public void mostrarTiempo(Tiempo tiempo) {
        System.out.println(tiempo.toString());
    }
}
