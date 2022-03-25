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
public class Canine extends Animal {
    
    
    public void setFood(String food) {
        System.out.println("Aquí se sobrescribe (override) el método setFood(String food)");
    }
    
    public void roam() {
        System.out.println("Walk with my pack...");
    }
    
}
