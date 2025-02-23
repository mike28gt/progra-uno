/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Catedratico extends Persona {
    private String facultad;
    private Curso cursosAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;

    public Catedratico(String codigoCatedratico, String nombre, String apellidos, int edad, char sexo, String facultad) {
        super(nombre, codigoCatedratico, edad, apellidos, sexo);
        this.facultad = facultad;
        this.cantidadCursosAsignados = 0;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    public void asignarCurso(Curso curso) {
        this.cursosAsignados[cantidadCursosAsignados] = curso;
        curso.setCatedratico(this);
        cantidadCursosAsignados++;
        System.out.println("El catedrático se asigna");
    }
    
    /*
    public String toString() {
        return "Código de Catedrático: " + this.codigoCatedratico + 
               " Nombre: " + this.nombre + 
               " Apellido: " + this.apellidos;
    }
    */
}
