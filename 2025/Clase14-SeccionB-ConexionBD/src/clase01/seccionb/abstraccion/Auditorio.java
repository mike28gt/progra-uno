/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Auditorio extends Espacio {

    public Auditorio() {}
    
    public Auditorio(int numero, String ubicacion, int capacidad) {
        super(numero, ubicacion, capacidad);
    }
    
    public void mostrarDatos() {
        //System.out.println("Auditorio - Ubicacion: " + ubicacion + " Número: " + numero + " Capacidad: " + capacidad ");
    }   
}
