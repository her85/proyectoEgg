package Entidad;

public class CuentaBancaria {

    private int numeroDeCuenta;
    private long DNI;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDecuenta, long DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDecuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroDecuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDecuenta) {
        this.numeroDeCuenta = numeroDecuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroDeCuenta=" + numeroDeCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }

}
