/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class EmpleadoMedioTiempo extends Empleado {
    private float tarifaHorasExtras;
    private int horasExtrasTrabajadas;
    
    public EmpleadoMedioTiempo(String nombre, String dpi, float salarioBase, float tarifaHorasExtras) {
        this.setNombre(nombre);
        this.setDpi(dpi);
        this.setSalarioBase(salarioBase);
        this.tarifaHorasExtras = tarifaHorasExtras;
    }
    
    public void registrarHorasExtras(int horasExtrasTrabajadas) {
        this.horasExtrasTrabajadas += horasExtrasTrabajadas;
    }
    
    public float calcularSalario() {
        return this.getSalarioBase()+ (this.horasExtrasTrabajadas * this.tarifaHorasExtras);
    }
}
