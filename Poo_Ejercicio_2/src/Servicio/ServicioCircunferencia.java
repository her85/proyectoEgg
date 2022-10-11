/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author hab_8
 */
public class ServicioCircunferencia {
     Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        System.out.println("Radio de la circunferencia");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);
    }

    public void mostraRadio(Circunferencia circulo) {
        System.out.println("Radio: " + circulo.getRadio());

    }

    public double calculoArea(Circunferencia circulo) {

        double area = Math.PI * (circulo.getRadio() * circulo.getRadio());

        return area;
    }

    public double calculoPerimetro(Circunferencia circulo) {

        double perimetro = 2 * Math.PI * circulo.getRadio();

        return perimetro;

    }
    
}
