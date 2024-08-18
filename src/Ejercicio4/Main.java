package Ejercicio4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Producto> productos = new ArrayList<>();
    public static void main(String[] args) {
        String[] options = {"Agregar Producto", "Modificar Producto", "Eliminar Producto", "Mostrar Productos", "Salir"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(null, "Seleccione una acción", "Gestión de Productos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    agregarProducto();
                    break;
                case 1:
                    modificarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    mostrarProductos();
                    break;
            }
        } while (choice != 4);
    }

    private static void agregarProducto() {
        String tipoProducto = JOptionPane.showInputDialog("Ingrese el tipo de producto (normal o perecedero):");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del producto:");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto:"));

        if (tipoProducto.equalsIgnoreCase("perecedero")) {
            String fechaVencimiento = JOptionPane.showInputDialog("Ingrese la fecha de vencimiento (YYYY-MM-DD):");
            ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombre, descripcion, precio, stock, fechaVencimiento);
            productos.add(productoPerecedero);
        } else {
            Producto producto = new Producto(nombre, descripcion, precio, stock);
            productos.add(producto);
        }
    }

    private static void modificarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto a modificar:");
        Producto producto = buscarProducto(nombre);

        if (producto != null) {
            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción:");
            int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio:"));
            int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo stock:"));

            producto.establecerDescripcion(nuevaDescripcion);
            producto.establecerPrecio(nuevoPrecio);
            producto.establecerStock(nuevoStock);

            if (producto instanceof ProductoPerecedero) {
                String nuevaFechaVencimiento = JOptionPane.showInputDialog("Ingrese la nueva fecha de vencimiento (YYYY-MM-DD):");
                ((ProductoPerecedero) producto).establecerFechaVecimiento(nuevaFechaVencimiento);
            }

            JOptionPane.showMessageDialog(null, "Producto modificado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar:");
        Producto producto = buscarProducto(nombre);

        if (producto != null) {
            productos.remove(producto);
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    }

    private static Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.obtenerNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    private static void mostrarProductos() {
        String resultado = "";
        for (Producto producto : productos) {
            resultado += "Nombre: " + producto.obtenerNombre() + "\n";
            resultado += "Descripción: " + producto.obtenerDescripcion() + "\n";
            resultado += "Precio: " + producto.obtenerPrecio() + "\n";
            resultado += "Stock: " + producto.obtenerStock() + "\n";
            if (producto instanceof ProductoPerecedero) {
                resultado += "Fecha de Vencimiento: " + ((ProductoPerecedero) producto).obtenerFechaVecimiento() + "\n";
            }
            resultado += "\n";
        }
        if (resultado.isEmpty()) {
            resultado = "No hay productos en el inventario.";
        }
        JOptionPane.showMessageDialog(null, resultado, "Productos", JOptionPane.INFORMATION_MESSAGE);
    }
}
