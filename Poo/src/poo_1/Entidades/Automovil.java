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
public class Automovil {

    //Atributos privados// variables
    private String marcaModelo;
    private String color;
    private int anio;
    private String danio;

    private int reparacion;// constante

    //Constructor vacio
    public Automovil() {
        reparacion = 0;
    }

    //Constructor con atributos
    public Automovil(String marcaModelo, String color, int anio, String danio) {
        this.marcaModelo = marcaModelo;
        this.color = color;
        this.anio = anio;
        this.danio = danio;
        this.reparacion = 0;
    }

    //Funcionalidades
    /**
     * funcion para reparar(ver booleno)
     *
     * @param reparacionSumar
     * @return reparacion
     */
    public int reparado(int reparacionSumar) {

        //reparacion = reparacion + reparacionSumar;
        reparacion += reparacionSumar;
        return reparacion;
    }

    //Sobrecarga de metodo(funcion)
    /**
     * funcion para reparar en ampliacion
     *
     * @param reparacionSumar
     * @param ampliacion
     * @return reparacion
     */
    public int reparado(int reparacionSumar, int ampliacion) {

        //reparacion = reparacion + reparacionSumar;
        reparacion += reparacionSumar + ampliacion;
        return reparacion;
    }

    //Setter's
    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDanio(String danio) {
        this.danio = danio;
    }

    //Getter's
    public String getMarcaModelo() {
        return marcaModelo;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public String getDanio() {
        return danio;
    }

    //toString
    @Override
    public String toString() {
        return "Automovil{" + "marcaModelo=" + marcaModelo + ", color=" + color + ", anio=" + anio + ", danio=" + danio + ", reparacion=" + reparacion + '}';
    }

}
