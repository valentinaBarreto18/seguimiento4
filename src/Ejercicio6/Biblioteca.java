package Ejercicio6;

import javax.swing.*;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libros> listaLibro = new ArrayList<>();

    public void agregarLibro(Libros libro) {
        String title = JOptionPane.showInputDialog(null,"Ingrese el titulo de libro que desea leer: ");
        String autor = JOptionPane.showInputDialog(null,"Ingresa el autor del libro: ");
        int ISBN = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ISBN: "));
        int Añopublicacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Año de publicación: "));
        listaLibro.add(new Libros(title,autor,ISBN,Añopublicacion));
    }

    public void eliminarLibro(int ISBN_Eliminar){
        int ingreso = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el ISBN del libro que desea borrar: "));
        boolean encontrado = false;

        for (int i = 0; i < listaLibro.size(); i++) {
            if (listaLibro.get(i).getISBN() == ingreso) {
                listaLibro.remove(i);
                JOptionPane.showMessageDialog(null, "El libro ha sido eliminado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con el ISBN proporcionado.");
        }
    }
    public void buscarLibroPorTitulo(String titulo) {
        String resultado = "";
        for (Libros libro : listaLibro) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultado += "Título: " + libro.getTitulo() + "\n"
                        + "Autor: " + libro.getAutor() + "\n"
                        + "ISBN: " + libro.getISBN() + "\n"
                        + "Año de Publicación: " + libro.getAñoPublicacion() + "\n\n";
            }
        }
        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con ese título.");
        } else {
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    public void buscarLibroPorAutor(String autor) {
        String resultado = "";
        for (Libros libro : listaLibro) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                resultado += "Título: " + libro.getTitulo() + "\n"
                        + "Autor: " + libro.getAutor() + "\n"
                        + "ISBN: " + libro.getISBN() + "\n"
                        + "Año de Publicación: " + libro.getAñoPublicacion() + "\n\n";
            }
        }
        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro de ese autor.");
        } else {
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    public void listarLibros() {
        if (listaLibro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay libros en la biblioteca.");
        } else {
            String resultado = "";
            for (Libros libro : listaLibro) {
                resultado += "Título: " + libro.getTitulo() + "\n"
                        + "Autor: " + libro.getAutor() + "\n"
                        + "ISBN: " + libro.getISBN() + "\n"
                        + "Año de Publicación: " + libro.getAñoPublicacion() + "\n\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}





