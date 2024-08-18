package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class Persona {
        private String nombre;
        private String identificacion ;
        private String direccion;

        public Persona(String nombre, String identificacion,String direccion){
            this.nombre = nombre;
            this.identificacion = identificacion;
            this.direccion = direccion;
        }
        public String obtenerNombre(){
            return nombre;
        }

        public String obtenerIdentificacion(){
            return identificacion;
        }

        public String obtenerDireccion(){
            return direccion;
        }
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + ", ID: " + identificacion + ", Dirección: " + direccion);
    }
}


