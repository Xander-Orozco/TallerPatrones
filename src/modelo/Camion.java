package modelo;

public class Camion extends Vehiculo {
    public Camion(String placa, double autonomia) {
        super(placa, autonomia);
    }

    @Override
    public String getTipo() {
        return "Camión";
    }
}