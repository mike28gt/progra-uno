/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class Cat extends Feline {
    void makeNoise() {
        System.out.println("Miau Miau!");
    }
    
    void eat() {
        System.out.println("meat!");
    }
}
