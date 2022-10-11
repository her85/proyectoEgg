/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;

//import java.util.Scanner;
import poo_1.Entidades.Automovil;//importar entidad
import poo_1.servicios.ServiciosAutomovil;//importa servicio, funcion crear auto
//import poo_1.Entidades.Personas;//importar entidad

/**
 *
 * @author hab_8
 */
public class Poo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);

        //Objeto persona
        //Personas persona1 = new Personas();
        //Personas persona2 = new Personas();
        //Objeto automovil
        //Automovil auto1 = new Automovil();
        //Automovil auto2 = new Automovil();
        ServiciosAutomovil sa = new ServiciosAutomovil();

        Automovil auto1 = sa.crearAutomovil();

        System.out.println(auto1.toString());
        
        //auto1=null; elimina el objeto de la memoria
    }

}
