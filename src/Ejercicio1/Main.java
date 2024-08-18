package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(JOptionPane.showInputDialog("ingrese su nombre:"),
                JOptionPane.showInputDialog("ingrese su ID"),
                JOptionPane.showInputDialog("Ingrese su dirección"));
        persona.mostrarinfo();

        ArrayList<String> historialCrediticios = new ArrayList<>();
        historialCrediticios.add("información cliente");

        double ingresos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sus ingresos:"));
        Cliente cliente = new Cliente(persona.obtenerNombre(),
                persona.obtenerIdentificacion(),
                persona.obtenerDireccion(),
                historialCrediticios,
                ingresos);

    }
}
