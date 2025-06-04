/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public abstract class MiembroUniversidad extends Persona {
    
    private String facultad;
    
    public MiembroUniversidad() { }
    
    public MiembroUniversidad(String nombre, String identificacion, int edad, String apellidos, char sexo, String facultad) {
        super(nombre, identificacion, edad, apellidos, sexo);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    public abstract void mostrarDatos();
/*
    public void mostrarDatos() {
        System.out.println("Miembro de la Universidad - Facultad: " + facultad);
    }
*/
}
