/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdatosdinamicas.sa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author miguelcatalan
 */
public class EstructurasDatosDinamicasSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
        Queue<String> cola = new LinkedList();
        
        cola.add("Sheyli");
        cola.add("Victor");
        cola.add("Hilary");
        
        System.out.println("Se extrae elemento....");
        cola.poll();
        
        System.out.println("Se extrae elemento....");
        cola.poll();
        
        System.out.println("Se consulta el primero elemento de la lista....");
        System.out.println(cola.peek());
        
        cola.add("Vinicio");
        
        while(!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
       */
       /*
       Stack<String> pila = new Stack();
       
       pila.push("El Principito");
       pila.push("Cien Años de Soledad");
       pila.push("El Hombre Más Rico de Babilonia");
       
       System.out.println("Extrar un elemento...");
       pila.pop();
       
       System.out.println("Se consulta el siguiente elemento a extraer...");
        System.out.println(pila.peek());
               
       
       while (!pila.isEmpty()) {
           System.out.println(pila.pop());
       }
       */
       
       String oracion = "Hola mundo";
       
       oracion = oracion.toLowerCase();
       
       Queue<Character> queue = new LinkedList();
       Stack<Character> stack = new Stack();
       
       for (int i = 0; i < oracion.length(); i++) {
           
           char caracter = oracion.charAt(i);
           
           if (Character.isLetter(caracter)) {
                queue.add(caracter);
                stack.push(caracter);
           }
       }
       
       boolean esPalindromo = true;
       
       while(!queue.isEmpty()) {
           if (queue.poll() != stack.pop()) {
               esPalindromo = false;
           }
       }
       
       if (esPalindromo) {
           System.out.println("es palindromo");
       }
       else {
           System.out.println("no es palindromo");
       }
       
       
       
    }
    
}
