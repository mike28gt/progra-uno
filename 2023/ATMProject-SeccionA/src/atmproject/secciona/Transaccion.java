/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public abstract class Transaccion {
    private int monto;

    public int getMonto() {
        System.out.println("Se obtiene el monto de la clase Transaccion");
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
        System.out.println("Se asigna un valor al monto de la clase Transaccion");
    }
    
    public void ejecutar() {
        System.out.println("Se ejecuta el método ejecutar() de la clase Trasaccion");
    }
}
