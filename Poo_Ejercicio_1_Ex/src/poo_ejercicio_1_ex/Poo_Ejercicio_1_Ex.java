package poo_ejercicio_1_ex;

import Entidad.Pass;
import Servicio.ServicioPass;

public class Poo_Ejercicio_1_Ex {
    
    public static void main(String[] args) {
        ServicioPass sp = new ServicioPass();
        
        Pass pass = new Pass("", "Juan", 13234555);
        sp.crearPass(pass);
        System.out.println("Nivel de contraseña " + sp.analizarPass(pass));
        sp.menu(pass);
    }
    
}
