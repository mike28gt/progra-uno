/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.time.LocalDateTime;

/**
 *
 * @author miguelcatalan
 */
public class Conferencia {
    
    private Conferencista conferencista;
    private String nombre;
    private Espacio ubicacion;
    private Persona[] asistentes;
    private int cantidadAsistentes;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFinal;

    public Conferencia() {
        this.cantidadAsistentes = 0;
        this.asistentes = new Persona[ubicacion.getCapacidad()];
    }

    public Conferencia(Conferencista conferencista, String nombre, Espacio ubicacion, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFinal) {
        this.conferencista = conferencista;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadAsistentes = 0;
        this.asistentes = new Persona[ubicacion.getCapacidad()];
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFinal = fechaHoraFinal;
    }

    public Conferencista getConferencista() {
        return conferencista;
    }

    public void setConferencista(Conferencista conferencista) {
        this.conferencista = conferencista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Espacio getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Espacio ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFinal() {
        return fechaHoraFinal;
    }

    public void setFechaHoraFinal(LocalDateTime fechaHoraFinal) {
        this.fechaHoraFinal = fechaHoraFinal;
    }
    
    public void agregarAsistentes(Persona p) {
        if (cantidadAsistentes < ubicacion.getCapacidad()) {
            asistentes[cantidadAsistentes] = p;
            cantidadAsistentes++;
        }
        else {
            System.err.println("El cupo para la conferencia " + this.nombre + " está lleno.");
        }
    }
    
    public void mostrarAsistentes() {
        System.out.println("Listado de Asistentes a: " + this.nombre);
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println(asistentes[i]);
        }
    }

    @Override
    public String toString() {
        return "Conferencia{" + "conferencista=" + conferencista + ", nombre=" + nombre + ", auditorio=" + ubicacion + ", asistentes=" + asistentes + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFinal=" + fechaHoraFinal + '}';
    }
    
    
    
}
