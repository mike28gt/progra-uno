/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

/**
 *
 * @author miguelcatalan
 */
public abstract class Transaccion {
    
    private int monto;
    
    public void ejecutar(int monto) {
        System.out.println("Transaccion.ejecutar()");
    }
    
}
