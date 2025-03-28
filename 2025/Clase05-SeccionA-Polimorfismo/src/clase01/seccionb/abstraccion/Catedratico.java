/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Catedratico extends MiembroUniversidad {
    private String especialidad;
    private Curso cursosAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;

    public Catedratico(String codigoCatedratico, String nombre, String apellidos, int edad, char sexo, String facultad, String especialidad) {
        super(nombre, codigoCatedratico, edad, apellidos, sexo, facultad);
        this.especialidad = especialidad;
        this.cantidadCursosAsignados = 0;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void asignar(Curso curso) {
        this.cursosAsignados[cantidadCursosAsignados] = curso;
        curso.setCatedratico(this);
        cantidadCursosAsignados++;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println(" Nombre: " + super.getNombre() + 
                    " Apellido: " + super.getApellidos() + 
                    " Edad: " + super.getEdad() +
                    " Sexo: " + super.getSexo());
    }
    
    public String toString() {
        return "";
        /*
        return "Código de Catedrático: " + this.codigoCatedratico + 
               " Nombre: " + this.nombre + 
               " Apellido: " + this.apellidos;
        */
    }
    
}
