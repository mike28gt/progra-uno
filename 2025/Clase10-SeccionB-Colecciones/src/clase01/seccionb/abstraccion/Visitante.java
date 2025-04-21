/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.time.LocalDate;

/**
 *
 * @author miguelcatalan
 */
public abstract class Visitante extends Persona{
    
    private LocalDate fechaVisita;
    private String motivoVisita;
    private Catedratico responsable;
    
    public Visitante(String nombre, String identificacion, int edad, String apellidos, char sexo, LocalDate fechaVisita, String motivoVisita, Catedratico responsable) {
        super(nombre, identificacion, edad, apellidos, sexo);
        this.fechaVisita = fechaVisita;
        this.motivoVisita = motivoVisita;
        this.responsable = responsable;
    }
    
    public Visitante() { }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public Catedratico getResponsable() {
        return responsable;
    }

    public void setResponsable(Catedratico responsable) {
        this.responsable = responsable;
    }
    
    public void mostrarDatos() {
        System.out.println("Visitante - Fecha de Visita: " + fechaVisita + " Motivo de Visita: " + motivoVisita + " Responsable: " + responsable);
    }
    
    public String toString() {
        return "fecha de visita: " + fechaVisita +
               "motivo de visita: " + motivoVisita +
               "responsable: " + responsable;
    }
}
