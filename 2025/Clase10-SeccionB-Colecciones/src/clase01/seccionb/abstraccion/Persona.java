/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.io.Serializable;

/**
 *
 * @author miguelcatalan
 */
public abstract class Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private String identificacion;
    private int edad;
    private char sexo;

    public Persona() { }
    
    public Persona(String nombre, String identificacion, int edad, String apellidos, char sexo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.apellidos = apellidos;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
        else {
            System.err.println("La edad no es válida.");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M') {
            this.sexo = sexo;
        }
        else {
            System.err.println("El sexo es inválido.");
        }
    }
    
    public abstract void mostrarDatos();
    
    /*
    public void mostrarDatos() {
        System.out.println("Datos - " +
                           " Identificacion: " + identificacion +
                           " Nombre: " + nombre +
                           " Apellidos: " + apellidos +
                           " Edad: " + edad + 
                           " Sexo: " + sexo);
    }
    */
}
