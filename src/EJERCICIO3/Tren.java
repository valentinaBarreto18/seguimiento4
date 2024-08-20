package EJERCICIO3;

import java.util.ArrayList;
import java.util.List;




public class Tren {
    private String numero;
    private String ruta;
    private List<Vagon> listaVagones = new ArrayList<>();

    public Tren(String numero, String ruta) {
        this.numero = numero;
        this.ruta = ruta;
    }
    public String obtenerNumero(){
        return numero;
    }
    public String obtenerRuta(){
        return ruta;
    }

    public Vagon obtenerVagon(String tipo){
        for (Vagon vagon :listaVagones){
            if(vagon.obtenerTipo().equals(tipo)){
                return vagon;

            }
        }
        return null;
    }

    public void agregarVagon(Vagon vagon){
        listaVagones.add(vagon);
    }


}
