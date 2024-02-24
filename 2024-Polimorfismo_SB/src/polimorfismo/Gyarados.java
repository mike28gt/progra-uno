/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public class Gyarados extends Pokemon {
    
    public Gyarados(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    public void atacar() {
        System.out.println("Gyarados utiliza el atáque Furia Dragón");
    }
}
