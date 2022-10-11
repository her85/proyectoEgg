package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuentaBancaria {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Creando cuenta bancaria por pantalla
    public CuentaBancaria crearCuentaBancaria() {
        System.out.println("Numero de cuenta");
        int numeroDeCuenta = leer.nextInt();
        System.out.println("Número de DNI");
        int DNI = leer.nextInt();
        int saldoActual = 0;
        return new CuentaBancaria(numeroDeCuenta, DNI, saldoActual);
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    public void ingresar(CuentaBancaria saldoActual) {
        int saldoIngresar;
        System.out.println("Saldo a ingresar");
        saldoIngresar = leer.nextInt();
        //int saldo=saldoIngresar+saldoActual.getSaldoActual();
        saldoActual.setSaldoActual(saldoActual.getSaldoActual() + saldoIngresar);//modifico el saldo a traves del get y saldo ingresado

        System.out.println("El saldo actual es: " + saldoActual.getSaldoActual());

    }

    //    Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
    //restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
    //saldo actual en 0.
    public void retirar(CuentaBancaria saldoActual) {
        int saldoRetirar;
        System.out.println("Saldo a retirar");
        saldoRetirar = leer.nextInt();

        //validando que el saldo a retirar no se mayor al actual
        if (saldoActual.getSaldoActual() > saldoRetirar) {
            saldoActual.setSaldoActual(saldoActual.getSaldoActual() - saldoRetirar);
            System.out.println("\"El saldo actual es: " + saldoActual.getSaldoActual());

            //mensaje saldo insuficiente para retirar    
        } else {
            System.out.println("Saldo insuficiente, su saldo es: " + saldoActual.getSaldoActual());
        }

    }

    //    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria saldoActual) {
        int extraccionRapida;
        double porcentaje;
        System.out.println("Opción extraccion rapida");
        extraccionRapida = leer.nextInt();

        porcentaje = saldoActual.getSaldoActual() * 0.2;

        //validando porcentaje permitido a extraer 20% o menos
        if (extraccionRapida <= porcentaje) {
            saldoActual.setSaldoActual(saldoActual.getSaldoActual() - extraccionRapida);
            System.out.println("\"El saldo actual es: " + saldoActual.getSaldoActual());
            //mensaje de no permiso        
        } else {
            System.out.println("No puedes retirar mas del 20%, su saldo es: " + saldoActual.getSaldoActual());
        }
    }

    //    Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public int consultarSaldo(CuentaBancaria saldoActual) {

        return saldoActual.getSaldoActual();

    }

    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(CuentaBancaria cuentaBancaria) {

        System.out.println(cuentaBancaria.toString());

    }
}
