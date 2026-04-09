package modelo;

public class Contrato {
    private String cliente;
    private String plan;
    private String vehiculo;
    private boolean gps;
    private boolean seguro;
    private boolean cargador;
    private int duracionDias;
    private double costo;

    public Contrato(String cliente, String plan, String vehiculo,
                    boolean gps, boolean seguro, boolean cargador,
                    int duracionDias, double costo) {
        this.cliente = cliente;
        this.plan = plan;
        this.vehiculo = vehiculo;
        this.gps = gps;
        this.seguro = seguro;
        this.cargador = cargador;
        this.duracionDias = duracionDias;
        this.costo = costo;
    }

    public void mostrar() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehículo: " + vehiculo);
        System.out.println("Plan: " + plan);
        System.out.println("Duración: " + duracionDias + " días");
        System.out.println("GPS: " + gps);
        System.out.println("Seguro: " + seguro);
        System.out.println("Cargador: " + cargador);
        System.out.println("Costo total: " + costo);
    }
}