/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura.
 */
package poo_ejercicio_4;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

public class Poo_Ejercicio_4 {

    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();//creando nuevo objeto de servicio
        Rectangulo rectangulo1 = sr.crearRectangulo();//creando nuevo objeto rectangulo1

        System.out.println(sr.calculoSuperficie(rectangulo1, rectangulo1));
        System.out.println(sr.calculoPerimetro(rectangulo1, rectangulo1));
        sr.dibujarRectangulo(rectangulo1);

    }

}
