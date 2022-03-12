/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.sb;

/**
 *
 * @author miguelcatalan
 */
public class Wolf extends Canine {
    public void makeNoise() {
        System.out.println("Ahuuuuuu!!!");
    }
    
    public void eat() {
        System.out.println("I'm eating meet!");
    }
    
    public void hunt() {
        System.out.println("I'm hunting!");
    }
    
    public void hunt(String animalName) {
        System.out.println("I'm hunting a " + animalName);
    }
    
    public void hunt(int qtyAnimals) {
        System.out.println("I've hounted " + qtyAnimals + " animals today");
    }
}
