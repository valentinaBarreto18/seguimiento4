package Ejercicio2;

import javax.swing.*;

public class Asiento {
private int fila;
private int columna;
private String estado;

public Asiento(int fila, int columna, String estado) {
    this.fila = fila;
    this.columna = columna;
    this.estado = estado;
}

public int obtenerFila() {
    return fila;
}

public int obtenerColumna() {
    return columna;
}

public String obtenerEstado() {
    return estado;
}

public void reservar() {
    if (estado.equals("Disponible")) {
        estado = "Reservado";
    } else {
        JOptionPane.showMessageDialog(null, "El asiento ya está reservado u ocupado.");
    }
}
    public void ocupar(){
        if (estado.equals("Reservado")) {
            estado = "Ocupado";
        } else {
            JOptionPane.showMessageDialog(null, "El asiento no está reservado.");
        }
    }
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Fila: " + fila + ", Columna: " + columna + ", Estado: " + estado);
    }
}

