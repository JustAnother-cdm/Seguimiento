package com.example.empresaseguridad.model;

public class Vigilante extends Empleado {
    public String puesto;
    public String tipoArma;
    public Turno turno;



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
