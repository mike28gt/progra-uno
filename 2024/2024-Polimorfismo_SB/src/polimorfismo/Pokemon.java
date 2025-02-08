/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public abstract class Pokemon {
    private String nombre;
    private int nivel;
    
    public Pokemon(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void incrementarNivel(int puntos) {
        if (puntos >= 0) {
            this.nivel += puntos;
        } 
        else {
            System.err.println("Para incrementar el nivel debes utilizar puntos positivos.");
        }
    }
    
    public void decrementarNivel(int puntos) {
        if (puntos <= 0) {
            this.nivel -= puntos;
        } 
        else {
            System.err.println("Para decrementar el nivel debes utilizar puntos negativos");
        }
    }
    
    public abstract void atacar();
    
    public void defender() {
        System.out.println("Defender!!!");
    }
    
    public void curar() {
        System.out.println("Curar!!!");
    }
    
}
