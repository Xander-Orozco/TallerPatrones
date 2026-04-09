package factory;

import modelo.*;

public class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo, String placa, double autonomia) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(placa, autonomia);
            case "van":
                return new Van(placa, autonomia);
            case "camion":
                return new Camion(placa, autonomia);
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}