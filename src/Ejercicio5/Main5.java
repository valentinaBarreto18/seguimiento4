package Ejercicio5;

import javax.swing.*;

public class Main5 {
    public static void main(String[] args) {

        Avion avion = new Avion("narrow 192", 50);
        Vuelo vuelo = new Vuelo(8956,"colombia- Cali", "2024-09-6", "08:00", "10:00", avion);
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del pasajero:");
        String identificacion = JOptionPane.showInputDialog("Digite la identificacion del pasajero:");
        String contacto = JOptionPane.showInputDialog("Ingrese el contacto del pasajero:");
        Pasajero pasajero = new Pasajero(nombre,identificacion,contacto);


        String mensaje = "Asientos disponibles:\n";
        for (int i = 1; i <= avion.obtenerCapacidad(); i++) {
            Asiento asiento = avion.obtenerAsiento(i);
            if ("disponible".equals(asiento.obtenerEstado())) {
                mensaje += asiento.obtenerNumero() + " - " + asiento.obtenerClase() + "\n";
            }
        }


        String asientoNumeroStr = JOptionPane.showInputDialog(mensaje + "Ingrese el número del asiento a reservar:");
        int asientoNumero = Integer.parseInt(asientoNumeroStr);


        Asiento asiento = avion.obtenerAsiento(asientoNumero);
        if ("disponible".equals(asiento.obtenerEstado())) {
            Reserva reserva = new Reserva(pasajero, vuelo, asiento);
            JOptionPane.showMessageDialog(null, "Reserva realizada con éxito para el asiento número " + asientoNumero);
        } else {
            JOptionPane.showMessageDialog(null, "El asiento número " + asientoNumero + " no está disponible.");
        }

    }

}
