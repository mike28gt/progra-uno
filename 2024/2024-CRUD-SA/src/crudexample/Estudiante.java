/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudexample;

import java.sql.Date;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante {
    private String carne;
    private String nombres;
    private String apellidos;
    private int edad;
    private char sexo;
    private boolean solvente;
    private Date fechaInscripcion;

    public Estudiante() {
    }

    public Estudiante(String carne, String nombres, String apellidos, int edad, char sexo, boolean solvente, Date fechaGrabacion) {
        this.carne = carne;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.solvente = solvente;
        this.fechaInscripcion = fechaGrabacion;
    }
    
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isSolvente() {
        return solvente;
    }

    public void setSolvente(boolean solvente) {
        this.solvente = solvente;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carne=" + carne + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + ", solvente=" + solvente + ", fechaGrabacion=" + fechaInscripcion + '}';
    }


}
