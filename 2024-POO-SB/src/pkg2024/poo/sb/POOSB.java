/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.poo.sb;

/**
 *
 * @author miguelcatalan
 */
public class POOSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int var1 = 12;
        Radio radio1 = new Radio();
        radio1.setEmisora(98.1f);
        radio1.setFrecuencia("FM");
        radio1.subirVolumen();
        System.out.println("Emisora radio 1: " + 
                radio1.getEmisora() + 
                " " + 
                radio1.getFrecuencia());
     
        Radio radio2 = new Radio();
        radio2.setEmisora(-100.9f);
        radio2.setFrecuencia("AM");
        System.out.println("Emisora radio 2: " + 
                radio2.getEmisora() + 
                " " + 
                radio2.getFrecuencia());
        
        
    }
    
}
