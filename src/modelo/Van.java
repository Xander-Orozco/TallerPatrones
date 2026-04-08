public class Van extends Vehiculo {
    public Van(String placa, double autonomia) {
        super(placa, autonomia);
    }

    @Override
    public String getTipo() {
        return "Van";
    }
}