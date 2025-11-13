package com.example.empresaseguridad.model;


import java.time.LocalDate;

public class SEGURCOL {
    private String nit;
    public LocalDate desde;
    public LocalDate hasta;
    public LocalDate fecha;
    public String descripcion;

    public SEGURCOL(String nit, LocalDate desde, LocalDate hasta, LocalDate fecha, String descripcion) {
        this.nit = nit;
        this.desde = desde;
        this.hasta = hasta;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LocalDate getDesde() {
        return desde;
    }

    public void setDesde(LocalDate desde) {
        this.desde = desde;
    }

    public LocalDate getHasta() {
        return hasta;
    }

    public void setHasta(LocalDate hasta) {
        this.hasta = hasta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
