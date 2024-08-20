package Ejercicio5;

import Ejercicio2.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Persona {
    private List<Reserva> historialReservas;

    public Pasajero(String nombre, String identificacion, String contacto){
        super(nombre, identificacion, contacto);
        this.historialReservas = new ArrayList<>();
    }

    public static void agregarRerseva(Ejercicio5.Reserva reserva) {
    }

    public void agregarReserva(Ejercicio5.Reserva reserva) {
    }

    public void agregarReserva(Reserva reserva){
        historialReservas.add(reserva);
    }

    public List<Reserva> obtenertHistorialReservas() {
        return historialReservas;
    }
}
