package Ejercicio2;

import javax.swing.*;

public class Funcion {
private String pelicula;
private String HoraInicio;
private int sala;
private int PrecioEntrada;

    public Funcion(String pelicula, String horaInicio, int sala, int precioEntrada) {
        this.pelicula = pelicula;
        HoraInicio = horaInicio;
        this.sala =  sala;
        this.PrecioEntrada = precioEntrada;
    }

    public String obtenerPelicula() {
    return pelicula ;
}

public String obtenerHoraInicio() {
    return HoraInicio ;
}

public int obtenerSala() {
    return sala ;
}
    public int obtenerPrecioEntrada () {
        return PrecioEntrada ;
    }
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Película: " + pelicula + ", Hora: " + obtenerHoraInicio() + ", Sala: " + sala + ", Precio: " + obtenerPrecioEntrada());
    }
}

