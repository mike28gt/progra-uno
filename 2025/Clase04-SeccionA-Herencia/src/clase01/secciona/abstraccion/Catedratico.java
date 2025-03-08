/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Catedratico extends Persona {
    
    private Curso [] cursosAsignados;
    private int indice;
    
    public Catedratico(String nombre, String apellidos, char sexo, 
                        String codigoCatedratico, int edad) {
        super(nombre, apellidos, edad, sexo, codigoCatedratico);
        this.indice = 0;
        this.cursosAsignados = new Curso[5];
    }
     
    public void asignar(Curso curso) {
        curso.asignarCatedratico(this);
        cursosAsignados[indice] = curso;
        indice++;
    }
    
    public void mostrarCursosAsignados() {
        for (int i = 0; i < indice ; i++) {
            System.out.println(cursosAsignados[i]);
        }
    }
}
