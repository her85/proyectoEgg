package Entidad;

public class Nif {

    private long DNI;
    private String letra;

    public Nif() {
    }

    public Nif(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "DNI=" + DNI + ", Letra=" + letra + '}';
    }

}
