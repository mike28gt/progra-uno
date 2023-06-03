/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdatosdinamicas.sb;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author miguelcatalan
 */
public class EstructurasDatosDinamicasSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Queue<String> cola = new LinkedList();
        
        //Agregar elementos a la cola
        cola.add("Magdalena");
        cola.add("Henry");
        cola.add("Genesis");

        while (!cola.isEmpty()) {
            //Se consulta el siguiente elemento a extraerse
            System.out.println("El siguiente elemento en la cola es: " + cola.peek());
            //Se extraen los elementos de la cola
            System.out.println(cola.poll());
        }
        */
        /*
        Stack<String> pila = new Stack();
        
        //Agregar elementos a la pila
        pila.push("Heartless");
        pila.push("La Divina Comedia");
        pila.push("El Cantar del Mío Cid");
        
        while(!pila.isEmpty()) {
            
            //Consultar el siguiente elemento a extraer
            System.out.println("El siguiente elemento a extraer es: " + pila.peek());
            
            //Extraer elementos de la pila
            System.out.println(pila.pop());
        }
        */
        
        String oracion = "Anna";
        
        oracion = oracion.toLowerCase();
        
        Queue<Character> cola = new LinkedList();
        Stack<Character> pila = new Stack();
        
        for (int i = 0; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);
            
            if (Character.isLetter(caracter)) {
                cola.add(caracter);
                pila.push(caracter);
            }
        }
        
        boolean esPalindromo = true;
        
        while(!cola.isEmpty()) {
        
            if (cola.poll() != pila.pop()) {
                esPalindromo = false;
                break;
            }
        }
        
        if (esPalindromo) {
            System.out.println("Es palindromo");
        }
        else {
            System.out.println("No es palindromo");
        }
    }
    
}
