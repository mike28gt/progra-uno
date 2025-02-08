/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Curso {
    int codigo;
    String nombre;
    String catedratico;
    Estudiante listadoEstudiantes[] = new Estudiante[50];
    int cantidadEstudiantes;
    
    Curso(int codigo, String nombre, String catedratico) {
        System.out.println("Se ejecuta el constructor de curso");
        this.codigo = codigo;
        this.nombre = nombre;
        this.catedratico = catedratico;
        this.cantidadEstudiantes = 0;
    }
    
    void agregarEstudiante(Estudiante estudiante) {
        this.listadoEstudiantes[cantidadEstudiantes] = estudiante;
        cantidadEstudiantes++;
    }
    
    void mostrarEstudiantesAsignados() {
    
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(this.listadoEstudiantes[i]);
        }
    }
}
