/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante {
    private String carne;
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private Curso cursosAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;

    public Estudiante(String carne, String nombre, String apellidos, int edad, char sexo) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.cantidadCursosAsignados = 0;
    }
    
    public String getNombre() {
        return this.nombre.toUpperCase();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
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
        if (edad > 0) {
            this.edad = edad;
        }
        else {
            System.err.println("La edad no es válida.");
        }
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
    
    public void inscribir() {
        System.out.println("El estudiante se inscribe");    
    }
    
    public void asignar(Curso curso) {
        this.cursosAsignados[cantidadCursosAsignados] = curso;
        curso.agregarEstudiante(this);
        cantidadCursosAsignados++;
        System.out.println("El estudiante se asigna");
    }
    
    public void pagar() {
        System.out.println("El estudiante paga");
    }
    
    
    public String toString() {
        return "Carne: " + this.carne + 
               " Nombre: " + this.nombre + 
               " Apellido: " + this.apellidos;
    }
}
