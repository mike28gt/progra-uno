/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public abstract class Espacio {
    private int numero;
    private String ubicacion;
    private int capacidad;

    public Espacio() {}
    
    public Espacio(int numero, String ubicacion, int capacidad) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void mostrarDatos() {
        System.out.println("Espacio - Ubicacion: " + ubicacion + " Número: " + numero + " Capacidad: " + capacidad );
    }
    
}
