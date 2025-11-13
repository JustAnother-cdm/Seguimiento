package com.example.empresaseguridad.model;


public class CustodiaFija extends Servicio {
    int cantidadVigilantes;

    public CustodiaFija(String codigoContrato, String cliente, int tarifa, int cantidadVigilantes) {
        super(codigoContrato, cliente, tarifa);
        this.cantidadVigilantes = cantidadVigilantes;
        Vigilante[] listVigilante = new Vigilante[cantidadVigilantes];
    }

    public int getCantidadVigilantes() {
        return cantidadVigilantes;
    }

    public void setCantidadVigilantes(int cantidadVigilantes) {
        this.cantidadVigilantes = cantidadVigilantes;
    }

    @Override
    public int costoMensual() {
        return tarifa*cantidadVigilantes;
    }
}
