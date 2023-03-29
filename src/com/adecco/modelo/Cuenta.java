package com.adecco.modelo;

public abstract class Cuenta {
    protected String nombreCliente;
    protected String dniCliente;
    protected String direccionCliente;

    public abstract double calcularSaldo();

      public abstract double calcularSaldo(double tasaInteres);

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dniCliente='" + dniCliente + '\'' +
                ", direccionCliente='" + direccionCliente + '\'' +
                '}';
    }

    public Cuenta() {
    }

    public Cuenta(String nombreCliente, String dniCliente, String direccionCliente) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.direccionCliente = direccionCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
