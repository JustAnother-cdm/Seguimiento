package com.example.empresaseguridad.model;


import java.util.ArrayList;

public class SEGURCOL {
    private String nit;
    public ArrayList<Equipo> equipos;
    public ArrayList<Operador> operadores;
    public ArrayList<Supervisor>  supervisors;
    public ArrayList<Vigilante>  vigilantes;
    public ArrayList<PatrujalleMovil>  patrullajeMovil;
    public ArrayList<CustodiaFija> custodiaFijas;
    public ArrayList<MonitoreoRemoto>  monitoreoRemotos;

    public SEGURCOL(String nit) {
        this.nit = nit;
        this.equipos  = new ArrayList<>();
        this.operadores  = new ArrayList<>();
        this.supervisors  = new ArrayList<>();
        this.vigilantes  = new ArrayList<>();
        this.patrullajeMovil  = new ArrayList<>();
        this.custodiaFijas  = new ArrayList<>();
        this.monitoreoRemotos  = new ArrayList<>();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    //Crud Equipos
    public void agregarEquipo(Equipo m) {
        equipos.add(m);
        System.out.println("Agregando equipo: " + m.getCod());
    }
    public void eliminarEquipo(String Cod) {
        equipos.removeIf(p -> p.getCod().equals(Cod));
        System.out.println("Eliminando equipo: " + Cod);
    }

    //CRUD operador
    public void agregarOperadores (Operador m) {
        operadores.add(m);
        System.out.println("Agregando operador: " + m.getNombre());
    }
    public void eliminarOperadores(String nombre) {
        operadores.removeIf(m -> m.getNombre().equals(nombre));
        System.out.println("Eliminando operador: " + nombre);
    }

    public void agregarVigilante (Vigilante m) {
        vigilantes.add(m);
        System.out.println("Agregando vigilante: " + m.getNombre());
    }
    public void eliminarVigilante(String nombre) {
        vigilantes.removeIf(m -> m.getNombre().equals(nombre));
        System.out.println("Eliminando vigilante: " + nombre);
    }


    public void agregarSupervisor (Supervisor m) {
        supervisors.add(m);
        System.out.println("Agregando supervisor: " + m.getNombre());
    }
    public void eliminarSupervisor(String nombre) {
        supervisors.removeIf(m -> m.getNombre().equals(nombre));
        System.out.println("Eliminando supervisor: " + nombre);
    }

    public void agregarMonitoreoRemoto (MonitoreoRemoto m) {
        monitoreoRemotos.add(m);
        System.out.println("Agregando monitoreo: " + m.getCodigoContrato());
    }
    public void eliminarMonitoreoRemotos(String nombre) {
        monitoreoRemotos.removeIf(m -> m.getCodigoContrato().equals(nombre));
        System.out.println("Eliminando monitoreo: " + nombre);
    }

    public void agregarPatrullaje (PatrujalleMovil m) {
        patrullajeMovil.add(m);
        System.out.println("Agregando patrullaje: " + m.getCodigoContrato());
    }
    public void eliminarPatrullaje(String nombre) {
        patrullajeMovil.removeIf(m -> m.getCodigoContrato().equals(nombre));
        System.out.println("Eliminando --: " + nombre);
    }

    public void agregarCustodiaFijas (CustodiaFija m) {
        custodiaFijas.add(m);
        System.out.println("Agregando custodia fija: " + m.getCodigoContrato());
    }
    public void eliminarCustodiaFijas(String nombre) {
        custodiaFijas.removeIf(m -> m.getCodigoContrato().equals(nombre));
        System.out.println("Eliminando custodia: " + nombre);
    }
}
