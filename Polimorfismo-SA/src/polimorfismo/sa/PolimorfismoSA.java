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
public class PolimorfismoSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Cat billy = new Cat();
        billy.makeNoise();
        billy.eat();
        billy.roam();
        
        Hippo buble = new Hippo();
        buble.makeNoise();
        buble.eat();
        buble.roam();
        
        Wolf colmilloBlanco = new Wolf();
        colmilloBlanco.setFood("meat");
        colmilloBlanco.setPicture("lobo.jpeg");
        colmilloBlanco.makeNoise();
        colmilloBlanco.eat();
        colmilloBlanco.roam();
        colmilloBlanco.sleep();
        */
        
        // simba = new Lion();
        /*
        simba.hunt();
        simba.hunt("antilope");
        simba.hunt(4);
*/
        //simba.eat();
        
        //Dog myDog = new Dog();
        //myDog.makeNoise();
        
        Canine myDog2 = new Dog();
        Dog myDog3 = new Dog();
        Wolf myWolf = new Wolf();
        
        //myDog2.makeNoise();
        //myWolf.makeNoise();
        //myDog3.makeNoise();
        
        Cat[] gato = new Cat[5];
        Dog[] perro = new Dog[5];
        
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();
        
        Vet vet = new Vet();
        //vet.giveShot(myWolf);
        //vet.giveShot(myDog3);
        
        for (int i = 0; i < animals.length; i++) {
            //animals[i].eat();
            //animals[i].makeNoise();
            vet.giveShot(animals[i]);
        }
        
        
        
        
    }
    
}
