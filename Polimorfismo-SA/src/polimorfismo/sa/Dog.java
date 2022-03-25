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
public class Dog extends Canine {

    public void makeNoise() {
        System.out.println("Wouf Wouf!");
    }
    
    public void eat() {
        System.out.println("meat!");
    }
}
