package Ejercicio1;

public class Credito {
    private String solicitudCredito;
    private String estado;

    public Credito(solicitudCredito solicitudCredito){
        this.solicitudCredito = String.valueOf(solicitudCredito);
        this.estado = "pendiete";
    }

    public String obtenerSolicitudCredito() {
        return solicitudCredito;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void aprobar() {
        estado = "aprobado";
    }

    public void rechazar() {
        estado = "rechazado";
    }
}

