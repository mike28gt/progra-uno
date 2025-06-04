/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase15.secciona.estructurasdinamicas.listadoblementeenlazada;

/**
 *
 * @author miguelcatalan
 */
public class Nodo {
    private int valor;
    private Nodo nodoSiguiente;
    private Nodo nodoAnterior;

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

    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
    @Override
    public String toString() {
        return "Valor: " + this.valor;
    }
    
    
}
