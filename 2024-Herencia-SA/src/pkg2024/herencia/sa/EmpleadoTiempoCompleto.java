/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class EmpleadoTiempoCompleto extends Empleado {
    private float bonificacion;
    /*
    public EmpleadoTiempoCompleto(String nombre, String dpi, float salarioBase, float bonificacion) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }
*/
    
    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public float calcularSalario() {
        return super.calcularSalario()+ 
                this.getBonificacion();
    }
}
