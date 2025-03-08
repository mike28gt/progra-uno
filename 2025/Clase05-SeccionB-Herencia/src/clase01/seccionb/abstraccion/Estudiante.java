/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante extends Persona {
    private Curso cursosAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;

    public Estudiante(String carne, String nombre, String apellidos, int edad, char sexo) {
        super(nombre, carne, edad, apellidos, sexo);
        this.cantidadCursosAsignados = 0;
    }
    
    public void inscribir() {
        System.out.println("El estudiante se inscribe");    
    }
    
    public void asignar(Curso curso) {
        this.cursosAsignados[cantidadCursosAsignados] = curso;
        curso.agregarEstudiante(this);
        cantidadCursosAsignados++;
        System.out.println("El estudiante se asigna");
    }
    
    public void pagar() {
        System.out.println("El estudiante paga");
    }
    
    /*
    public String toString() {
        return "Carne: " + this.carne + 
               " Nombre: " + this.nombre + 
               " Apellido: " + this.apellidos;
    }
    */
}
