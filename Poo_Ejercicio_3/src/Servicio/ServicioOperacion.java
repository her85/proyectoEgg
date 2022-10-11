package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");//evita el salto del enter

    //Creando los numeros para las operaciones
    public Operacion crearOperacion() {
        System.out.println("Primer número");
        double num1 = leer.nextDouble();
        System.out.println("Segundo número");
        double num2 = leer.nextDouble();
        return new Operacion(num1, num2);
    }

    //Método sumar(): calcular la suma de los números y devolver el resultado al main.}
    public double sumar(Operacion num1, Operacion num2) {

        double suma = num1.getNum1() + num2.getNum2();

        return suma;
    }

    //Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar(Operacion num1, Operacion num2) {

        double resta = num1.getNum1() - (num2.getNum2());

        return resta;
    }

    //Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
    public double multiplicar(Operacion num1, Operacion num2) {
        double multiplicacion;
        if (num1.getNum1() != 0 && num2.getNum2() != 0) {
            multiplicacion = num1.getNum1() * num2.getNum2();

        } else {
            multiplicacion = 0;
            System.out.println("Todo número multiplicado por 0 da 0");
        }
        return multiplicacion;
    }

    /*
    Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    public double dividir(Operacion num1, Operacion num2) {
        double division;
        if (num1.getNum1() != 0 && num2.getNum2() != 0) {
            division = num1.getNum1() / num2.getNum2();

        } else {
            division = 0;
            System.out.println("Error");
        }

        return division;
    }
}
