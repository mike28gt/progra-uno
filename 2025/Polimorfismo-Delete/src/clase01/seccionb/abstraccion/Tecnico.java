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
public class Tecnico extends Visitante {
    
    private String empresa;
    private String telefono;
    
    public Tecnico(String nombre, String identificacion, int edad, String apellidos, char sexo, LocalDate fechaVisita, String motivoVisita, Catedratico responsable, String empresa, String telefono) {
        super(nombre, identificacion, edad, apellidos, sexo, fechaVisita, motivoVisita, responsable);
        this.empresa = empresa;
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void mostrarDatos() {
        System.out.println("Tecnico - empresa: " + empresa + " telefono: " + telefono);
    }
    
    public String toString() {
        return " empresa: " + empresa +
               " telefono: " + telefono;
    }
}
