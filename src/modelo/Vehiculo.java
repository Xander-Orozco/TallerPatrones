package modelo;

public abstract class Vehiculo {
    protected String placa;
    protected double autonomia;

    public Vehiculo(String placa, double autonomia) {
        this.placa = placa;
        this.autonomia = autonomia;
    }

    public String getPlaca() {
        return placa;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public abstract String getTipo();
}