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
        Pikachu p1 = new Pikachu("Pikachu", 7);
        p1.atacar();
        System.out.println("El nombre de Pikachu es: " + p1.getNombre());
        */
        Pikachu po1 = new Pikachu("Pika", 8);
        Bulbasaur po2 = new Bulbasaur("Saur", 10);
        //po1.atacar();
        //po2.atacar();
        
        Pikachu [] ap = new Pikachu[10];
        Charizard [] ac = new Charizard[10];
        
        Pokemon [] apo = new Pokemon[10];
        apo[0] = new Aerodactyl("Juan", 10);
        apo[1] = new Gyarados("Pedro", 100);
        
        Ataque a1 = new Ataque();
        a1.atacar(po1); // objeto de tipo Pikachu
        a1.atacar(po2); // objecto de tipo Bulbasaur
        
        //a1.
                
        Object o1 = new Object();
        Object o2 = new Pikachu("P1", 10);
        
        Object [] oList = new Object[10];
        oList[0] = new Aerodactyl("Juan", 10);
        oList[1] = new Gyarados("Pedro", 100);
        
        Object oe1 = oList[0];
        Aerodactyl ae1 = (Aerodactyl)oList[0];
        
        Nadar n1 = new Gyarados("Juan", 1000);
        
        Psyduck ps = new Psyduck("Psyduck", 10);
        //ps.curar();
        ps.atacar();
        
        /*
        Bulbasaur b1 = new Bulbasaur("Bulbasaur", 10);
        b1.atacar();
        System.out.println("El nombre de Bulbasaur es: " + b1.getNombre());
        
        Charizard c1 = new Charizard("Charizard", 100);
        c1.atacar();
        System.out.println("El nombre de Charizard es: " + c1.getNombre());
        */
    }
    
}
