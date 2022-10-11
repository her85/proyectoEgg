package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera() {
        double capacidadMaxima = 100.0;
        double cantidadActual = 0;
        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public double llenarCafetera(Cafetera capacidadMaxima, Cafetera cantidadActual) {
        
        cantidadActual.setCantidadActual(capacidadMaxima.getCapacidadMaxima());
        return cantidadActual.getCantidadActual();
    }

    /*
        Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
     */
    public void servirTaza(Cafetera cantidadActual) {
        
        System.out.println("Tamaño de la taza vacia");
        double tazaVacia = leer.nextDouble();
        
        if (tazaVacia == cantidadActual.getCantidadActual()) {
            System.out.println("Taza llena");
            cantidadActual.setCantidadActual(cantidadActual.getCantidadActual() - tazaVacia);
        } else if (tazaVacia > cantidadActual.getCantidadActual()) {
            tazaVacia -= cantidadActual.getCantidadActual();
            System.out.println("La taza no se lleno, faltan " + tazaVacia + " ml");
            cantidadActual.setCantidadActual(0);
        } else {
            cantidadActual.setCantidadActual(cantidadActual.getCantidadActual() - tazaVacia);
        }
        
        System.out.println("La cafetera tiene " + cantidadActual.getCantidadActual() + " ml de cafe");
    }

    /*
    Método vaciarCafetera(): pone la cantidad de café actual en cero.
     */
    public double vaciarCafetera(Cafetera cantidadActual) {
        cantidadActual.setCantidadActual(0);
        return cantidadActual.getCantidadActual();
    }

    /*
        Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.
     */
    public void agregarCafe(Cafetera cantidadActual, Cafetera capacidadMaxima) {
        boolean band = false;
        System.out.println("Cantidad de cafe para agregar a la cafetera");
        double cafeAgregar = leer.nextDouble();
        
        if (cafeAgregar > capacidadMaxima.getCapacidadMaxima()) {
            System.out.println("La cantidad supera la capacidad maxima de la cafetera");
        } else if (cafeAgregar > cantidadActual.getCantidadActual() && cafeAgregar <= capacidadMaxima.getCapacidadMaxima()) {
            cantidadActual.setCantidadActual(cantidadActual.getCantidadActual() + cafeAgregar);
            
            if (cantidadActual.getCantidadActual() <= capacidadMaxima.getCapacidadMaxima()) {
                System.out.println("Se lleno la cafetera con " + cantidadActual.getCantidadActual() + " ml de cafe");
            } else {
                System.out.println("No se puede ingresar esa cantidad de cafe, se rebalsa la cafetera");
            }
        } else {
            cantidadActual.setCantidadActual(cantidadActual.getCantidadActual() + cafeAgregar);
            
            if (cantidadActual.getCantidadActual() <= capacidadMaxima.getCapacidadMaxima()) {
                System.out.println("Se lleno la cafetera con " + cantidadActual.getCantidadActual() + " ml de cafe");
                band = true;
            } else {
                System.out.println("No se puede ingresar esa cantidad de cafe, se rebalsa la cafetera");
                cantidadActual.setCantidadActual(0);
            }
        }
        System.out.println("La cafetera tiene " + cantidadActual.getCantidadActual() + " ml de cafe");
    }
    
}
