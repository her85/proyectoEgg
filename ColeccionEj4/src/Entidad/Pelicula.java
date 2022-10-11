package Entidad;

public class Pelicula {

    private String titulo;
    private String director;
    private Integer horas;
    private Integer minutos;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer horas, Integer minutos) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
        this.minutos = minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + ", minutos=" + minutos + '}';
    }

}
