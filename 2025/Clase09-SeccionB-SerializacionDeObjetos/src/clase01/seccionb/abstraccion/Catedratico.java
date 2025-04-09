/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Catedratico extends MiembroUniversidad implements AsignarCurso, GenerarToken {
    private String especialidad;
    private Curso cursosAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;

    public Catedratico(String codigoCatedratico, String nombre, String apellidos, int edad, char sexo, String especialidad, String facultad) {
        super(nombre, codigoCatedratico, edad, apellidos, sexo, facultad);
        this.especialidad = especialidad;
        this.cantidadCursosAsignados = 0;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public void asignar(Curso curso) {
        this.cursosAsignados[cantidadCursosAsignados] = curso;
        curso.setCatedratico(this);
        cantidadCursosAsignados++;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("facultad: " + super.getFacultad() +
                " nombre: " + super.getNombre() + 
                " apellidos: " + super.getApellidos() +
                " especialidad: " + this.especialidad + 
                " carné: " + super.getIdentificacion() + 
                " sexo: " + super.getSexo() +
                " edad: " + super.getEdad());
    }
    
    @Override
    public String toString() {
        return "Código de Catedrático: " + this.getIdentificacion() + 
               " Nombre: " + super.getNombre() + 
               " Apellido: " + getApellidos();
    }
    
    @Override
    public void generar() {
        System.out.println("Catedrativo - Generar");
    }
    
}
