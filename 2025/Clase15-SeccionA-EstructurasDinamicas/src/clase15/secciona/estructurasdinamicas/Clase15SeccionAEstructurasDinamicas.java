/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase15.secciona.estructurasdinamicas;

import clase15.secciona.estructurasdinamicas.listadoblementeenlazada.ListaDoblementeEnlazada;
import clase15.secciona.estructurasdinamicas.listassimplementeenlazadas.ListaSimplementeEnlazada;
import clase15.secciona.estructurasdinamicas.listassimplementeenlazadas.Nodo;

/**
 *
 * @author miguelcatalan
 */
public class Clase15SeccionAEstructurasDinamicas {

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
        
        
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        lde.add(new clase15.secciona.estructurasdinamicas.listadoblementeenlazada.Nodo(1));
        lde.add(new clase15.secciona.estructurasdinamicas.listadoblementeenlazada.Nodo(2));
        lde.add(new clase15.secciona.estructurasdinamicas.listadoblementeenlazada.Nodo(3));
        lde.add(new clase15.secciona.estructurasdinamicas.listadoblementeenlazada.Nodo(4));
        
        lde.mostrar();
        lde.reverse();
    }
    
}
