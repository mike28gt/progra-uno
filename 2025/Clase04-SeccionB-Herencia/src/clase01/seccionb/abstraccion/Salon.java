/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Salon {
    private int numero;
    private String ubicacion;
    private int capacidad;
    private Curso [] listadoCursos;
    private int cantidadCursosAsignados;

    public Salon(int numero, String ubicacion, int capacidad) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.listadoCursos = new Curso[10];
        this.cantidadCursosAsignados = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void asignarCurso(Curso curso) {
        this.listadoCursos[cantidadCursosAsignados] = curso;
        cantidadCursosAsignados++;
    }
    
}
