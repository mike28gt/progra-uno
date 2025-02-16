/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Curso {
    int codigo;
    String nombre;
    String catedratico;
    Estudiante [] listadoEstudiantes = new Estudiante[50];
    int indice;

    public Curso(int codigo, String nombre, String catedratico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.catedratico = catedratico;
        this.indice = 0;
    }

    void asignar(Estudiante estudiante) {
        listadoEstudiantes[indice] = estudiante;
        indice++;
    }
    
    
    public String toString() {
        return "Código de curso: " + this.codigo +
               " Nombre: " + this.nombre +
               " Catedrático: " + this.catedratico;
    }
}
