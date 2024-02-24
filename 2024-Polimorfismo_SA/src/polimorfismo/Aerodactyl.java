/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public class Aerodactyl extends Pokemon {
    
    public Aerodactyl(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    public void atacar() {
        System.out.println("Aerodactyl utiliza el atáque Golpe Ala");
    }
}
