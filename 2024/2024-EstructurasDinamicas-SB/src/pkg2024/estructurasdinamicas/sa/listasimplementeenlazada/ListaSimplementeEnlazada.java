/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.estructurasdinamicas.sa.listasimplementeenlazada;

/**
 *
 * @author miguelcatalan
 */
public class ListaSimplementeEnlazada {
    private Nodo inicio;
    private Nodo fin;
    private int tamaño;

    public ListaSimplementeEnlazada() {
        this.inicio = null;
        this.fin = null;
        this.tamaño = 0;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void agregarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        tamaño++;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public int getTamaño() {
        return tamaño;
    }

    // Método para mostrar los elementos de la lista
    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo actual = inicio;
            while (actual != null) {
                System.out.print(actual.getDato() + " ");
                actual = actual.getSiguiente();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
