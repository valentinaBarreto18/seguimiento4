package Ejercicio4;

public class ProductoPerecedero extends  Producto{
    private String fechaVecimiento;

    public ProductoPerecedero(String nombre, String descripcion, int precio, int stock, String fechaVecimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVecimiento = fechaVecimiento;
    }

    public String obtenerFechaVecimiento() {
        return fechaVecimiento;
    }

    public void establecerFechaVecimiento(String fechaVecimiento) {
        this.fechaVecimiento = fechaVecimiento;
    }
}
