package EJERCICIO3;

public class Main3 {
    public static void main(String[] args) {

        Tren tren1 = new Tren("5", "Ciudad Medellin - Ciudad Ibague");
        Vagon vagonEconomico = new Vagon("Económica", 85);
        Vagon vagonTurista = new Vagon("Turista", 50);
        tren1.agregarVagon(vagonEconomico);
        tren1.agregarVagon(vagonTurista);

        Viaje viaje1 = new Viaje("2024-08-18", "05:00", "12:00", tren1);

        Cliente cliente1 = new Cliente("Valeria", "12345678", "Calle Falsa 123");


        Asiento asiento1 = vagonEconomico.obtenerAsiento(10);
        asiento1.reservar();
        Boleto boleto1 = new Boleto(cliente1, viaje1, asiento1);


        System.out.println("Boleto:");
        System.out.println("Cliente: " + boleto1.obtenerCliente().obtenerNombre());
        System.out.println("Viaje: " + boleto1.obtenerViaje().obtenerFecha() + " " + boleto1.obtenerViaje().obtenerHoraSalida());
        System.out.println("Tren: " + boleto1.obtenerViaje().obtenerTren().obtenerNumero());
        System.out.println("Asiento: " + boleto1.obtenerAsiento().obtenerNumero() + " - " + boleto1.obtenerAsiento().obtenerEstado());
    }
}

