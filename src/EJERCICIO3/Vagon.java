package EJERCICIO3;

import java.util.ArrayList;
import java.util.List;

public class Vagon {
    private String tipo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Vagon(String tipo, int capacidad){
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++){
            listaAsientos.add(new Asiento(i));
        }
    }

    public String obtenerTipo(){
        return tipo;
    }
    public int obtenerCapacidad(){
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero){
        if(numero > 0 && numero <= listaAsientos.size()) {
            return listaAsientos.get(numero - 1);
        }
        return null;
    }
}



