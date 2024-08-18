package Ejercicio2;

import Ejercicio1.Persona;

import javax.swing.*;
import java.util.ArrayList;

    public class Cliente extends Persona {
        ArrayList<String> HistorialReservas= new ArrayList<String>();

        public Cliente(String nombre, String identificacion, String direccion){
            super(nombre, identificacion, direccion);
            this.HistorialReservas = new ArrayList<>();
        }
        public void agregrarReserva(String Reserva) {
            HistorialReservas.add(Reserva);
        }
        public ArrayList<String> obtenerhistorialReservas() {
            return HistorialReservas;
        }
    public void mostrarDatos() {
    super.mostrarinfo();
    JOptionPane.showMessageDialog(null, "Historial de Reservas: " +HistorialReservas.toString());
}
    }
