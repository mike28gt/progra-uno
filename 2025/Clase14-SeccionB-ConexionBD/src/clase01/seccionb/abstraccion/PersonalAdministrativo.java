/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class PersonalAdministrativo extends MiembroUniversidad implements GenerarToken {
    
    @Override
    public void mostrarDatos() {
        System.out.println("Personal Administrativo - Mostrar Datos");
    }
    
    @Override
    public void generar() {
        System.out.println("Personal Administrativo - Generar");
    }
}
