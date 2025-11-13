package com.example.empresaseguridad.model;

import java.util.ArrayList;

public class Vigilante extends Empleado {
    public String puesto;
    public String tipoArma;
    public Turno turno;

    ArrayList<Equipo> listEquipo;
    CustodiaFija theCustodiaFija;



    public Vigilante(String id, String nombre, int salarioBase, String puesto, String tipoArma, Turno turno) {
        super(id, nombre, salarioBase);
        this.puesto = puesto;
        this.tipoArma = tipoArma;
        this.turno = turno;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
