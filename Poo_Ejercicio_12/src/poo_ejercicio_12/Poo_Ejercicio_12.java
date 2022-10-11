package poo_ejercicio_12;

import Entidad.Persona;
import ServicioPersona.ServicioPersona;
import java.util.Scanner;

/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:

 */
public class Poo_Ejercicio_12 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona sp = new ServicioPersona();
        
        Persona persona1 = sp.crearPersona();
        
        System.out.println(persona1);
        
        sp.calcularEdad(persona1);
        
        System.out.println("Edad nueva");
        int edad = leer.nextInt();
        
        System.out.println(persona1.menorQue(edad));
        
        sp.mostrarPersona(persona1);
        
    }
    
}
