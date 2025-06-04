/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante extends MiembroUniversidad implements AsignarCursos {
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
    
    @Override
    public void asignar(Curso curso) {
        this.cursosAsignados[cantidadCursosAsignados] = curso;
        curso.agregarEstudiante(this);
        cantidadCursosAsignados++;
    }
    
    public void pagar() {
        System.out.println("El estudiante paga");
    }
    
    
    public void mostrarDatos() {
        //super.mostrarDatos();
        System.out.println(" Nombre: " + super.getNombre() + 
                            " Apellido: " + super.getApellidos() + 
                            " Edad: " + super.getEdad() +
                            " Sexo: " + super.getSexo());
    }

    @Override
    public String toString() {
        return "Carne: " + super.getIdentificacion() + 
               " Nombre: " + super.getNombre() + 
               " Apellido: " + super.getApellidos();
    }
}
