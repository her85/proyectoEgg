package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    public Cadena crearFrase() {
        Scanner leer = new Scanner(System.in);
        Cadena fI = new Cadena();
        System.out.println("Frase");
        fI.setFrase(leer.nextLine());
        fI.setFrase(fI.getFrase().toLowerCase());
        fI.setLongitud(fI.getFrase().length());

        return fI;
    }

    /*
    Método mostrarVocales(), deberá contabilizar
    la cantidad de vocales que tiene la frase
ingresada.
     */
    public int mostrarVocales(Cadena fI) {
        int vocales = 0;
        char[] frase = fI.getFrase().toCharArray();
        for (int i = 0; i < frase.length; i++) {

            if (frase[i] == 'a' || frase[i] == 'e'
                    || frase[i] == 'i' || frase[i] == 'o'
                    || frase[i] == 'u') {
                vocales += 1;
            }

        }
        return vocales;
    }

    /*
Método invertirFrase(), deberá invertir la frase 
ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena fI) {
        //char [] frase = fI.getFrase().toCharArray();
        String fraseInvertida = "";
        for (int i = fI.getFrase().length() - 1; i >= 0; i--) {

            fraseInvertida = fraseInvertida + fI.getFrase().charAt(i);

        }
        System.out.println(fraseInvertida);
    }

    /*
Método vecesRepetido(String letra), recibirá un 
    carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter 
    en la frase.
     */
    public void vecesRepetido(Cadena fI) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Letra a buscar en la frase");
        String le = leer.next().toLowerCase();
        char letra = le.charAt(0);

        int cont = 0;
        for (int i = 0; i < fI.getFrase().length(); i++) {
            if (letra == fI.getFrase().charAt(i)) {
                cont += 1;
            }
        }
        System.out.println("La letra: " + letra + " se repite " + cont + " veces.");
    }

    /*
    Método compararLongitud(String frase), deberá 
    comparar la longitud de la frase que
compone la clase con otra nueva frase
    ingresada por el usuario.
     */
    public void comparaLongitud(Cadena fI) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Frase para comparar longitud");
        String fraseNueva = leer.nextLine();

        if (fraseNueva.length() == fI.getLongitud()) {
            System.out.println("Misma Longitud");
        } else {
            System.out.println("Longitudes diferentes");
        }

    }

    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public String unirFrases(Cadena fI) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Frase para unir");
        String nuevaFrase = leer.nextLine();

        nuevaFrase = fI.getFrase().concat(nuevaFrase);

        return nuevaFrase;
    }

    /*
    Método reemplazar(String letra), deberá reemplazar 
    todas las letras “a” que se
encuentren en la frase, por algún otro 
    carácter seleccionado por el usuario y mostrar la
frase resultante.  
     */
    public void reemplazar(Cadena fI) {

        Scanner leer = new Scanner(System.in);
        char A = 'a';
        String fraseNueva = fI.getFrase();
        System.out.println("Letra que reemplaze la A en la frase");
        String le = leer.next().toLowerCase();
        char letra = le.charAt(0);

        for (int i = 0; i < fI.getFrase().length(); i++) {

            if (A == fI.getFrase().charAt(i)) {
                fraseNueva = fI.getFrase().replace("a", le);
            }

        }
        System.out.println("" + fraseNueva);
    }

    /*
    Método contiene(String letra), deberá comprobar 
    si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(Cadena fI) {
        Scanner leer = new Scanner(System.in);
        boolean band = false;

        System.out.println("Letra a buscar en la frase");
        String le = leer.next().toLowerCase();
        char letra = le.charAt(0);

        for (int i = 0; i < fI.getFrase().length(); i++) {
            if (letra == fI.getFrase().charAt(i)) {
                band = true;
            }

        }
        return band;
    }

}
