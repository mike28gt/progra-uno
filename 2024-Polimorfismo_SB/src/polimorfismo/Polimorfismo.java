/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author miguelcatalan
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Pikachu p1 = new Pikachu("Pikachu", 10);
        p1.atacar();
        */
        Pokemon po1 = new Pikachu("Pika", 10);
        po1.atacar();
        Pokemon po2 = new Bulbasaur("Saur", 10);
        po2.atacar();
        Pokemon po3 = new Gyarados("Gyarados", 1000);
        po3.atacar();
        
        Ivysaur i1 = new Ivysaur("Ivysaur", 100);
        i1.atacar();
        
        Eevee e1 = new Eevee("Eevee", 10);
        e1.atacar();
        
        Pikachu [] ap1 = new Pikachu[10];
        Bulbasaur [] ab1 = new Bulbasaur[10];
        
        Pokemon [] pp1 = new Pokemon[10];
        pp1[0] = new Gyarados("Gyarados", 1000);
        pp1[1] = new Bulbasaur("Saur", 10);
        pp1[2] = new Pikachu("Pika", 10);
        
        //Pikachu p3 = pp1[2];
        Pokemon pp2 = pp1[2];
        pp2.atacar();
        
        Object o1 = new Object();
        
        Object [] ao1 = new Object[10];
        ao1[0] = new Gyarados("Gyarados", 1000);
        ao1[1] = new Bulbasaur("Saur", 10);
        ao1[2] = new Pikachu("Pika", 10);

        Bulbasaur b1 = (Bulbasaur)ao1[1];
        b1.atacar();
        
        Ataque a = new Ataque();
        a.atacar(new Bulbasaur("d", 12));
        a.atacar(new Pikachu("d", 12));
        a.atacar(new Gyarados("d", 12));
        
        Agua [] aa1 = new Agua[0];
        aa1[0] = new Gyarados("", 12);
        aa1[1] = new Bulbasaur("", 12);
        /*
        Bulbasaur b1 = new Bulbasaur("Bulbasaur", 10);
        b1.atacar();
        
        Pokemon po1 = new Pokemon("Que?", -1);
        po1.atacar();
        */
        
        
    }
    
}
