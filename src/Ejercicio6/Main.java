package Ejercicio6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    boolean salir = false;

    while (!salir) {
        String opcion = JOptionPane.showInputDialog(
                "Menú de Biblioteca\n" +
                        "1. Agregar Libro\n" +
                        "2. Eliminar Libro\n" +
                        "3. Buscar Libro por Título\n" +
                        "4. Buscar Libro por Autor\n" +
                        "5. Listar Libros\n" +
                        "6. Salir\n" +
                        "Elige una opción:"
        );

        switch (opcion) {
            case "1":
                String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
                String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
                int ISBN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ISBN del libro:"));
                int añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del libro:"));
                Libros libro = new Libros(titulo, autor, ISBN, añoPublicacion);
                biblioteca.agregarLibro(libro);
                break;
            case "2":
                int ISBN_Eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ISBN del libro a eliminar:"));
                biblioteca.eliminarLibro(ISBN_Eliminar);
                break;
            case "3":
                String tituloBuscar = JOptionPane.showInputDialog("Ingrese el título a buscar:");
                biblioteca.buscarLibroPorTitulo(tituloBuscar);
                break;
            case "4":
                String autorBuscar = JOptionPane.showInputDialog("Ingrese el autor a buscar:");
                biblioteca.buscarLibroPorAutor(autorBuscar);
                break;
            case "5":
                biblioteca.listarLibros();
                break;
            case "6":
                salir = true;
                JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                break;
        }
    }
}
}
