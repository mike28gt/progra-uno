/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.pilascolas.sa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author miguelcatalan
 */
public class PilasColasSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Cola
        Queue cola = new LinkedList();
        
        cola.add("Nodo 1");
        cola.add("Nodo 2");
        cola.add("Nodo 3");
        
        while (!cola.isEmpty()) {
            System.out.println(cola.poll() + " Tamaño: " + cola.size() );
        }
        
        //Pilas
        Stack pila = new Stack();
        
        pila.push("Nodo 1");
        pila.push("Nodo 2");
        pila.push("Nodo 3");
       
        
        while(!pila.isEmpty()) {
            System.out.println(pila.pop() + " Tamaño: " + pila.size());
        }
        
    }
    
}
