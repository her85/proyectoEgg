package Servicio;

import Entidad.Raices;
import java.util.Scanner;

public class ServicioRaices {

    public Raices crearCoeficientes() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes a,b y c");
        int coeficienteA = leer.nextInt();
        int coeficienteB = leer.nextInt();
        int coeficienteC = leer.nextInt();
        return new Raices(coeficienteA, coeficienteB, coeficienteC);
    }

    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double valorDiscriminante(Raices raices) {
        double discriminante;

        discriminante = ((Math.pow(raices.getCoeficienteB(), 2)) - 4 * raices.getCoeficienteA() * raices.getCoeficienteC());

        return discriminante;
    }

    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices raices) {

        boolean tiene = valorDiscriminante(raices) > 0;

        return tiene;
    }

    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices raices) {

        boolean tiene = valorDiscriminante(raices) == 0;

        return tiene;
    }

    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
     */
    public void obtenerRaices(Raices raices) {

        if (tieneRaices(raices) == true) {
            double solucion1 = -(raices.getCoeficienteB() + (Math.sqrt(valorDiscriminante(raices))));
            double solucion2 = -(raices.getCoeficienteB() - (Math.sqrt(valorDiscriminante(raices))));
            System.out.println("Solución 1: " + solucion1);
            System.out.println("Solución 2: " + solucion2);
        }
    }

    /*
    • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices) == true) {

            System.out.println("Solo posee una solución");

        }

    }

    /*
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
     */
    public void calcular(Raices raices) {

        System.out.println(tieneRaices(raices));
        System.out.println(tieneRaiz(raices));
        obtenerRaices(raices);
        obtenerRaiz(raices);
        if (tieneRaices(raices) == false && tieneRaiz(raices) == false) {
            System.out.println("No hay solución");
        }

    }

}
