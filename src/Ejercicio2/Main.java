package Ejercicio2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(JOptionPane.showInputDialog(null,"ingrese el nombre"),
                JOptionPane.showInputDialog(null,"ingrese su id"),
                JOptionPane.showInputDialog(null,"ingrese su dirección"));
        Sala sala= new Sala();

        Funcion funcion = new Funcion(
                JOptionPane.showInputDialog(null, "Ingresa la película que deseas ver"),
                JOptionPane.showInputDialog(null, "Ingresa la hora deseada:"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de sala:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de entrada:"))
        );
        Reserva reserva = new Reserva(cliente, funcion);
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila del asiento:"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna del asiento:"));

        Asiento asiento = sala.obtenerAsiento(fila, columna);
        if (asiento != null) {
            reserva.agregarAsiento(asiento);
        }
        cliente.mostrarDatos();
        funcion.mostrarDatos();
        sala.mostrarDatos();
        reserva.mostrarDatos();

    }
}

