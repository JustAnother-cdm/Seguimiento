package com.example.empresaseguridad.model;

import java.util.ArrayList;

public class SEGURCOL {

    private String nit;

    private ArrayList<Equipo> equipos;
    private ArrayList<Operador> operadores;
    private ArrayList<Supervisor> supervisors;
    private ArrayList<Vigilante> vigilantes;
    private ArrayList<PatrujalleMovil> patrullajeMovil;
    private ArrayList<CustodiaFija> custodiaFijas;
    private ArrayList<MonitoreoRemoto> monitoreoRemotos;

    public SEGURCOL(String nit) {
        this.nit = nit;

        equipos = new ArrayList<>();
        operadores = new ArrayList<>();
        supervisors = new ArrayList<>();
        vigilantes = new ArrayList<>();
        patrullajeMovil = new ArrayList<>();
        custodiaFijas = new ArrayList<>();
        monitoreoRemotos = new ArrayList<>();
    }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    // ------------------- CRUD EQUIPOS -------------------
    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }

    public void eliminarEquipo(String id) {
        equipos.removeIf(e -> e.getCod().equals(id));
    }

    public ArrayList<Equipo> getEquipos() { return equipos; }


    // ------------------- CRUD OPERADORES -------------------
    public void agregarOperador(Operador o) {
        operadores.add(o);
    }

    public void eliminarOperador(String id) {
        operadores.removeIf(o -> o.getId().equals(id));
    }

    public ArrayList<Operador> getOperadores() { return operadores; }


    // ------------------- CRUD VIGILANTES -------------------
    public void agregarVigilante(Vigilante v) {
        vigilantes.add(v);
    }

    public void eliminarVigilante(String id) {
        vigilantes.removeIf(v -> v.getId().equals(id));
    }

    public ArrayList<Vigilante> getVigilantes() { return vigilantes; }


    // ------------------- CRUD SUPERVISORES -------------------
    public void agregarSupervisor(Supervisor s) {
        supervisors.add(s);
    }

    public void eliminarSupervisor(String id) {
        supervisors.removeIf(s -> s.getId().equals(id));
    }

    public ArrayList<Supervisor> getSupervisores() { return supervisors; }


    // ------------------- CRUD PATRULLAJE -------------------
    public void agregarPatrullaje(PatrujalleMovil p) {
        patrullajeMovil.add(p);
    }

    public void eliminarPatrullaje(String id) {
        patrullajeMovil.removeIf(p -> p.getCodigoContrato().equals(id));
    }

    public ArrayList<PatrujalleMovil> getPatrullajeMovil() { return patrullajeMovil; }


    // ------------------- CRUD CUSTODIA -------------------
    public void agregarCustodiaFija(CustodiaFija c) {
        custodiaFijas.add(c);
    }

    public void eliminarCustodiaFija(String id) {
        custodiaFijas.removeIf(c -> c.getCodigoContrato().equals(id));
    }

    public ArrayList<CustodiaFija> getCustodiaFijas() { return custodiaFijas; }


    // ------------------- CRUD MONITOREO -------------------
    public void agregarMonitoreo(MonitoreoRemoto m) {
        monitoreoRemotos.add(m);
    }

    public void eliminarMonitoreo(String id) {
        monitoreoRemotos.removeIf(m -> m.getCodigoContrato().equals(id));
    }

    public ArrayList<MonitoreoRemoto> getMonitoreoRemotos() { return monitoreoRemotos; }}