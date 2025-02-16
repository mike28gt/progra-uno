/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante {
    
    String nombre;
    String apellidos;
    int edad;
    char sexo;
    String carne;
    Curso [] cursosAsignados = new Curso[5];
    int indice;
    
    public Estudiante(String nombre, String apellidos, char sexo, String carne, int edad) {
        System.out.println("Ejecución del constructor de Estudiante.");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.carne = carne;
        this.edad = edad;
        this.indice = 0;
    }

    void aprender() {
        System.out.println( nombre + " está aprendiendo");
    }
    
    void programar() {
        System.out.println(nombre + " está programando");
    }
    
    void asignar(Curso curso) {
        curso.asignar(this);
        cursosAsignados[indice] = curso;
        indice++;
    }
    
    void mostrarCursosAsignados() {
        for (int i = 0; i < indice ; i++) {
            System.out.println(cursosAsignados[i]);
        }
    }
}
