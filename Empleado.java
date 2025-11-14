package empresaseguridad;

import java.util.ArrayList;

public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected int salarioBase = 1200000;

    public Empleado(String id, String nombre, int salarioBase) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }


    public int calcularSalario() {
        return salarioBase;
    }
 ArrayList<Equipo> listEquipo = new ArrayList<>();

    public void asignarEquipo(Equipo e) {
        listEquipo.add(e);
}

    public ArrayList<Equipo> getEquipos() {
        return listEquipo;
}
}
