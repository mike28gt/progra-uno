/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Curso {
    private int codigo;
    private String nombre;
    private Catedratico catedratico;
    private Estudiante listadoEstudiantes[] = new Estudiante[50];
    private int cantidadEstudiantes;
    
    public Curso(int codigo, String nombre, Catedratico catedratico) {
        System.out.println("Se ejecuta el constructor de curso");
        this.codigo = codigo;
        this.nombre = nombre;
        this.catedratico = catedratico;
        this.cantidadEstudiantes = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        this.listadoEstudiantes[cantidadEstudiantes] = estudiante;
        cantidadEstudiantes++;
    }
    
    public void mostrarEstudiantesAsignados() {
    
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(this.listadoEstudiantes[i]);
        }
    }
}
