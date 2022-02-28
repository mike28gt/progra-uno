/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.sb;

/**
 *
 * @author miguelcatalan
 */
public class HerenciaSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog billy = new Dog();
        billy.picture = "dog.jpeg";
        billy.makeNoise();
        billy.roam();
        billy.eat();
        
        Hippo bubble = new Hippo();
        bubble.picture = "foto_de_hipopotamo.jpeg";
        bubble.makeNoise();
        bubble.roam();
        bubble.eat();
        
    }
    
/*
Make noise as an... animal?
Eat as an... animal?
Make noise as an... animal?
Eat as an... animal?
*/
}
