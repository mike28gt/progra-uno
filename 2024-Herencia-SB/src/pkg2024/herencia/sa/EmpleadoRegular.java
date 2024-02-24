/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class EmpleadoRegular extends EmpleadoTiempoCompleto {
    
    public EmpleadoRegular(String nombre, String dpi, float salarioBase, float bonificacion) {
        this.setNombre(nombre);
        this.setDpi(dpi);
        this.setSalarioBase(salarioBase);
        this.setBonificacion(bonificacion);
    }

}
