/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.sa;

/**
 *
 * @author miguelcatalan
 */
public class Cat extends Feline implements Pet {
    public void makeNoise() {
        System.out.println("Miau Miau!");
    }
    
    public void eat() {
        System.out.println("meat!");
    }
    
    public void beFriendly() {
        System.out.println("I'm friendly");
    }
    
    public void play() {
        System.out.println("I'm playing");
    }
}
