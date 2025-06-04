/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase15.seccionb.estructurasdinamicas.listaimplementeenlazada;

/**
 *
 * @author miguelcatalan
 */
public class ListaSimplementeEnlazada {
    private Nodo inicio;
    private Nodo fin;
    private int size;

    public ListaSimplementeEnlazada() {
        this.size = 0;
        this.inicio = null;
        this.fin = null;
    }
    
    public int getSize() {
        return size;
    }
    
    public void add(Nodo nuevoNodo) {
        if (this.size == 0 ) {
            this.inicio = nuevoNodo;
            this.fin = nuevoNodo;
        } else {
            this.fin.setNodoSiguiente(nuevoNodo);
            this.fin = nuevoNodo;
        }
        this.size++;
    }
    
    public void mostrar() {
        if (this.size > 0) {
            Nodo n = this.inicio;
            
            while (n != null) {
                System.out.println(n);
                n = n.getNodoSiguiente();
            }
        }
    }
    
    public Nodo get() {
        return this.inicio;
    }
}
