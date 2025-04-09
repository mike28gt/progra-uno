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
    private Espacio ubicacion;
    private String nombre;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Persona [] asistentes;
    private int cantidadAsistentes;

    public Conferencia() {
        cantidadAsistentes = 0;
        asistentes = new Persona[ubicacion.getCapacidad()];
    }

    public Conferencia(Conferencista conferencista, Espacio ubicacion, String nombre, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoFin) {
        this.conferencista = conferencista;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoFin;
        cantidadAsistentes = 0;
        asistentes = new Persona[ubicacion.getCapacidad()];
    }

    public Conferencista getConferencista() {
        return conferencista;
    }

    public void setConferencista(Conferencista conferencista) {
        this.conferencista = conferencista;
    }

    public Espacio getUbicacion() {
        //return new Salon();
        //return new Auditorio();
        return ubicacion;
    }

    public void setUbicacion(Espacio ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public void agregarAsistentes(Persona p) {
        if (cantidadAsistentes < ubicacion.getCapacidad()) {
            asistentes[cantidadAsistentes] = p;
            cantidadAsistentes++;
        } 
        else {
            System.err.println("El cupo para la conferencia " + this.nombre + " está agotado.");
        }
    }
    
    public void mostrarAsistentes() {
        System.out.println("Listado de Asistentes a: " + this.nombre);
        for (int i = 0; i < cantidadAsistentes; i++ ) {
            System.out.println(asistentes[i]);
        }
    }
    
    @Override
    public String toString() {
        return "Conferencia{" + "conferencista=" + conferencista + ", ubicacion=" + ubicacion + ", nombre=" + nombre + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoFin=" + fechaHoraFin + '}';
    }
    
    
    
}
