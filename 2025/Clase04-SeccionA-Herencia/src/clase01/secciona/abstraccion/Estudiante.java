/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante extends Persona {
    
    private Curso [] cursosAsignados;
    private int indice;
    
    public Estudiante(String nombre, String apellidos, char sexo, String carne, int edad) {
        super(nombre, apellidos, edad, sexo, carne);
        System.out.println("Ejecución del constructor de Estudiante.");
        this.indice = 0;
        this.cursosAsignados = new Curso[5];
    }
    
    public void aprender() {
        //System.out.println( nombre + " está aprendiendo");
    }
    
    public void programar() {
        //System.out.println(nombre + " está programando");
    }
    
    public void asignar(Curso curso) {
        curso.asignar(this);
        cursosAsignados[indice] = curso;
        indice++;
    }
    
    public void mostrarCursosAsignados() {
        for (int i = 0; i < indice ; i++) {
            System.out.println(cursosAsignados[i]);
        }
    }
}
