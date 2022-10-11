package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Creando Rectangulo/base y altura
    public Rectangulo crearRectangulo() {
        System.out.println("Base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Altura del rectangulo");
        int altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }

    /*
        Método para calcular la superficie del rectángulo
     */
    public int calculoSuperficie(Rectangulo base, Rectangulo altura) {
        int superficie;
        superficie = base.getBase() * altura.getAltura();
        return superficie;
    }

    //Método para calcular el perímetro del rectángulo
    public int calculoPerimetro(Rectangulo base, Rectangulo altura) {
        int perimetro;
        perimetro = (base.getBase() + altura.getAltura()) * 2;
        return perimetro;
    }

    //Método que dibujará el rectángulo mediante asteriscos usando la base y la
    //altura.
    public void dibujarRectangulo(Rectangulo rectangulo) {

        for (int i = 0; i < rectangulo.getBase(); i++) {

            System.out.print("*");
        }
        System.out.println("");
        for (int j = 0; j < rectangulo.getAltura()-2; j++) {
            System.out.print("*");
            for (int i = 0; i < rectangulo.getAltura()-rectangulo.getBase(); i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < rectangulo.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
