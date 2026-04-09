package modelo;

public class Auto extends Vehiculo {
    public Auto(String placa, double autonomia) {
        super(placa, autonomia);
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}