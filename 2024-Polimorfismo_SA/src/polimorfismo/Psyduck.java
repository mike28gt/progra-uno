/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public class Psyduck extends Pokemon {
    
    public Psyduck(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    public void atacar() {
        System.out.println("Psyduck utiliza el ataque strees.");
    }
}
