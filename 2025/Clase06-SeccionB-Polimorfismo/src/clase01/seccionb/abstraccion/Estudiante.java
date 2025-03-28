/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante extends MiembroUniversidad {
    private Curso cursosAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;

    public Estudiante() { }
    
    public Estudiante(String carne, String nombre, String apellidos, int edad, char sexo, String facultad) {
        super(nombre, carne, edad, apellidos, sexo, facultad);
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
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" nombre: " + super.getNombre() + 
                " apellidos: " + super.getApellidos() +
                " carné: " + super.getIdentificacion() + 
                " sexo: " + super.getSexo() +
                " edad: " + super.getEdad());
    }
    
    @Override
    public String toString() {
        return "Carne: " + super.getIdentificacion() + 
               " Nombre: " + super.getNombre() + 
               " Apellido: " + this.getApellidos();
    }
}
