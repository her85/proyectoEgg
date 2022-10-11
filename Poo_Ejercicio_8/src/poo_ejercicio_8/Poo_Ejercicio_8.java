                                    package poo_ejercicio_8;

import Entidad.Cadena;
import Servicio.ServicioCadena;

public class Poo_Ejercicio_8 {

    public static void main(String[] args) {
        ServicioCadena sc = new ServicioCadena();

        Cadena frase = sc.crearFrase();
        System.out.println(frase.toString());
        System.out.println(sc.mostrarVocales(frase));
        sc.invertirFrase(frase);
        sc.vecesRepetido(frase);
        sc.comparaLongitud(frase);
        System.out.println(sc.unirFrases(frase));
        sc.reemplazar(frase);
        System.out.println(sc.contiene(frase));
    }

}
