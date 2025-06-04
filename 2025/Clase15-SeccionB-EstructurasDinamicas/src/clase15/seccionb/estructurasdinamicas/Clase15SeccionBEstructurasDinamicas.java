/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase15.seccionb.estructurasdinamicas;

import clase15.seccionb.estructurasdinamicas.listaimplementeenlazada.ListaSimplementeEnlazada;
import clase15.seccionb.estructurasdinamicas.listaimplementeenlazada.Nodo;

/**
 *
 * @author miguelcatalan
 */
public class Clase15SeccionBEstructurasDinamicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
        lse.add(new Nodo(1));
        lse.add(new Nodo(2));
        lse.add(new Nodo(3));
        lse.add(new Nodo(4));
        
        lse.mostrar();
    }
    
}
