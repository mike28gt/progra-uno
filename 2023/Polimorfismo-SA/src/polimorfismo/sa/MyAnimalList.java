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
public class MyAnimalList {
    
    private Animal[] animals;
    private int nextIndex;

    public MyAnimalList() {
        animals = new Animal[5];
        nextIndex = 0;
    }
    
    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Se agregó un animal en el índice " + nextIndex);
            nextIndex++;
        }
    }
}
