/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.serializacionobjetos.sa;

/**
 *
 * @author miguelcatalan
 */
public class Pelicula {

    // Atributos
    private String nombre;
    private int año;
    private String genero;
    private String director;
    private String pais;

    public Pelicula(String nombre, int año, String genero, String director, String pais) {
        this.nombre = nombre;
        this.año = año;
        this.genero = genero;
        this.director = director;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
