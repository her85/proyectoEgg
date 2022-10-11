package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    /*
        Metodo crearPersona(): el método crear persona, 
    le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos 
    atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido
    sea correcto, es decir, H, M o O.
    Si no es correcto se deberá mostrar un mensaje.
     */
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean band = false;
        System.out.println("Nombre y Apellido");
        String nombre = leer.nextLine();
        System.out.println("Edad");
        int edad = leer.nextInt();

        System.out.println("Eliga su sexo, M(masculino),"
                + "F(femenino) y O(otros)");
        String sexo = leer.next();

        while (band != true) {
            if (sexo.equalsIgnoreCase("M")) {
                band = true;
            } else if (sexo.equalsIgnoreCase("F")) {
                band = true;
            } else if (sexo.equalsIgnoreCase("O")) {
                band = true;
            } else {
                System.out.println("Incorrecto");
                System.out.println("Eliga su sexo, M(masculino),"
                        + "F(femenino) y O(otros)");
                sexo = leer.next();
            }
        }
        System.out.println("Ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    /*
    Método calcularIMC(): calculara si la persona está en 
    su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado 
    un valor menor que 20, significa
que la persona está por debajo de su peso ideal 
    y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos)
    , significa que la persona
está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa 
    que la persona tiene sobrepeso, y la
función devuelve un 1.
     */
    public int calcularIMC(Persona peso, Persona altura) {
        int IMC;
        double result;

        result = peso.getPeso()
                / (altura.getAltura() * altura.getAltura());

        if (result < 20) {
            IMC = -1;
            // System.out.println("Por debajo del peso ideal");
        } else if (result >= 20 || result <= 25) {
            IMC = 0;
            //System.out.println("Peso ideal");
        } else {
            IMC = 1;
            // System.out.println("Sobrepeso");
        }

        return IMC;
    }

    /*
    Método esMayorDeEdad(): indica si la 
    persona es mayor de edad. La función devuelve
un booleano.
     */
    public boolean esMayorDeEdad(Persona edad) {
        boolean band = true;

        if (edad.getEdad() < 21) {
            band = false;
        }

        return band;
    }

    /*
    Metodo para calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, 
    cuantas en su peso ideal y cuantos, por encima.
     */
    public void porcentajePeso(int IMC1, int IMC2,
            int IMC3, int IMC4) {
        int contDP = 0;
        int contPI = 0;
        int contSP = 0;
        int vector[] = {IMC1, IMC2, IMC3, IMC4};

        for (int i = 0; i < vector.length; i++) {
            switch (vector[i]) {
                case -1:
                    contDP += 1;
                    break;
                case 0:
                    contPI += 1;
                    break;
                default:
                    contSP += 1;
                    break;
            }
        }
        System.out.println("Personas por debajo de su peso: "
                + (contDP / 0.04) + "%, peso ideal: "
                + (contPI / 0.04)
                + "% y con sobrepeso: " + (contSP / 0.04));
    }

    /*
    Metodo para calcular un porcentaje de cuantos 
    son mayores de edad y cuantos menores.
     */
    public void porcentajeMayorDeEdad(boolean mayorEdad1,
            boolean mayorEdad2, boolean mayorEdad3,
            boolean mayorEdad4) {
        int contMenor = 0;
        int contMayor = 0;
        boolean vector[] = {mayorEdad1, mayorEdad2,
            mayorEdad3, mayorEdad4};

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == false) {
                contMenor += 1;
            } else {
                contMayor += 1;
            }
        }
        System.out.println("Personas mayores de edad: "
                + (contMayor / 0.04)
                + "% y menores de edad: "
                + (contMenor / 0.04) + "%");
    }

}
