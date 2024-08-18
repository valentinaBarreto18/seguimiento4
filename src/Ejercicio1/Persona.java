package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String identificacion;
    private String direccion;

    public Persona(String nombre, String identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    ArrayList<String> Datospersona = new ArrayList<String>();

    public void mostrarinfo() {
        JOptionPane.showMessageDialog(null, "nombre de usuario: " + nombre +
                "\n Su ID es: " + identificacion +
                "\n Su dirección es :" + direccion
        );
        ;
    }

    public void Mostrarinfo() {

    }
}


