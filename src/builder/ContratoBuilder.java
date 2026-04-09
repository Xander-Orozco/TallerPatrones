package builder;

import modelo.Contrato;

public class ContratoBuilder {

    private String cliente;
    private String plan;
    private String vehiculo;
    private boolean gps;
    private boolean seguro;
    private boolean cargador;
    private int duracionDias;
    private double costoBase;

    public ContratoBuilder setCliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public ContratoBuilder setPlan(String plan) {
        this.plan = plan;
        return this;
    }

    public ContratoBuilder setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
        return this;
    }

    public ContratoBuilder setDuracion(int dias) {
        this.duracionDias = dias;
        return this;
    }

    public ContratoBuilder agregarGPS() {
        this.gps = true;
        costoBase += 5;
        return this;
    }

    public ContratoBuilder agregarSeguro() {
        this.seguro = true;
        costoBase += 10;
        return this;
    }

    public ContratoBuilder agregarCargador() {
        this.cargador = true;
        costoBase += 3;
        return this;
    }

    public Contrato build() {

        // Validación
        if (cliente == null || vehiculo == null || plan == null) {
            throw new IllegalStateException("Faltan datos obligatorios");
        }

        // Regla de negocio
        double costoFinal = costoBase * duracionDias;

        if (duracionDias > 30) {
            costoFinal *= 0.9; // 10% descuento
        }

        return new Contrato(cliente, plan, vehiculo,
                gps, seguro, cargador,
                duracionDias, costoFinal);
    }
}