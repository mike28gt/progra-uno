/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.sb;

/**
 *
 * @author miguelcatalan
 */
public class PolimorfismoSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Dog billy = new Dog();
        billy.picture = "dog.jpeg";
        billy.makeNoise();
        billy.roam();
        billy.eat();
        
        Hippo bubble = new Hippo();
        bubble.picture = "foto_de_hipopotamo.jpeg";
        bubble.makeNoise();
        bubble.roam();
        bubble.eat();*/
        /*
        Wolf colmilloBlanco = new Wolf();
        colmilloBlanco.makeNoise();
        colmilloBlanco.eat();
        colmilloBlanco.sleep();
        colmilloBlanco.roam();
        
        colmilloBlanco.hunt();
        colmilloBlanco.hunt("rabbit");
        colmilloBlanco.hunt(4);
        */
        
        Dog myDog = new Dog();
        Canine myDog2 = new Dog();
        Animal myDog3 = new Dog();
        
        /*
        myDog.makeNoise();
        myDog2.makeNoise();
        myDog3.makeNoise();
        */
        
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog();
        Cat[] cats = new Cat[5];
        cats[0] = new Cat();
        
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();
        
        Vet vet = new Vet();
        /*
        vet.giveShot(new Dog());
        vet.giveShot(new Cat());
        vet.giveShot(new Hippo());
        */
        
        
        for (int i = 0; i < animals.length; i++) {
            //animals[i].eat();
            //animals[i].makeNoise();
            //vet.giveShot(animals[i]);
        }
        
        Animal a = new Dog();
        a.eat();
        a.makeNoise();
        
        
        
        
        
        
        
    }
    
/*
Make noise as an... animal?
Eat as an... animal?
Make noise as an... animal?
Eat as an... animal?
*/
}
