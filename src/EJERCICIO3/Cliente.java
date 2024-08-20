package EJERCICIO3;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Boleto> HistorialCompras;

    public Cliente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.HistorialCompras = new ArrayList<>();
    }

    public List<Boleto> obtenerHistorialCompras() {
        return HistorialCompras;
    }


    public void agregarBoleto(Boleto boleto) {
        HistorialCompras.add(boleto);
    }
}
