/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.sb;

/**
 *
 * @author miguelcatalan
 */
public class Cat extends Feline implements Pet {
    public void makeNoise() {
        System.out.println("Miaou Miaou!!!");
    }
    
    public void eat() {
        System.out.println("I'm eating meet!");
    }
    
    public void beFriendly() {
        System.out.println("I'm friendly!");
    }
    
    public void play() {
        System.out.println("I like to play!");
    }
}
