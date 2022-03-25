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
public class Lion extends Feline {
    
    public void makeNoise() {
        System.out.println("Grr!");
    }
    
    public void eat() {
        System.out.println("meat!");
    }
    /*
    public void hunt() {
        System.out.println("I'm hunting!");
    }
    */
    public void hunt(String animalName) {
         System.out.println("I'm hunting a " + animalName);
    }
    
    public void hunt(int qtyAnimals) {
        System.out.println("I have hunt " + qtyAnimals + " animals today");
    }
    
    public String hunt(){
        System.out.println("Sobrecarga con tipo String");
        return "Str";
    }
    
}
