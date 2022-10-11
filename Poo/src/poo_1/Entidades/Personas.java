/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1.Entidades;

/**
 *
 * @author hab_8
 */
public class Personas {

    //Atributos privados// variables
    private String nombre;
    private String automovilTipo;
    private String patente;

    private int monto = 0; //constante

    //Constructor vacio
    public Personas() {

        monto = 0;
    }

    //Constructor con atributoss
    public Personas(String nombre, String automovilTipo, String patente) {
        this.nombre = nombre;
        this.automovilTipo = automovilTipo;
        this.patente = patente;
        this.monto = 0;
    }

    //Funcionalidades
    /**
     * funcion de monto a pagar
     *
     * @param montoAbonar
     * @return monto
     */
    public int valor(int montoAbonar) {
        monto = monto + montoAbonar;
        monto += montoAbonar;
        return monto;
    }

    //Setter's
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutomovilTipo(String automovilTipo) {
        this.automovilTipo = automovilTipo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    //Getter's
    public String getNombre() {
        return nombre;
    }

    public String getAutomovilTipo() {
        return automovilTipo;
    }

    public String getPatente() {
        return patente;
    }

    //toString
    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", automovilTipo=" + automovilTipo + ", patente=" + patente + ", monto=" + monto + '}';
    }

}
