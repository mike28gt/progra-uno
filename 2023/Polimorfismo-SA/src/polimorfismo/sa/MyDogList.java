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
public class MyDogList {
    
    private Dog[] dogs;
    private int nextIndex;

    public MyDogList() {
        dogs = new Dog[5];
        nextIndex = 0;
    }
    
    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Se agregó el perro en el índice " + nextIndex);
            nextIndex++;
        }
    }
}
