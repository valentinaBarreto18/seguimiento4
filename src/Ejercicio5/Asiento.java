package Ejercicio5;

public class Asiento {
    private int numero;
    private String clase;
    private String estado;

    public Asiento(int numero, String clase) {
        this.numero = numero;
        this.clase = clase;
        this.estado = "disponible";
    }

    public int obtenerNumero() {
        return numero;
    }
    public String obtenerClase(){
        return clase;
    }
    public String obtenerEstado(){
        return estado;
    }
   public void ocupar(){
        if (estado.equals("reservado")){
            estado = "ocupado";
        }
   }
}

