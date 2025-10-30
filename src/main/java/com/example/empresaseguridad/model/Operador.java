package com.example.empresaseguridad.model;

public class Operador extends Empleado{
    public int zonasControl;
    public Boolean trabajaCentral;
    public Boolean manejaSeguridad;
    public Turno turno;


    public Operador(String id, String nombre, int salarioBase, int zonasControl, Boolean trabajaCentral, Boolean manejaSeguridad, Turno turno) {
        super(id, nombre, salarioBase);
        this.zonasControl = zonasControl;
        this.trabajaCentral = trabajaCentral;
        this.manejaSeguridad = manejaSeguridad;
        this.turno = turno;

    }

    public int getZonasControl() {
        return zonasControl;
    }

    public void setZonasControl(int zonasControl) {
        this.zonasControl = zonasControl;
    }

    public Boolean getTrabajaCentral() {
        return trabajaCentral;
    }

    public void setTrabajaCentral(Boolean trabajaCentral) {
        this.trabajaCentral = trabajaCentral;
    }

    public Boolean getManejaSeguridad() {
        return manejaSeguridad;
    }

    public void setManejaSeguridad(Boolean manejaSeguridad) {
        this.manejaSeguridad = manejaSeguridad;
    }
}
