package Ejercicio1;

public class solicitudCredito {
    private String cliente;
    private String tipoCredito;
    private double monto;
    private int plazo;
    private double tasaInteres;

    public solicitudCredito(String cliente, String tipoCredito, double monto, int plazo, double tasaInteres) {
        this.cliente = cliente;
        this.tipoCredito = tipoCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public String obtenerCliente() {
        return cliente;
    }
    public String obtenerTipoCredito(){
        return tipoCredito;
    }
    public double obtenerMonto(){
        return monto;
    }
    public int obtenerPlazo(){
        return plazo;
    }
    public double obtenerTasaInteres(){
        return tasaInteres;
    }
}



