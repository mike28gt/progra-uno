/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento.sb;

/**
 *
 * @author miguelcatalan
 */
public class EncapsulamientoSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog dog = new Dog();
        /*
        dog.breed = "Labradoodle";
        dog.name = "Jacinto";
        dog.size = 50;
        */
        dog.setBreed("Labradoodle");
        dog.setName("Jacinto");
        dog.setSize(10);
        
        System.out.println(dog.getName());
               
        dog.bark();
    }
    
}
