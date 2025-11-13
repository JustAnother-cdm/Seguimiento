package com.example.empresaseguridad.model;

public abstract class Servicio {
    protected String codigoContrato;
    protected String cliente;
    protected int tarifa;
    public Servicio(String codigoContrato, String cliente, int tarifa) {
        this.codigoContrato = codigoContrato;
        this.cliente = cliente;
        this.tarifa = tarifa;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int costoMensual(){
        return tarifa;
    }
}
