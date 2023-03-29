package com.adecco.modelo;

public class CuentaAhorro extends Cuenta{

    protected double saldoAnterior;
    protected double ingresos;
    protected double retiros;

    @Override
    public double calcularSaldo() {

        return saldoAnterior+ingresos-retiros;
    }
    @Override
    public double calcularSaldo(double tasaInteres) {

        return (saldoAnterior*tasaInteres)+ingresos+retiros;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "saldoAnterior=" + saldoAnterior +
                ", ingresos=" + ingresos +
                ", retiros=" + retiros +
                "} " + super.toString();
    }

    public CuentaAhorro() {
    }

    public CuentaAhorro(String nombreCliente, String dniCliente, String direccionCliente) {
        super(nombreCliente, dniCliente, direccionCliente);
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRetiros() {
        return retiros;
    }

    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }
}
