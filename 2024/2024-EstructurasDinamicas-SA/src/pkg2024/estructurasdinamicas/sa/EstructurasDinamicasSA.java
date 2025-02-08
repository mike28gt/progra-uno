/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.estructurasdinamicas.sa;

import pkg2024.estructurasdinamicas.sa.listacircular.ListaCircular;
import pkg2024.estructurasdinamicas.sa.listacircular.Nodo;
import pkg2024.estructurasdinamicas.sa.listadoblementeenlazada.ListaDoblementeEnlazada;
import pkg2024.estructurasdinamicas.sa.listasimplementeenlazada.ListaSimplementeEnlazada;

/**
 *
 * @author miguelcatalan
 */
public class EstructurasDinamicasSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        listaSimplementeEnlazada.agregarNodo(10);
        listaSimplementeEnlazada.agregarNodo(20);
        listaSimplementeEnlazada.agregarNodo(30);
        listaSimplementeEnlazada.mostrarLista();  // Debería imprimir: 10 20 30
        
        
        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        listaDoblementeEnlazada.agregarNodo(10);
        listaDoblementeEnlazada.agregarNodo(20);
        listaDoblementeEnlazada.agregarNodo(30);
        
        System.out.print("Lista desde el inicio: ");
        listaDoblementeEnlazada.mostrarListaDesdeInicio();  // Debería imprimir: 10 20 30
        
        System.out.print("Lista desde el fin: ");
        listaDoblementeEnlazada.mostrarListaDesdeFin();  // Debería imprimir: 30 20 10
        
        
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.agregarNodo(10);
        listaCircular.agregarNodo(20);
        listaCircular.agregarNodo(30);
        //listaCircular.mostrarLista();  // Debería imprimir: 10 20 30
        
        Nodo nodo = listaCircular.getInicio();
        
        for (int i = 0; i < 10; i++) {
            System.out.print(nodo.getDato() + " ");
            nodo = nodo.getSiguiente();
        }
    }
    
}
