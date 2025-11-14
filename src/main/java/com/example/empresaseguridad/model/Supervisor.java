package com.example.empresaseguridad.model;

import java.util.ArrayList;

public class Supervisor extends Empleado {
    public String conjuntoAsignado;
    public int bono;
    public Turno turno;

    public ArrayList<Equipo> listEquipo;



    public Supervisor(String id, String nombre, int salarioBase, String conjuntoAsignado, int bono, Turno turno) {
        super(id, nombre, salarioBase);
        this.conjuntoAsignado = conjuntoAsignado;
        this.bono = bono;
        this.turno = turno;
    }

    public String getConjuntoAsignado() {
        return conjuntoAsignado;
    }

    public void setConjuntoAsignado(String conjuntoAsignado) {
        this.conjuntoAsignado = conjuntoAsignado;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    @Override
    public int calcularSalario(){
        return salarioBase + bono;
    }
}
