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
public class Animal {
    String picture;
    String food;
    int hunger;
    int boundaries[] = new int[2];
    int location [] = new int[2];
    
    void makeNoise() {
        System.out.println("Make sound as an... animal?");
    }
    
    void eat() {
        System.out.println("Eat as an... animal?");
    }
    
    void sleep() {
    }
    
    void roam() {
        System.out.println("Roam as an... animal");
    }
}
