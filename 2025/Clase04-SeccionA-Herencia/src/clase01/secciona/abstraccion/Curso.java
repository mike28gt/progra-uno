/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Curso {
    private int codigo;
    private String nombre;
    private String catedratico;
    private Estudiante [] listadoEstudiantes = new Estudiante[50];
    private int indice;
    private Catedratico [] listadoCatedraticos = new Catedratico[5];
    private int indiceCatedratico;

    public Curso(int codigo, String nombre, String catedratico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.catedratico = catedratico;
        this.indice = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 0) {
            this.codigo = codigo;
        } else {
            System.err.println("El código debe ser un número entero mayor que 0.");
        }
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        if (nombre.trim().length() > 0) {
            this.nombre = nombre;
        } else {
            System.err.println("El nombre del curso no puede ser un texto vacío.");
        }
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        if (nombre.trim().length() > 0){
            this.catedratico = catedratico;
        } else {
            System.err.println("El nombre del catedrático no puede ser un texto vacío.");
        }
    }

    void asignar(Estudiante estudiante) {
        listadoEstudiantes[indice] = estudiante;
        indice++;
    }
    
    void asignarCatedratico(Catedratico catedratico) {
        listadoCatedraticos[indiceCatedratico] = catedratico;
        indiceCatedratico++;
    }
    
    public String toString() {
        return "Código de curso: " + this.codigo +
               " Nombre: " + this.nombre +
               " Catedrático: " + this.catedratico;
    }
}
