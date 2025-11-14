package com.example.empresaseguridad.model;
import java.util.ArrayList;


public class PatrujalleMovil extends Servicio{
    public int kilometros;
    public int rutas;

    public ArrayList<Equipo> listEquipo  = new ArrayList<>();

    public PatrujalleMovil(String codigoContrato, String cliente, int tarifa, int kilometros, int rutas) {
        super(codigoContrato, cliente, tarifa);
        this.kilometros = kilometros;
        this.rutas = rutas;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getRutas() {
        return rutas;
    }

    public void setRutas(int rutas) {
        this.rutas = rutas;
    }

    @Override
    public int costoMensual() {
        return tarifa + (rutas * kilometros)*1000;
    }
}
