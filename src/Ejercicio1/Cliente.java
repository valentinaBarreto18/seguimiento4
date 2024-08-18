package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Cliente extends Persona{
   ArrayList<String> Historialcrediticios= new ArrayList<String>();

   private double Ingresos;

    public Cliente(String nombre, String identificacion, String direccion, ArrayList<String> historialCrediticios, double ingresos) {
        super(nombre, identificacion, direccion);
        this.Historialcrediticios = new ArrayList<>(historialCrediticios);
        this.Ingresos = ingresos;
    }


    public ArrayList<String> getHistorialcrediticios() {
        return Historialcrediticios;
    }

    public void setHistorialcrediticios(ArrayList<String> historialcrediticios) {
        Historialcrediticios = historialcrediticios;
    }

    public double getIngresos() {
        return Ingresos;
    }

    public void setIngresos(double ingresos) {
        Ingresos = ingresos;
    }

    public void addregistro(String registro){
        Historialcrediticios.add (registro);
    }

    public void Mostrarinfo (){
        JOptionPane.showMessageDialog(null," sus ingesos " + getIngresos()
        );
        ;
    }
}
