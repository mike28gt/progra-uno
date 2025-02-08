/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class EmpleadoGerente extends EmpleadoTiempoCompleto {
    
    private float bonificacionPorObjetivosAlcanzados;
    
    public EmpleadoGerente(String nombre, String dpi, float salarioBase, float bonificacion, float bonificacionPorObjetivosAlcanzados) {
        this.setNombre(nombre);
        this.setDpi(dpi);
        this.setSalarioBase(salarioBase);
        this.setBonificacion(bonificacion);
        this.bonificacionPorObjetivosAlcanzados = bonificacionPorObjetivosAlcanzados;
    }
    
    public float calcularSalario() {
        return super.calcularSalario() +
                this.bonificacionPorObjetivosAlcanzados;
    }
    
    public float calcularSalario(int i) {
        return 0f;
    }
    
    public float calcularSalario(int i, int e) {
        return 0f;
    }
        
}
