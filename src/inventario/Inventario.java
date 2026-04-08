public class Inventario {
    private Vehiculo[] vehiculos;
    private int contador;

    public Inventario(int capacidad) {
        vehiculos = new Vehiculo[capacidad];
        contador = 0;
    }

    public void agregar(Vehiculo v) {
        if (contador < vehiculos.length) {
            vehiculos[contador++] = v;
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public Vehiculo buscarPorPlaca(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public void ordenarPorAutonomia() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (vehiculos[j].getAutonomia() > vehiculos[j + 1].getAutonomia()) {
                    Vehiculo temp = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = temp;
                }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println(
                vehiculos[i].getTipo() + " - " +
                vehiculos[i].getPlaca() + " - " +
                vehiculos[i].getAutonomia()
            );
        }
    }
}