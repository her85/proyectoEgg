package coleccionej3;

import Servicio.ServicioAlumno;

public class ColeccionEj3 {

    public static void main(String[] args) {

        ServicioAlumno sa = new ServicioAlumno();
        sa.crearAlumno();
        sa.mostraAlumnos();
        sa.mostrarNotaFinal();
    }

}
