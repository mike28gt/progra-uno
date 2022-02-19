/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion.sa;

/**
 *
 * @author miguelcatalan
 */
public class AbstraccionSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog dog = new Dog();
        
        dog.breed = "Labradoodle";
        dog.name = "Jacinto";
        dog.size = 50;
        dog.bark();
    }
    
}
