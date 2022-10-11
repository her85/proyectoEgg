package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class ServicoAhorcado {

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
     */
    public Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Palabra a buscar");
        String frase = leer.nextLine();
        String[] palabra = new String[frase.length()];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = frase.substring(i, i + 1);
        }
        int faltanEncontrar = palabra.length;
        System.out.println("Jugadas maximas permitidas");
        int jugadasMaximas = leer.nextInt();

        return new Ahorcado(palabra, 0, jugadasMaximas, faltanEncontrar);
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
     */
    public void longitud(Ahorcado ahorcado) {

        System.out.println("La longitud de la palabra es: " + ahorcado.getPalabra().length);

    }

    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(String letra, Ahorcado ahorcado) {

        for (String palabra : ahorcado.getPalabra()) {
            if (Arrays.toString(ahorcado.getPalabra()).contains(letra)) {
                System.out.println("Letra: " + letra + " encontrada");
                break;
            } else {
                System.out.println("No se encontro la letra: " + letra);
                break;
            }
        }

    }

    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public void encontradas(String letra, Ahorcado ahorcado) {
        boolean encontrada = true;
        int contador = 0;

        for (String palabra : ahorcado.getPalabra()) {
            if (Arrays.toString(ahorcado.getPalabra()).contains(letra)) {
                contador += 1;

                break;
            } else {
                encontrada = false;
                break;
            }

        }

        ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + contador);
        System.out.println("Letras encontradas: " + ahorcado.getLetrasEncontradas());
        ahorcado.setFaltanEncontrar(ahorcado.getFaltanEncontrar() - contador);
        System.out.println("Faltan: " + ahorcado.getFaltanEncontrar() + " letras");
        if (encontrada == false) {
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);
        }
    }

    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public void intentos(Ahorcado ahorcado) {

        System.out.println("Te quedan: " + ahorcado.getJugadasMaximas() + " intentos");
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
     */
    public void juego(Ahorcado ahorcado) {
        Scanner leer = new Scanner(System.in);

        longitud(ahorcado);
        do {
            System.out.println("Letra a buscar");
            String letra = leer.nextLine();
            buscar(letra, ahorcado);
            encontradas(letra, ahorcado);
            intentos(ahorcado);
        } while (ahorcado.getJugadasMaximas() > 0
                && ahorcado.getLetrasEncontradas() != ahorcado.getPalabra().length);
        if (ahorcado.getJugadasMaximas() == 0) {
            System.out.println("Perdiste, no te quedan intentos");
        } else {
            System.out.println("Ganaste");
        }
    }
}
