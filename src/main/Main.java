package main;

import factory.VehiculoFactory;
import inventario.Inventario;
import modelo.Vehiculo;

public class Main {

    public static void main(String[] args) {

        // Crear inventario con capacidad de 5 vehículos
        Inventario inventario = new Inventario(5);

        // Crear vehículos usando Factory
        Vehiculo v1 = VehiculoFactory.crearVehiculo("auto", "ABC123", 300);
        Vehiculo v2 = VehiculoFactory.crearVehiculo("van", "DEF456", 250);
        Vehiculo v3 = VehiculoFactory.crearVehiculo("camion", "GHI789", 200);

        // Agregar al inventario
        inventario.agregar(v1);
        inventario.agregar(v2);
        inventario.agregar(v3);

        // Mostrar inventario
        System.out.println("=== Inventario ===");
        inventario.mostrar();

        // Buscar por placa
        System.out.println("\n=== Buscar vehículo ===");
        Vehiculo buscado = inventario.buscarPorPlaca("DEF456");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.getTipo());
        } else {
            System.out.println("No encontrado");
        }

        // Ordenar por autonomía
        inventario.ordenarPorAutonomia();

        System.out.println("\n=== Inventario ordenado por autonomía ===");
        inventario.mostrar();
    }
}
