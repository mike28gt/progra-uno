/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudexample;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante {
    private String numeroCarne;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

    public Estudiante() {
    }
    
    public Estudiante(String numeroCarne, String nombre, String apellido, int edad, char sexo) {
        this.numeroCarne = numeroCarne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNumeroCarne() {
        return numeroCarne;
    }

    public void setNumeroCarne(String numeroCarne) {
        this.numeroCarne = numeroCarne;
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
    
    @Override
    public String toString() {
        return "Datos de estudiante: Carne: " + getNumeroCarne() + " Nombre: " + getNombre() +  " Apellido: " + getApellido() + " Edad: " + getEdad() + " Sexo: " + getSexo();
    }
}
