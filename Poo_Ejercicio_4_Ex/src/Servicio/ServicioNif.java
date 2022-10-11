package Servicio;

import Entidad.Nif;
import java.util.Scanner;

public class ServicioNif {

    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
     */
    public Nif crearNif() {
        Scanner leer = new Scanner(System.in);
        String[] verificador = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.println("Número de DNI");
        long DNI = leer.nextLong();

        long resto = (DNI % 23);
        long resultado = Math.round(resto);
        String letra = "";
        for (int i = 0; i < verificador.length; i++) {
            if (resultado == i) {
                letra = verificador[i];
                break;
            }
        }
        if (letra.equals("")) {
            System.out.println("Error");
        }

        return new Nif(DNI, letra);
    }

    /*
    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
     */
    public void mostrar(Nif nif) {

        System.out.println(nif.getDNI() + "-" + nif.getLetra());
    }

}
