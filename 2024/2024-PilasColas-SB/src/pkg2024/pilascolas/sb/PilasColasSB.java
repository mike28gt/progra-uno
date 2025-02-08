/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.pilascolas.sb;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author miguelcatalan
 */
public class PilasColasSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Colas
        Queue cola = new LinkedList();
        
        cola.add("Nodo 1");
        cola.add("Nodo 2");
        cola.add("Nodo 3");
        
        System.out.println("Tamaño inicial de la cola: " + cola.size());
        
        while (!cola.isEmpty()) {
            System.out.println(cola.peek() + " Tamaño: " + cola.size());
            System.out.println(cola.poll() + " Tamaño: " + cola.size());
        }
        
        System.out.println("\n");
        
        Stack pila = new Stack();
        
        pila.add("Nodo 1");
        pila.push("Nodo 2");
        pila.push("Nodo 3");
        
        
        System.out.println("Tamaño inicial de la pila: " + pila.size());
        while (!pila.isEmpty()) {
            System.out.println(pila.peek() + " Tamaño: " + pila.size());
            System.out.println(pila.pop() + " Tamaño: " + pila.size());
        }
        
    }
    
}
