<<<<<<< HEAD
=======
package main;
 
import factory.VehiculoFactory;
import inventario.Inventario;
import modelo.Vehiculo;
import builder.ContratoBuilder;
import modelo.Contrato;
 
>>>>>>> df4de34 (Agrega clase Vehículo y subclases)
public class Main {
 
    public static void main(String[] args) {
<<<<<<< HEAD

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
=======
 
        // ==============================
        // ESCENARIO 1: INVENTARIO
        // ==============================
 
        Inventario inventario = new Inventario(5);
 
        Vehiculo v1 = VehiculoFactory.crearVehiculo("auto", "ABC123", 300);
        Vehiculo v2 = VehiculoFactory.crearVehiculo("van", "DEF456", 250);
        Vehiculo v3 = VehiculoFactory.crearVehiculo("camion", "GHI789", 200);
 
        inventario.agregar(v1);
        inventario.agregar(v2);
        inventario.agregar(v3);
 
        System.out.println("=== INVENTARIO ===");
        inventario.mostrar();
 
        // Buscar vehículo
        System.out.println("\n=== BUSCAR VEHÍCULO ===");
>>>>>>> df4de34 (Agrega clase Vehículo y subclases)
        Vehiculo buscado = inventario.buscarPorPlaca("DEF456");
 
        if (buscado != null) {
            System.out.println("Vehículo encontrado: " + buscado.getTipo());
        } else {
            System.out.println("Vehículo no encontrado");
        }
<<<<<<< HEAD

=======
 
        // Ordenar por autonomía
>>>>>>> df4de34 (Agrega clase Vehículo y subclases)
        inventario.ordenarPorAutonomia();
 
        System.out.println("\n=== INVENTARIO ORDENADO ===");
        inventario.mostrar();
 
 
        // ==============================
        // ESCENARIO 2: CONTRATOS
        // ==============================
 
        System.out.println("\n=== CREACIÓN DE CONTRATO ===");
 
        Contrato contrato = new ContratoBuilder()
                .setCliente("Juan Pérez")
                .setVehiculo(v1.getPlaca())  // usamos un vehículo del inventario
                .setPlan("Mensual")
                .setDuracion(35)
                .agregarGPS()
                .agregarSeguro()
                .build();
 
        contrato.mostrar();
 
 
        // ==============================
        // INTEGRACIÓN (IMPORTANTE)
        // ==============================
 
        System.out.println("\n=== INTEGRACIÓN COMPLETA ===");
 
        Contrato contrato2 = new ContratoBuilder()
                .setCliente("María López")
                .setVehiculo(v2.getPlaca())
                .setPlan("Semanal")
                .setDuracion(10)
                .agregarCargador()
                .build();
 
        contrato2.mostrar();
    }
}