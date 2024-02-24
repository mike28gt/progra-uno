/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public class Bulbasaur extends Pokemon implements Agua{
    
    public Bulbasaur(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    public void atacar() {
        System.out.println("Bulbasaur utiliza el atáque Látigo Cepa");
    }
    
    public void nadar() {
    }
}
