package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private ArrayList<Asiento> listaAsientos;

    public Reserva(Cliente cliente, Funcion funcion, ArrayList<Asiento> listaAsientos) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = listaAsientos;
    }

    public Reserva(Cliente cliente, Funcion funcion) {
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Funcion obtenerFuncion() {
        return funcion;
    }

    public ArrayList<Asiento> obtenerListaAsientos() {
        return listaAsientos;
    }
    public void agregarAsiento(Asiento asiento) {
        if (asiento.obtenerEstado().equals("Disponible")) {
            asiento.reservar();
            listaAsientos.add(asiento);
        } else {
            JOptionPane.showMessageDialog(null, "El asiento no está disponible.");
        }
    }
    public void mostrarDatos() {
        cliente.mostrarDatos();
        funcion.mostrarDatos();
        StringBuilder sb = new StringBuilder("Asientos reservados:\n");
        for (Asiento asiento : listaAsientos) {
            sb.append("Fila: ").append(asiento.obtenerFila()).append(", Columna: ").append(asiento.obtenerColumna()).append(", Estado: ").append(asiento.obtenerEstado()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

