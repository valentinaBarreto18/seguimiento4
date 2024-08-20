package Ejercicio5;

public class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private Asiento asiento;

    public Reserva(Pasajero pasajero,Vuelo vuelo, Asiento asiento) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        Pasajero.agregarRerseva(this);
    }
    public Pasajero obtenerPasajero(){
        return pasajero;
    }

    public Vuelo obetenerVuelo(){
        return vuelo;
    }
    public Asiento obtenerAsiento(){
        return asiento;
    }

}
