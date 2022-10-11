package poo_ejercicio_5;

import Entidad.CuentaBancaria;
import Servicio.ServicioCuentaBancaria;

public class Poo_Ejercicio_5 {

    public static void main(String[] args) {

        ServicioCuentaBancaria scb = new ServicioCuentaBancaria(); //declarando nuevo objeto resumido
        CuentaBancaria cuentaBancaria1 = scb.crearCuentaBancaria(); //creando nueva cuenta bancaria
        scb.ingresar(cuentaBancaria1);
        scb.ingresar(cuentaBancaria1);
        scb.retirar(cuentaBancaria1);
        scb.extraccionRapida(cuentaBancaria1);
        System.out.println(scb.consultarSaldo(cuentaBancaria1));
        scb.consultarDatos(cuentaBancaria1);

    }

}
