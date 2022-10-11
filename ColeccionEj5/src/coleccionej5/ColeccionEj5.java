package coleccionej5;

import Servicio.ServicioPais;

public class ColeccionEj5 {

    public static void main(String[] args) {
        ServicioPais sp = new ServicioPais();

        sp.crearPais();
        sp.mostrarPaises();
        sp.eliminarPais();
        System.out.println("---------");
        sp.mostrarPaises();
    }

}
