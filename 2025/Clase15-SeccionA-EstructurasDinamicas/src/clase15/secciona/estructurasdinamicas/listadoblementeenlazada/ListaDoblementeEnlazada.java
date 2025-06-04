/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase15.secciona.estructurasdinamicas.listadoblementeenlazada;

/**
 *
 * @author miguelcatalan
 */
public class ListaDoblementeEnlazada {
    private Nodo inicio;
    private Nodo fin;
    private int size;

    public ListaDoblementeEnlazada() {
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
            nuevoNodo.setNodoAnterior(fin);
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
    
    public void reverse() {
        if (this.size > 0) {
            Nodo n = this.fin;
            
            while (n != null) {
                System.out.println(n);
                n = n.getNodoAnterior();
            }
        }
    }
    
    public Nodo get() {
        return this.inicio;
    }
}
