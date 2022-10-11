
package poo_ejercicio_3;

import Entidad.Operacion;
import Servicio.ServicioOperacion;


public class Poo_Ejercicio_3 {

    
    public static void main(String[] args) {
        ServicioOperacion so = new ServicioOperacion();
        Operacion Operacion1 = so.crearOperacion();
        
        System.out.println(so.sumar(Operacion1, Operacion1));
        System.out.println(so.restar(Operacion1, Operacion1));
        System.out.println(so.multiplicar(Operacion1, Operacion1));
        System.out.println(so.dividir(Operacion1, Operacion1));
    }

}
