public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario(5);

        Vehiculo v1 = VehiculoFactory.crearVehiculo("auto", "ABC123", 300);
        Vehiculo v2 = VehiculoFactory.crearVehiculo("van", "DEF456", 250);
        Vehiculo v3 = VehiculoFactory.crearVehiculo("camion", "GHI789", 200);

        inventario.agregar(v1);
        inventario.agregar(v2);
        inventario.agregar(v3);

        System.out.println("=== Inventario ===");
        inventario.mostrar();

        System.out.println("\n=== Buscar vehículo ===");
        Vehiculo buscado = inventario.buscarPorPlaca("DEF456");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.getTipo());
        } else {
            System.out.println("No encontrado");
        }

        inventario.ordenarPorAutonomia();

        System.out.println("\n=== Inventario ordenado por autonomía ===");
        inventario.mostrar();
    }
}
