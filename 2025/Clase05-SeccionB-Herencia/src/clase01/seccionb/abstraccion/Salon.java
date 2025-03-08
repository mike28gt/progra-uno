/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Salon extends Espacio {
    private Curso [] listadoCursos;
    private int cantidadCursosAsignados;

    public Salon(int numero, String ubicacion, int capacidad) {
        super(numero, ubicacion, capacidad);
        this.listadoCursos = new Curso[10];
        this.cantidadCursosAsignados = 0;
    }
    
    public void asignarCurso(Curso curso) {
        this.listadoCursos[cantidadCursosAsignados] = curso;
        cantidadCursosAsignados++;
    }
    
}
