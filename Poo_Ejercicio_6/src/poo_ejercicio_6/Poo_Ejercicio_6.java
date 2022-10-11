package poo_ejercicio_6;

import Entidad.Cafetera;
import Servicio.ServicioCafetera;

public class Poo_Ejercicio_6 {

    public static void main(String[] args) {
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera nuevaCafetera = sc.crearCafetera();
        System.out.println("Capacidad maxima de la cafetera: " + nuevaCafetera.getCapacidadMaxima() + " ml");
        System.out.println("Capacidad actual de la cafetera: " + nuevaCafetera.getCantidadActual() + " ml");
        System.out.println("Se lleno la cafetera, capacidad actual: " + sc.llenarCafetera(nuevaCafetera, nuevaCafetera) + " ml");
        System.out.println("---------------");
        sc.servirTaza(nuevaCafetera);

        sc.agregarCafe(nuevaCafetera, nuevaCafetera);
        sc.vaciarCafetera(nuevaCafetera);
    }

}
