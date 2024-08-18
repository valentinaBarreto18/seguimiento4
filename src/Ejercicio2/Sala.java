package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class Sala {
    private int numero;
    private int capacidad;
    private ArrayList<ArrayList<Asiento>> listaAsientos;

    public Sala() {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sala:"));
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));
        this.capacidad = filas * columnas;

        listaAsientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Asiento> filaAsientos = new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                filaAsientos.add(new Asiento(i, j, "Disponible"));
            }
            listaAsientos.add(filaAsientos);
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        if (fila >= 0 && fila < listaAsientos.size() && columna >= 0 && columna < listaAsientos.get(fila).size()) {
            return listaAsientos.get(fila).get(columna);
        } else {
            JOptionPane.showMessageDialog(null, "La posición del asiento está fuera de los límites.");
            return null;
        }
    }
    public void mostrarDatos() {
        String datos = "Número de Sala: " + numero + ", Capacidad: " + capacidad + "\nAsientos:\n";
        for (ArrayList<Asiento> fila : listaAsientos) {
            for (Asiento asiento : fila) {
                datos += "Fila: " + asiento.obtenerFila() +
                        ", Columna: " + asiento.obtenerColumna() +
                        ", Estado: " + asiento.obtenerEstado() + "\n";
            }
        }
    }
}
