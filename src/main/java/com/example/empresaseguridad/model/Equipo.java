package com.example.empresaseguridad.model;

public class Equipo {
        private String cod;
        public String tipo;
        public String estado;
        public int valorRep;
        public int coste;
        public int cantidad;

        public Supervisor theSupervisor;
        public Vigilante theVigilante;
        public Operador theOperador;

    public Equipo(String cod, String tipo, String estado, int valorRep, int coste, int cantidad) {
        this.cod = cod;
        this.tipo = tipo;
        this.estado = estado;
        this.valorRep = valorRep;
        this.coste = coste;
        this.cantidad = cantidad;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getValorRep() {
        return valorRep;
    }

    public void setValorRep(int valorRep) {
        this.valorRep = valorRep;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
