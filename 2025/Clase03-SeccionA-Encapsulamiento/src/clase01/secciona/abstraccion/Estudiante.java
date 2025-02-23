/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Estudiante {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private String carne;
    private Curso [] cursosAsignados = new Curso[5];
    private int indice;
    
    public Estudiante(String nombre, String apellidos, char sexo, String carne, int edad) {
        System.out.println("Ejecución del constructor de Estudiante.");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.carne = carne;
        this.edad = edad;
        this.indice = 0;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
        else {
            System.err.println("La edad debe ser mayor o igual que 0.");
        }
    }
    
    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return apellidos.toUpperCase() + ", " + nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        this.sexo = sexo;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
    
    

    public void aprender() {
        System.out.println( nombre + " está aprendiendo");
    }
    
    public void programar() {
        System.out.println(nombre + " está programando");
    }
    
    public void asignar(Curso curso) {
        curso.asignar(this);
        cursosAsignados[indice] = curso;
        indice++;
    }
    
    public void mostrarCursosAsignados() {
        for (int i = 0; i < indice ; i++) {
            System.out.println(cursosAsignados[i]);
        }
    }
}
