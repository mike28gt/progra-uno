/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase15.seccionb.estructurasdinamicas.listaimplementeenlazada;

/**
 *
 * @author miguelcatalan
 */
public class Nodo {
    private int valor;
    private Nodo nodoSiguiente;

    public Nodo() {
    }

    public Nodo(int valor) {
        this.valor = valor;
    }

    public Nodo(int valor, Nodo nodoSiguiente) {
        this.valor = valor;
        this.nodoSiguiente = nodoSiguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
    
    @Override
    public String toString() {
        return "Valor: " + this.valor;
    }
    
    
}
