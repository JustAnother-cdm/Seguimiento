package empresaseguridad;

public class MonitoreoRemoto extends Servicio {
    int numDispositivos;
    int camaras;
    int sensores;
    Operador theOperador;

    public MonitoreoRemoto(String codigoContrato, String cliente, int tarifa, int numDispositivos, int camaras, int sensores) {
        super(codigoContrato, cliente, tarifa);
        this.numDispositivos = numDispositivos;
        this.camaras = camaras;
        this.sensores = sensores;
    }

    public int getNumDispositivos() {
        return numDispositivos;
    }

    public void setNumDispositivos(int numDispositivos) {
        this.numDispositivos = numDispositivos;
    }

    public int getCamaras() {
        return camaras;
    }

    public void setCamaras(int camaras) {
        this.camaras = camaras;
    }

    public int getSensores() {
        return sensores;
    }

    public void setSensores(int sensores) {
        this.sensores = sensores;
    }

    @Override
    public int costoMensual() {
        return tarifa+(camaras+sensores+numDispositivos)*1000;
    }
}
