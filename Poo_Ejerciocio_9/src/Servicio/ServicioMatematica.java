package Servicio;

import Entidad.Matematica;
import Utilidad.Utilidad;

public class ServicioMatematica {

    public Matematica crearNumeros() {

        Matematica nA = new Matematica();

        nA.setNum1(Math.random() * 10);
        nA.setNum2(Math.random() * 10);

        return nA;
    }

    public void mostrarNumeros(Matematica nA) {

        System.out.println(nA.getNum1());
        System.out.println(nA.getNum2());
    }

    /*
    Método devolverMayor() para retornar 
    cuál de los dos atributos tiene el mayor valor
     */
    public double devolverMayor(Matematica nA) {

        double mayor;
        if (nA.getNum1() > nA.getNum2()) {
            mayor = nA.getNum1();
        } else {
            mayor = nA.getNum2();
        }

        return mayor;
    }

    /*
Método calcularPotencia() para calcular la potencia del
mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
     */
    public void calcularPotencia(Matematica nA) {

        Utilidad.redondeo(nA);
        double mayor = Math.max(nA.getNum1(), nA.getNum2());
        double menor = Math.min(nA.getNum1(), nA.getNum2());
        double potencia = Math.pow(mayor, menor);

        System.out.println("La potencia de: " + mayor
                + " elevado a " + menor + " es: " + potencia);

    }

    /*
    Método calculaRaiz(), 
    para calcular la raíz cuadrada del menor 
    de los dos valores.
Antes de calcular la raíz cuadrada 
    se debe obtener el valor absoluto del número.
     */
    public double calcularRaiz(Matematica nA) {
        double raiz;

        double menor = Math.min(nA.getNum1(), nA.getNum2());
        Utilidad.valorAbsoluto(menor);

        raiz = Math.sqrt(menor);

        return raiz;
    }
}
