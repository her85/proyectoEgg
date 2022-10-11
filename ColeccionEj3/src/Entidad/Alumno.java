package Entidad;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private List<Integer> listaNotas; //coleccion como atributo

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    //recorrer la lista
    public void recorrerListaNotas() {
        listaNotas.forEach((nota) -> {
            System.out.println("(" + nota + ")");
        });
    }
/*
    Funcion del objeto para calcual la nota final
    */
    public Integer notaFinal() {
        Integer notaFinal;
        int nota = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            nota += listaNotas.get(i);
        }
        notaFinal = nota / listaNotas.size();
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }
}
