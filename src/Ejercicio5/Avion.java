package Ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class Avion {
    private String modelo;
    private int capacidad;
    private Map<Integer, Asiento> lista_Asientos;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        lista_Asientos = new HashMap<>();
        for (int i = 1; i <= capacidad; i++) {
            lista_Asientos.put(i, new Asiento(i, i <= capacidad / 2 ? "economica" : "Turista"));

        }
    }

    public String obtenerModelo() {
        return modelo;
    }

    public int obtenerCpacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero) {
        return lista_Asientos.get(numero);
    }

    public int obtenerCapacidad() {

        return 0;
    }
}