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
    private Curso [] cursosAsignados;
    private int indice;
    
    public Estudiante(String nombre, String apellidos, char sexo, String carne, int edad) {
        System.out.println("Ejecución del constructor de Estudiante.");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.carne = carne;
        this.edad = edad;
        this.indice = 0;
        this.cursosAsignados = new Curso[5];
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
        return apellidos.toUpperCase();
    }

    public void setNombre(String nombre) {
        if (nombre.trim().length() > 0) {
            this.nombre = nombre;
        } else {
            System.err.println("El nombre del estudiante no puede ser un texto vacío.");
        }
    }

    public String getApellidos() {
        return apellidos.toUpperCase();
    }

    public void setApellidos(String apellidos) {
        if (apellidos.trim().length() > 0) {
            this.apellidos = apellidos;
        } else {
            System.err.println("El apellido del estudiante no puede ser un texto vacío.");
        }
    }

    public char getSexo() {
        return Character.toUpperCase(sexo);
    }

    public void setSexo(char sexo) {
        if (Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F') {
            this.sexo = sexo;
        } else {
            System.err.println("El sexo del estudiante debe ser masculino (M) o femenino (F)");
        }
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        if (apellidos.trim().length() > 0) {
            this.carne = carne;
        } else {
            System.err.println("El número de carné no puede ser un texto vacío.");
        }
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
