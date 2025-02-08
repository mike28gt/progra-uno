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
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private boolean solvente;
    private Date fechaInscripcion;

    public Estudiante() {
    }

    public Estudiante(String carne, String nombre, String apellido, int edad, char sexo, boolean solvente, Date fechaInscripcion) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.solvente = solvente;
        this.fechaInscripcion = fechaInscripcion;
    }
    
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return "Estudiante{" + "carne=" + carne + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", solvente=" + solvente + ", fechaInscripcion=" + fechaInscripcion + '}';
    }

}
