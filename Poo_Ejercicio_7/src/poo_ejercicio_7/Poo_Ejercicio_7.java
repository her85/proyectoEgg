package poo_ejercicio_7;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class Poo_Ejercicio_7 {

    public static void main(String[] args) {

        //Instanciando servicio
        ServicioPersona sp = new ServicioPersona();

        Persona persona1 = sp.crearPersona();
        Persona persona2 = sp.crearPersona();
        Persona persona3 = sp.crearPersona();
        Persona persona4 = sp.crearPersona();

        //System.out.println(sp.calcularIMC(persona1, persona1));
        int IMC1 = sp.calcularIMC(persona1, persona1);

        boolean mayorDeEdad1 = sp.esMayorDeEdad(persona1);

        //System.out.println(sp.calcularIMC(persona2, persona2));
        int IMC2 = sp.calcularIMC(persona2, persona2);
        boolean mayorDeEdad2 = sp.esMayorDeEdad(persona2);

        //System.out.println(sp.calcularIMC(persona3, persona3));
        int IMC3 = sp.calcularIMC(persona3, persona3);
        boolean mayorDeEdad3 = sp.esMayorDeEdad(persona3);

        //System.out.println(sp.calcularIMC(persona4, persona4));
        int IMC4 = sp.calcularIMC(persona4, persona4);
        boolean mayorDeEdad4 = sp.esMayorDeEdad(persona4);

        sp.porcentajePeso(IMC1, IMC2, IMC3, IMC4);
        sp.porcentajeMayorDeEdad(mayorDeEdad1, mayorDeEdad2,
                mayorDeEdad3, mayorDeEdad4);
    }

}
