package Ejercicio4;

public class Producto {
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;

    public Producto(String nombre, String descripcion, int precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public int obtenerPrecio() {
        return precio;
    }

    public int obtenerStock() {
        return stock;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void establecerPrecio(int precio) {
        this.precio = precio;
    }

    public void establecerStock(int stock) {
        this.stock = stock;
    }
}

