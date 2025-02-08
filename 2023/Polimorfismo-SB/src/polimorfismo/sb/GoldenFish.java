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
public class GoldenFish extends Animal implements Pet {

    public void makeNoise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void roam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
        
    public void beFriendly() {
        System.out.println("I'm friendly!");
    }
    
    public void play() {
        System.out.println("I like to play!");
    }
}
