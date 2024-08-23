package Ejercicio6;

public class Libros {
    private String titulo;
    private String autor;
    private int ISBN;
    private int AñoPublicacion;

    public Libros(String titulo, String autor, int ISBN, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        AñoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        AñoPublicacion = añoPublicacion;
    }
}
