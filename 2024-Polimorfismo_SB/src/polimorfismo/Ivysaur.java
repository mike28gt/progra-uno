/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public class Ivysaur extends Pokemon {
    
    public Ivysaur(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    public void atacar() {
        System.out.println("Ivysaur utiliza el atáque Boca Jarro");
    }
    
}
