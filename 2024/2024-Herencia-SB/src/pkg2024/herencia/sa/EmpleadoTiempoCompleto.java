/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class EmpleadoTiempoCompleto {
    private String nombre;
    private String dpi;
    private float salarioBase;
    private float bonificacion;
    
    /*
    public EmpleadoTiempoCompleto(String nombre, String dpi, float salarioBase, float bonificacion) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }
*/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    
    
    public float calcularSalario() {
        return this.salarioBase + this.bonificacion;
    }
    
}
