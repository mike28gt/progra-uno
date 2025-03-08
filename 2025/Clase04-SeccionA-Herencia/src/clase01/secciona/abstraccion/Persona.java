/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private String identificacion;

    public Persona(String nombre, String apellidos, int edad, char sexo, String identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.identificacion = identificacion;
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
            System.err.println("El nombre no puede ser un texto vacío.");
        }
    }

    public String getApellidos() {
        return apellidos.toUpperCase();
    }

    public void setApellidos(String apellidos) {
        if (apellidos.trim().length() > 0) {
            this.apellidos = apellidos;
        } else {
            System.err.println("El apellido no puede ser un texto vacío.");
        }
    }

    public char getSexo() {
        return Character.toUpperCase(sexo);
    }

    public void setSexo(char sexo) {
        if (Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F') {
            this.sexo = sexo;
        } else {
            System.err.println("El sexo debe ser masculino (M) o femenino (F)");
        }
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (apellidos.trim().length() > 0) {
            this.identificacion = identificacion;
        } else {
            System.err.println("El número de identifiación no puede ser un texto vacío.");
        }
    }
}
