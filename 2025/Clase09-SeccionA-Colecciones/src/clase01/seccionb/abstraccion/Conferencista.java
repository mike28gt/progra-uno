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
public class Conferencista extends Visitante {
    
    private String temaConferencia;
    
    public Conferencista(String nombre, String identificacion, int edad, String apellidos, char sexo, LocalDate fechaVisita, String motivoVisita, Catedratico responsable, String temaConferencia) {
        super(nombre, identificacion, edad, apellidos, sexo, fechaVisita, motivoVisita, responsable);
        this.temaConferencia = temaConferencia;
    }

    public String getTemaConferencia() {
        return temaConferencia;
    }

    public void setTemaConferencia(String temaConferencia) {
        this.temaConferencia = temaConferencia;
    }
    
    public void mostrarDatos() {
        System.out.println("Conferencista - Tema Conferencia: " + temaConferencia);
    }
    
    public String toString() {
        return " temaConferencia: " + temaConferencia;
    }
}
