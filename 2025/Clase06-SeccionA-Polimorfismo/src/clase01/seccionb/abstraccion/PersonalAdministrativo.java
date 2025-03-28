/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class PersonalAdministrativo extends MiembroUniversidad implements GenerarIdentificacion {
    
    @Override
    public void mostrarDatos() {
        System.out.println("Datos Personal Administrativo");
    }
    
    @Override
    public void generarIdInterno() {
        System.out.println("Generar Id Interno Personal Administrativo");
    }
}
