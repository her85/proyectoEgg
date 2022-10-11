/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1.servicios;

import java.util.Scanner;
import poo_1.Entidades.Automovil;

/**
 *
 * @author hab_8
 */
public class ServiciosAutomovil {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");//evita el salto del enter

    public Automovil crearAutomovil() {

        System.out.println("Ingrese marca y modelo");
        String marcaModelo = leer.next();
        System.out.println("Ingrese color");
        String color = leer.next();
        System.out.println("Año");
        int anio = leer.nextInt();
        System.out.println("Sector del daño");
        String danio = leer.next();

        //Automovil auto1 = new Automovil(marcaModelo, color, 0, danio);
        return new Automovil(marcaModelo, color, anio, danio);

        //return auto1;
    }

}
