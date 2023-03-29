package com.adecco.modelo;

public class CuentaNomina extends CuentaAhorro{
    private String numSS;
    private String empresa;
    private double comision;

    @Override
    public double calcularSaldo() {
        return saldoAnterior+ingresos-retiros-(retiros*comision);
    }

    @Override
    public String toString() {
        return "CuentaNomina{" +
                "numSS='" + numSS + '\'' +
                ", empresa='" + empresa + '\'' +
                ", comision=" + comision +
                "} " + super.toString();
    }

    public CuentaNomina() {
    }

    public CuentaNomina(String nombreCliente, String dniCliente, String direccionCliente,
                        String numSS, String empresa, double comision) {
        super(nombreCliente, dniCliente, direccionCliente);
        this.numSS = numSS;
        this.empresa = empresa;
        this.comision = comision;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}

