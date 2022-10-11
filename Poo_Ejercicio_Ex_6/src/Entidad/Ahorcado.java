package Entidad;

/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
public class Ahorcado {

    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int faltanEncontrar;
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int jugadasMaximas, int faltanEncontrar) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.faltanEncontrar = faltanEncontrar;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getFaltanEncontrar() {
        return faltanEncontrar;
    }

    public void setFaltanEncontrar(int faltanEncontrar) {
        this.faltanEncontrar = faltanEncontrar;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + ", faltanEncontrar=" + faltanEncontrar + '}';
    }

  
  
    
    
}
