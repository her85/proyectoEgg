package poo_ejercicio_ex_6;

import Entidad.Ahorcado;
import Servicio.ServicoAhorcado;

public class Poo_Ejercicio_Ex_6 {

    public static void main(String[] args) {
        ServicoAhorcado sa = new ServicoAhorcado();
        Ahorcado ahorcado = sa.crearJuego();
        sa.juego(ahorcado);

    }

}
