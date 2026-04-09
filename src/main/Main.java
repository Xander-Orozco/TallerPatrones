package main;
 
import java.util.Scanner;
 
import factory.VehiculoFactory;
import inventario.Inventario;
import modelo.Vehiculo;
import builder.ContratoBuilder;
import modelo.Contrato;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== SISTEMA AUTOCAR ===");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Escenario 1 - Inventario");
        System.out.println("2. Escenario 2 - Contratos");
        System.out.println("3. Ejecutar todo");
 
        int opcion = scanner.nextInt();
 
        if (opcion == 1 || opcion == 3) {
 
            System.out.println("\n=== ESCENARIO 1: INVENTARIO ===");
 
            Inventario inventario = new Inventario(5);
 
            Vehiculo v1 = VehiculoFactory.crearVehiculo("auto", "ABC123", 300);
            Vehiculo v2 = VehiculoFactory.crearVehiculo("van", "DEF456", 250);
            Vehiculo v3 = VehiculoFactory.crearVehiculo("camion", "GHI789", 200);
 
            inventario.agregar(v1);
            inventario.agregar(v2);
            inventario.agregar(v3);
 
            inventario.mostrar();
 
            System.out.println("\nBuscar vehículo (DEF456):");
            Vehiculo buscado = inventario.buscarPorPlaca("DEF456");
 
            if (buscado != null) {
                System.out.println("Encontrado: " + buscado.getTipo());
            }
 
            inventario.ordenarPorAutonomia();
 
            System.out.println("\nInventario ordenado:");
            inventario.mostrar();
        }
 
        if (opcion == 2 || opcion == 3) {
 
            System.out.println("\n=== ESCENARIO 2: CONTRATOS ===");
 
            Vehiculo v1 = VehiculoFactory.crearVehiculo("auto", "ABC123", 300);
            Vehiculo v2 = VehiculoFactory.crearVehiculo("van", "DEF456", 250);
 
            Contrato contrato = new ContratoBuilder()
                    .setCliente("Juan Pérez")
                    .setVehiculo(v1.getPlaca())
                    .setPlan("Mensual")
                    .setDuracion(35)
                    .agregarGPS()
                    .agregarSeguro()
                    .build();
 
            contrato.mostrar();
 
            System.out.println("\nSegundo contrato:");
 
            Contrato contrato2 = new ContratoBuilder()
                    .setCliente("María López")
                    .setVehiculo(v2.getPlaca())
                    .setPlan("Semanal")
                    .setDuracion(10)
                    .agregarCargador()
                    .build();
 
            contrato2.mostrar();
        }
 
        scanner.close();
    }
}