package empresaseguridad;

import java.util.ArrayList;

public class PatrujalleMovil extends Servicio {

    private int kilometros;
    private int rutas;


    private ArrayList<Equipo> listEquipo = new ArrayList<>();

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


    public void asignarEquipo(Equipo e) {
        listEquipo.add(e);
    }

    public ArrayList<Equipo> getEquipos() {
        return listEquipo;
    }

    @Override
    public int costoMensual() {
        return tarifa + (rutas * kilometros) * 1000;
    }
}